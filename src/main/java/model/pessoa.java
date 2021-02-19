/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author perei
 */
public class pessoa {

    private int id;
    private String nome;
    private int idade;
// Método Construtor de Objeto Vazio

    public pessoa() {
    }
// Método Construtor de Objeto, inserindo dados

    public pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
// Métodos GET e SET

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
// Método adicional

    public void fazerAniversario() {
        this.idade++;
    }

    public void mostraDados() {
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}
