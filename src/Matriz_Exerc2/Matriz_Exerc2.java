package Matriz_Exerc2;

import javax.swing.*;

public class Matriz_Exerc2 {

    public static void main(String[] args) {
        
        //Questão_2
        int[][] Num = new int[4][3];
        
        int i, j = 0;
        for(i = 0; i < 4; i++){
            for(j = 0; j < 3; j++){
                Num[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe um Número"));
                System.out.print(" n = " + Num[i][j] + "\t");
            }
       
            System.out.println("\n");
        }
        
        int soma = 0; 
        for(j = 0; j < 3; j++){
            soma = 0;
            for(i = 0; i < 4; i++){
                soma = soma + Num[i][j];
            }
             
            System.out.print((j+1)+"°_Coluna = " + soma + "  |  ");
        }
       
        System.out.println("");
        
    }
    
}

