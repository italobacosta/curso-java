package org.example;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private char sexo;
    private String whatsapp;

    public Pessoa(){
        this.nome = "";
        this.cpf = "";
        this.idade = 0;
        this.sexo = ' ';
        this.whatsapp = "";
    }

    public Pessoa(String nome, String cpf, int idade, char sexo, String whatsapp){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.whatsapp = whatsapp;
    }
   public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public char getSexo(){
        return this.sexo;
    }
    public void setWhatsapp(String whatsapp){
        this.whatsapp = whatsapp;
    }
    public String getWhatsapp(){
        return this.whatsapp;
    }

    public void apresentar(){
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(idade);
        System.out.println(sexo);
        System.out.println(whatsapp);
    }

}
