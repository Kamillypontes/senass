/*
Peça ao usuario para digitar  dois numeros.
exiba na tela:
1. A multiplicação destes numeros 
2. A divisão destes numeros
3. A subtração destes numeros
*/
package revisao;

import javax.swing.JOptionPane;

public class exercicio2 {
    
    public static void main(String[] args) {
        float fNum1= Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        float fNum2= Float.parseFloat(JOptionPane.showInputDialog("Digite o segumdo numero: "));
        float fMult=fNum1*fNum2;
        float fDiv= fNum1/fNum2;
        float fSub= fNum1-fNum2;
        JOptionPane.showMessageDialog(null, "Seus primeiro numero foi: "+fNum1+"\n Seu segundo numero foi: "+fNum2+"\n A multiplicação deles eh:"+fMult+"\n A divisao deles eh: "+fDiv+"\n A subtraçao deles eh :"+fSub);
    }
         
    
    
}
