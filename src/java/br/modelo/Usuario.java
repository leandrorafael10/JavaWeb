/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.modelo;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author leandro.silva
 */
@Named(value = "usuario")
@ViewScoped
public class Usuario {
    private String nome;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
