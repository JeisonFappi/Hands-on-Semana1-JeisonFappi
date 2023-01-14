package com.eldorado.org;

import com.eldorado.org.arquivo.GerenciarArquivo;
import com.eldorado.org.modelo.Faturamento;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GerenciarArquivo gerenciarArquivo = new GerenciarArquivo();

        List<Faturamento> faturamentos = gerenciarArquivo.lerArquivo("faturamento.txt");
        System.out.println(faturamentos);
    }

}