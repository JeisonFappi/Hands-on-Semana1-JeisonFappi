package com.eldorado.org.modelo;

public class Faturamento {

    String  empresa;
    String mes;
    String ano;
    String dataParcela1;
    String parcela1;
    String dataParcela2;
    String parcela2;
    String dataParcela3;
    String parcela3;

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

    public String getDataParcela1() {
        return dataParcela1;
    }

    public void setDataParcela1(String dataParcela1) {
        this.dataParcela1 = dataParcela1;
    }

    public String getParcela1() {
        return parcela1;
    }

    public void setParcela1(String parcela1) {
        this.parcela1 = parcela1;
    }

    public String getDataParcela2() {
        return dataParcela2;
    }

    public void setDataParcela2(String dataParcela2) {
        this.dataParcela2 = dataParcela2;
    }

    public String getParcela2() {
        return parcela2;
    }

    public void setParcela2(String parcela2) {
        this.parcela2 = parcela2;
    }

    public String getDataParcela3() {
        return dataParcela3;
    }

    public void setDataParcela3(String dataParcela3) {
        this.dataParcela3 = dataParcela3;
    }

    public String getParcela3() {
        return parcela3;
    }

    public void setParcela3(String parcela3) {
        this.parcela3 = parcela3;
    }

    @Override
    public String toString() {
        return "Faturamento{" +
                "empresa='" + empresa + '\'' +
                ", mes='" + mes + '\'' +
                ", ano='" + ano + '\'' +
                ", dataParcela1='" + dataParcela1 + '\'' +
                ", parcela1='" + parcela1 + '\'' +
                ", dataParcela2='" + dataParcela2 + '\'' +
                ", parcela2='" + parcela2 + '\'' +
                ", dataParcela3='" + dataParcela3 + '\'' +
                ", parcela3='" + parcela3 + '\'' +
                '}';
    }
}
