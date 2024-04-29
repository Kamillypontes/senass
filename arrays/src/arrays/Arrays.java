/*
crie um vetor loteria com 5 numeros em seguida, crie um vetor com 10 elementos inteiros digitados pelo usuario
apos a digitaçao, verificar quantos numeros o usuario acertou
exemplo: 3,6,19,32,24
        4,6,12,18,22,45,55,60,5,3 //
  aiNumeros [1]=15;
           aiNumeros [2]=33;
           aiNumeros [3]=57;
           aiNumeros [4]=48;
           aiNumeros [5]=23;
*/
package arrays;

import javax.swing.JOptionPane;

public class Arrays {

    public static void main(String[] args) {
            int [] aiNumeros= (33,57,48,23,15);
            int [] aiPalpites= new int [10];
            int iContador=0;
       for (int i = 0; i < aiPalpites.length; i++) {
         
            aiPalpites [i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+ "° numero:"));
     
        }
       for (int ik=0;aiPalpites.length;ik++){
           if(aiNumeros[i]==aiPalpites[ik])
               iContador++;
       }
       JOptionPane.showMessageDialog(null,"Voce acertou"+iContador+"numeros" );
    }
       
    }
    
