/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.aluno;
import java.util.*;

/**
 *
 * @author perei
 */
public class alunoDAO {

    public static ArrayList<aluno> MinhaLista = new ArrayList<aluno>();
// método que fornece o maior CAMPO ID dentro da nossa base de dados

    public static int maiorID() {
        int maiorID = 0;
        for (int i = 0; i < MinhaLista.size(); i++) {
            if (MinhaLista.get(i).getId() > maiorID) {
                maiorID = MinhaLista.get(i).getId();
            }
        }
        return maiorID;
    }
}
