/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.parnamirim.first.jsp.bins;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Marcelo
 */
@ManagedBean
public class ClienteBins {
   private String nome = "Renato";
   public void enviar(){
       System.out.println("Enviando....");
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
  
    
}
