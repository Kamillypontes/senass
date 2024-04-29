/*
crie dois vetores randometros a e b de 10 posiçoe cada
em seguida una atravez da programação os dois vetores em um vetor c de 20 posiçoes, exiba os 3
 */
package arrays;

import javax.swing.JOptionPane;


public class exercicio07 {
    public static void main(String[] args) {
        int [] aiA=new int [10];
        int [] aiB=new int [10];
        int [] aiC=new int [20];
        
        for (int i = 0; i < aiA.length; i++){
            aiA [i]=(int)(Math.random() * 100);
            aiB [i]=(int)(Math.random() * 100);
        }
        for(int i = 0; i < aiA.length; i++){
            aiC[i]=aiA[i];
            aiC[i+10]=aiB[i];
        }
        for (int i = 0; i < aiA.length; i++){
            System.out.println("A: "+aiA[i]);
        
        }
        for (int i = 0; i < aiB.length; i++){
            System.out.println("B: "+aiB[i]);
        
        }
        for (int i = 0; i < aiC.length; i++){
            System.out.println("C: "+aiC[i]);
        
        }
                
        
    }
    
}
