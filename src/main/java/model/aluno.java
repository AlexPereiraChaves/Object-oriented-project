/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;
import dao.alunoDAO;

/**
 *
 * @author perei
 */
public class aluno extends pessoa {

    private String curso;
    private int fase;
// Método Construtor de Objeto Vazio

    public aluno() {
    }
// Método Construtor de Objeto, inserindo dados

    public aluno(String curso, int fase) {
        this.curso = curso;
        this.fase = fase;
    }
// Método Construtor usando também o construtor da SUPERCLASSE

    public aluno(String curso, int fase, int id, String nome, int idade) {
        super(id, nome, idade);
        this.curso = curso;
        this.fase = fase;
    }
// Métodos GET e SET

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
// Método adicional

    public boolean verificarFormando() {
        if (this.fase == 10) {
            return true;
        } else {
            return false;
        }
    }
// Exemplo de overload

    public boolean verificarFormando(int fase) {
        if (fase == 10) {
            return true;
        } else {
            return false;
        }
    }
// Exemplo de Override

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Curso: " + this.curso);
        System.out.println("Fase: " + this.fase);
    }

    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Idade: " + this.getIdade()
                + "\n Curso: " + this.getCurso()
                + "\n Fase:" + this.getFase()
                + "\n -----------";
    }
    // Retorna a Lista de Alunos(objetos)

    public ArrayList getMinhaLista() {
        return alunoDAO.MinhaLista;
    }
// Cadastra novo aluno

    public boolean InsertAlunoBD(aluno objeto) {
        alunoDAO.MinhaLista.add(objeto);
        return true;
    }
// Deleta um aluno específico pelo seu campo ID

    public boolean DeleteAlunoBD(int id) {
        int indice = this.procuraIndice(id);
        alunoDAO.MinhaLista.remove(indice);
        return true;
    }
// Edita um aluno específico pelo seu campo ID

    public boolean UpdateAlunoBD(int id, aluno objeto) {
        int indice = this.procuraIndice(id);
        alunoDAO.MinhaLista.set(indice, objeto);
        return true;
    }
// procura o ÍNDICE de objeto da MinhaLista que contem o ID enviado.

    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < alunoDAO.MinhaLista.size(); i++) {
            if (alunoDAO.MinhaLista.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }
    // busca no DAO o maior ID da nossa base de dados

    public int maiorID() {
        return alunoDAO.maiorID();
    }
}
