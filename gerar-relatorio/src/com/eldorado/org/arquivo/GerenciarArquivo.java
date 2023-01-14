package com.eldorado.org.arquivo;

import com.eldorado.org.modelo.Faturamento;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GerenciarArquivo {
    private static final Logger LOGGER = Logger.getLogger(GerenciarArquivo.class.getName());
    static final String CAMINHO = "resources/txt/";
    public List<Faturamento> lerArquivo(String nomeArquivo) {
        List<Faturamento> faturamentos = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.format("%s/%s", CAMINHO, nomeArquivo)))) {
            bufferedReader.readLine();
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] vetor = line.split(";");
                var faturamento = new Faturamento();

                if (vetor.length == 9) {
                    faturamento.setEmpresa(vetor[0]);
                    faturamento.setMes(vetor[1]);
                    faturamento.setAno(vetor[2]);
                    faturamento.setDataParcela1(vetor[3]);
                    faturamento.setParcela1(vetor[4]);
                    faturamento.setDataParcela2(vetor[5]);
                    faturamento.setParcela2(vetor[6]);
                    faturamento.setDataParcela3(vetor[7]);
                    faturamento.setParcela3(vetor[8]);
                    faturamentos.add(faturamento);
                }

                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        return faturamentos;
    }
}
