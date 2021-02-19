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
public class professor extends pessoa {

    private double salario;
    private String titulo; // Especialista, Mestre, Doutor, etc
// Método Construtor de Objeto Vazio

    public professor() {
    }
// Método Construtor de Objeto, inserindo dados

    public professor(double salario, String titulo) {
        this.salario = salario;
        this.titulo = titulo;
    }
// Métodos GET e SET

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
// Método adicional

    public double calcularImposto() {
        return this.salario * 0.11;
    }

}
