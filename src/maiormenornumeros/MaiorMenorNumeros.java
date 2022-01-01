/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiormenornumeros;

import java.util.Scanner;

/**
 *
 * @author Siat
 */
public class MaiorMenorNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Faça um programa que mostre o maior e o menor número digitados pelo usuário
        
        int maior = 0;
        int menor = 0;
        int qteNumerosDigitados;
        int arrayValores[];
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Este programa recebe numeros inteiros e calcula o maior e o menor");
        System.out.println("\nInforme quantos números pretende digitar: ");
        qteNumerosDigitados = teclado.nextInt();
        
        arrayValores = new int[qteNumerosDigitados];
        
        for(int i = 0; i < qteNumerosDigitados; i++){
            System.out.println("Informe o " + (i + 1) + "º valor e aperte enter para continuar ");
            arrayValores[i] = teclado.nextInt();
            
            maior = arrayValores[i];
            menor = arrayValores[i];
        }
        for(int i = 0; i < qteNumerosDigitados; i++)
            if(arrayValores[i] > maior){
                maior = arrayValores[i];
            }else if(arrayValores[i] < menor)
                menor = arrayValores[i];
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        }
    
    
}
