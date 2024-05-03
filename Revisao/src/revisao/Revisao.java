/*

  */
package revisao;

import javax.swing.JOptionPane;

public class Revisao {
    public static void main(String[] args) {
        
       int iIdade= 18;
       double dSalario=32423.55;
       char cCaracter='A';
       float fAltura=1.83f;        
       boolean lAceso= true;
       byte bNum=2;
       short hHJ= 23;
       //classe
       String sFrase="Historias nossas historias, dias de luta, dias de gloria";
       int iNumero1=7;
       int iNumero2=2;
       int iResult=0;
       iResult= iNumero1 + iNumero2;
       iResult= iNumero1 - iNumero2;
       iResult= iNumero1 * iNumero2;   
       iResult= iNumero1 / iNumero2; //neste exemplo a variavel só aceita numeros inteiros, entao resultara 3
       // Resto da divisão
       iResult= iNumero1 % iNumero2; //1
       iResult++;//iResult=iResult+1; //2
       iResult--;//iResult=IResult-1; //1
       iResult*=3; //iResult*3; //3
       iResult/=2;//iResult=iResult/2; //1
       // System.out.println(iNumero1);

       // Operadores logicos
       // &- And
       // ||- Or
       // !- Not

       // Operadores Racionais
       // == - Igual
       // != Diferente
       // > Maior >= Maior ou igual
       // < Menor <= Menor ou igual
       int i=5,j=3;
       System.out.println(i==j);//false
       System.out.println(i!=j);//true
       System.out.println(i>=j);//true
       System.out.println(i<=j);//false

       int x=10;
       float fX = (float) x; //cast
       int iX = (int) fX;
       double dY = (double)iX;
       String sValor = "1230";
       int iValor = Integer.parseInt(sValor);
       float fValor=Float.parseFloat(sValor);
       double dValor=Double.parseDouble(sValor);
       //numerico para string
       
       sValor = String.valueOf(iValor);

       //JOptionpane - classe
       int iNumFilhos =Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de filhos: ")) ;
       JOptionPane.showMessageDialog( null, "Voce tem "+iNumFilhos+" filhos");

       /*Solicite a um usuario digitar o raio de um circulo e calcular
       a area (p*raio*raio) e o perimetro (2*PI*raio) do mesmo/
       */
       float fRaio= Float.parseFloat( JOptionPane.showInputDialog("Digite o raio do circulo: "));
       float fArea=0;
       fArea=(float)Math.PI*fRaio*fRaio;
       float fPerimetro=2*(float)Math.PI*fRaio;
       JOptionPane.showMessageDialog(null, "A area desse circulo eh "+fArea+", e o perimetro deste circulo eh "+fPerimetro);
       
       
       //Condicionais
       
       int iNum1=10;
       int iNum2=15;
       if(iNum1>iNum2){
           System.out.println("é menor");
       }else if(iNum1==iNum2){
           System.out.println("iguais");
       }else{
           System.out.println("é menor");
       }
    }
       
       
   }
    

