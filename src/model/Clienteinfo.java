
package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Clienteinfo {
    
    
    private String nome;
    private String sobrenome;
    private String cep;
    private String rua;
    private String numero;
    private String estado;
    private String cidade;
    private String cpf;
    private String telefone;

    public Clienteinfo() {
    }

    public Clienteinfo(String nome, String sobrenome, String cep, String rua, String numero, String estado, String cidade, String cpf, String telefone) {
       
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.estado = estado;
        this.cidade = cidade;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

   public static boolean isValidCPF(String cpf) {
        String regex = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cpf);
        
        return matcher.matches();
    }
    
    public static boolean isValidCEP(String cep) {
        String regex = "^\\d{5}-\\d{3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cep);
  
        return matcher.matches();
    }
    
    public static boolean isValidTelefone(String telefone) {
        String regex = "^\\(\\d{2}\\)\\d{4,5}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);
        
        return matcher.matches();
    }
    
    public static boolean isValidNumero(String numero) {
        String regex = "^\\d+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numero);

        return matcher.matches();
    }
   
}
