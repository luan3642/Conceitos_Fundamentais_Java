/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula41;




/**
 *
 * @author Luan
 */
public class Professor extends Pessoa{
   
    private double salario;
    private String nomeCurso;

  

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    
    public double calcularSalarioLiquido(){
        return 0;
    }
    
     public String obterEtiquetaEndereco() {
        String s = "endereço do professor: ";
        s += super.getEndereco();
        
        return s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do professor");
        System.out.println(this.obterEtiquetaEndereco());
    }
    
    
}