/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.aula13;

import java.util.Scanner;

public class Ex3 {
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número");
        int num1 = scan.nextInt();
        
        System.out.println("Informe o segundo número");
        int num2 = scan.nextInt();
        
        System.out.println("A soma é: "+ (num1 + num2));
    }
}
