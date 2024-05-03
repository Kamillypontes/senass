/*
Peça ao usuarios entrar com o valor de duas notas, 
Calcule a media e indique se o aluno está aprovado 
  (>=6), recuperação (=5) ou reprovado (<5)*/ 
package revisao;

import javax.swing.JOptionPane;

public class exercio3 {
    public static void main(String[] args) {
        float fNota1=Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
        float fNota2=Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
        float fMedia=(fNota1+fNota2)/2;
        if(fMedia>=6){
           System.out.println("Aprovadooo!!!");
       }else if(fMedia==5){
           System.out.println("Recuperaçao");
       }else{
           System.out.println("Reprovado!!!! Me entregue este bilhete assinado por seus pais.");
       }

    }
    
}
