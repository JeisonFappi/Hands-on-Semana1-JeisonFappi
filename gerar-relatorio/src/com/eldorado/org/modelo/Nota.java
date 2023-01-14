package com.eldorado.org.modelo;

public class Nota {

    String empresa;
    String mes;
    String ano;
    String valor;
    String dataEmissao;
    String nota;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "empresa='" + empresa + '\'' +
                ", mes='" + mes + '\'' +
                ", ano='" + ano + '\'' +
                ", valor='" + valor + '\'' +
                ", dataEmissao='" + dataEmissao + '\'' +
                ", nota='" + nota + '\'' +
                '}';
    }
}
