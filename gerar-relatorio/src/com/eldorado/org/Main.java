package com.eldorado.org;

import com.eldorado.org.arquivo.GerenciarArquivo;
import com.eldorado.org.modelo.Faturamento;
import com.eldorado.org.modelo.Nota;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        GerenciarArquivo gerenciarArquivo = new GerenciarArquivo();

        List<Faturamento> faturamentos = gerenciarArquivo.lerArquivoFaturamento("faturamento.txt");
        System.out.println(faturamentos);

        List<Nota> notas = gerenciarArquivo.lerArquivoNota("nota.txt");
        System.out.println(notas);
    }

}