package com.example.ppf;

public class Usuario {

    private int codigo;
    private String nome;
    private String telefone;
    private String CPF;
    private String endereco;
    private String dataNasc;

    public Usuario(int codigo, String nome, String telefone, String CPF, String endereco, String dataNasc) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
    }

    public Usuario(String nome, String telefone, String CPF, String endereco, String dataNasc) {
        this.nome = nome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
}
