/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula39;

/**
 *
 * @author Luan
 */
public class PessoaJuridica extends Contribuintes {

    public void calcular(double rendimento) {

        double imposto = rendimento - (0.1 * rendimento);
        System.out.println("desconto imposto de renda: " + imposto);
    }

}
