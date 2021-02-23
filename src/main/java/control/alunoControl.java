/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.aluno;

/**
 *
 * @author perei
 */
public class alunoControl {

    private final aluno control;

    public alunoControl() {
        this.control = new aluno();
    }
// Create

    public boolean Cadastrar(String curso, int fase, String nome, int idade) {
        int id = control.maiorID() + 1;
        aluno objeto = new aluno(curso, fase, id, nome, idade);
        if (control.InsertAlunoBD(objeto)) {
            return true;
        } else {
            return false;
        }
    }
// Update

    public boolean Editar(String curso, int fase, int id, String nome, int idade) {
        aluno objeto = new aluno(curso, fase, id, nome, idade);
        if (control.UpdateAlunoBD(id, objeto)) {
            return true;
        } else {
            return false;
        }
    }
// Delete

    public boolean Apagar(int id) {
        if (control.DeleteAlunoBD(id)) {
            return true;
        } else {
            return false;
        }
    }
// Read

    public ArrayList getMinhaLista() {
        return control.getMinhaLista();
    }

    @SuppressWarnings("unchecked")
    public String[][] getMinhaMatrizTexto() {
        ArrayList<aluno> minhalista = control.getMinhaLista();
        int tamanho = minhalista.size();
        String MatrizAlunos[][] = new String[tamanho][5];
        for (int i = 0; i < tamanho; i++) {
            MatrizAlunos[i][0] = minhalista.get(i).getId() + "";
            MatrizAlunos[i][1] = minhalista.get(i).getNome();
            MatrizAlunos[i][2] = minhalista.get(i).getIdade() + "";
            MatrizAlunos[i][3] = minhalista.get(i).getCurso();
            MatrizAlunos[i][4] = minhalista.get(i).getFase() + "";
        }
        return MatrizAlunos;
    }
}
