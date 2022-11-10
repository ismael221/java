/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meses30;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Meses30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Calcula quanto meses você viveu com base em sua idade
        Scanner entrada = new Scanner(System.in);
        int anoEmMes = 12;
        System.out.println("Qual seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Qual a sua idade? ");
        int idade = entrada.nextInt();
        int totalMeses = anoEmMes * idade;
        System.out.println(nome+" viveu "+totalMeses+" meses");
    }
    
}
