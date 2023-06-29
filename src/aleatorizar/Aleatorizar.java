/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorizar;

import java.util.Random;

/**
 *
 * @author user
 */
public class Aleatorizar {

    public static void main(String[] args) {
        new Aleatorizar();
       
    }
    

    public Aleatorizar() {
        
       double vet[] = new double[10];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = geraFloat();
        }
       
        System.out.println("\nVetor de 10 elementos gerados aleatoriamente");
        System.out.println("com valores entre 0 e 9,999: \n");
        visualizaVetor(vet);
        System.out.println("\n"); 
        
        double vet1[]={1,2,3,4,5};
        
        System.out.println("\nLista original:");
        vizualiza1(vet1);
        
        FisherYatesShuffle shuffle = new FisherYatesShuffle();
        shuffle.fisherYatesShuffle(vet1);
        
        System.out.println("\nLista embaralhada:");
        vizualiza1(vet1);
        
        System.out.println("\nLista anterior aleatorizada com o algoritmo de Fisher-Yates:");
        
        System.out.println("\n");
    }
    public double geraFloat() {
        //Oracle, nextFloat(): "Retorna o próximo valor real pseudo-aleatório uniformemente 
        //distribuído entre 0,0 e 1,0 a partir da sequência deste gerador de números aleatórios."
        Random rnd = new Random();
        float numero = rnd.nextFloat();
        return (numero * 10);
    }
    public void visualizaVetor(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "  ||  ");
        }
        System.out.println();
    }
public void vizualiza1(double vet1[]) {
        for (int i = 0; i < vet1.length; i++) {
            System.out.print(vet1[i] + "  ||  ");
        }
        System.out.println();
    }



public class FisherYatesShuffle {
    public void fisherYatesShuffle(double[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            double temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
public void aleatorizarFY(double vet1[]) {
     int[] myArray = {1, 2, 3, 4, 5};
        System.out.print("Array original: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        fisherYatesShuffle(vet1);
        
        System.out.print("Array embaralhado: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
        System.out.println();
}

     public void aleatorizar(double vet1[]) {
         double temp[] = {};
         Random rnd = new Random();
         while (vet1.length > 1) {
             int posAleat = rnd.nextInt(vet1.length);
             int ultimo = vet1.length;
             System.out.print(vet1[posAleat] + "  ||  ");
         }
        
        
     }
}
}
