/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Mavenproject1 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static int[][] LlenaMatriz(int f, int c){
            //LLENAR MATRIZ
            int [][] mtemp = new int[f][c];
            System.out.println("INSERTE LOS VALORES PARA LA MATRIZ:");
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.println("Ingresa valor en: ["+i+"]["+j+"]");
                    mtemp[i][j] = sc.nextInt();
                }
            }
            //MOSTRAR MATRIZ
            System.out.println("______________________");
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(mtemp[i][j] + " ");
                }
                System.out.println("");
            }
            return mtemp;
    }
    

    public static void main(String[] args) {
        
        System.out.println("Ingrese No. de filas para Matriz 1: ");
        int filas1 = sc.nextInt();
        System.out.println("Ingrese No. de columnas para Matriz 1: ");
        int columnas1 = sc.nextInt();
        System.out.println("Ingrese No. de filas para Matriz 2: ");
        int filas2 = sc.nextInt();
        System.out.println("Ingrese No. de columnas para Matriz 2: ");
        int columnas2 = sc.nextInt();
        System.out.println("--------------------------------");
        System.out.println("Matriz 1: "+filas1+"x"+columnas1);
        System.out.println("Matriz 2: "+filas2+"x"+columnas2);
        System.out.println("--------------------------------");
        
        if (columnas1 == filas2) {
            int [][] matriz1;
            int [][] matriz2;
            int [][] matrizF = new int [filas1][columnas2];
            
            System.out.println("LLENANDO MATRIZ 1");
            matriz1 = LlenaMatriz(filas1, columnas1);
            
            System.out.println("LLENANDO MATRIZ 2");
            matriz2 = LlenaMatriz(filas2, columnas2);
            
            System.out.println("MATRIZ RESULTANTE:");
            for (int i = 0; i < filas1; i++) {
                for (int j = 0; j < columnas2; j++) {
                    for (int k = 0; k < columnas1; k++) {
                        matrizF[i][j] += matriz1[i][k] * matriz2[k][j]; 
                    }
                    System.out.print(matrizF[i][j]+" ");
                }
                System.out.println("");
            }
            
        }else{
            System.out.println("No es posible multiplicar las matrices, no coinciden columnas(A) con filas (B)");
        }
    }
}
