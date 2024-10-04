
package model;

import java.util.Date;

public class Carrodef {
    
    private String carro_placa;
     private String entrada;
    private String desc;
    private String status;
    private String saida;

    public Carrodef() {
    }

    public Carrodef(String carro_placa, String entrada, String desc, String status, String saida) {
        this.carro_placa = carro_placa;
        this.entrada = entrada;
        this.desc = desc;
        this.status = status;
        this.saida = saida;
    }

    

    public String getCarro_placa() {
        return carro_placa;
    }

    public void setCarro_placa(String carro_placa) {
        this.carro_placa = carro_placa;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

   

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }
    
    
    
    
}
