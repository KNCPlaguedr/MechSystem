
package model;

import java.util.Date;

public class Carroinfo {
    
    private int id;
    private String cliente_cpf;
    private String marca;
    private String modelo;
    private String anofab;
    private String combustivel;
    private String cambio;
    private String placa;
    private String carroceria;
    private String cor;
    private Date entrada;
    private String desc;

    public Carroinfo() {
    }

    public Carroinfo(int id, String cliente_cpf,String marca, String modelo, String anofab, String combustivel, String cambio, String placa, String carroceria, String cor, Date entrada, String desc) {
        this.id = id;
        this.cliente_cpf = cliente_cpf;
        this.marca = marca;
        this.modelo = modelo;
        this.anofab = anofab;
        this.combustivel = combustivel;
        this.cambio = cambio;
        this.placa = placa;
        this.carroceria = carroceria;
        this.cor = cor;
        this.entrada = entrada;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente_cpf() {
        return cliente_cpf;
    }

    public void setCliente_cpf(String cliente_cpf) {
        this.cliente_cpf = cliente_cpf;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnofab() {
        return anofab;
    }

    public void setAnofab(String anofab) {
        this.anofab = anofab;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

  
     public static String converterParaSQL(String dataAntiga){
        String[] partesData = dataAntiga.split("/");
        String dataNova = partesData [2] + "-" + partesData [1] + "-" + partesData[0];
        return dataNova;
    }
    public static String converterParaJava(String DataAntiga){
        String[] partesData = DataAntiga.split("-");
        String dataNova = partesData [2] + "/" + partesData[1] + "/" + partesData[0];
        return dataNova;
    }
    
}
