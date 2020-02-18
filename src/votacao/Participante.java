/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votacao;

import java.util.ArrayList;

/**
 *
 * @author Cassiano
 */
public class Participante {

    public String nome, id;

    public Participante(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean votante(String nome, String id) {
        boolean voto = false;
        if (voto == true) {
            System.out.println("Esse + participante já realizou voto : " + id);
        }
        return false;

    }
}
