/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula24;

/**
 *
 * @author Luan
 */
public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        
        
        Carro fusca = new Carro();

        fusca.marca = "Volkswagen";
        fusca.modelo = "fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 50;
        fusca.consumoCombustivel = 0.1;
        
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        
    }
}
