/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao7;

import java.util.Scanner;

/**
 *
 * @author Mari
 */
public class Questao7 {

    /**
     * @param args the command line arguments
     */
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leitura = new Scanner(System.in); //Scanner de leitura pelo prompt
        
        String palavra; 
        char caractere;
        int contadorCaracteres = 0;
        
        palavra = leitura.next();  //leitura do da palavra digitada pelo usuário
 
        /* for percorre até o tamanho final da palavra.
           e o contadorCaracteres vai iterando até o último caractere para contar todos os caracteres
           com o tamanho da palavra utilizando esse for para contar 
        */
        
        for (int i = 0; i < palavra.length(); i++) { 
              caractere = palavra.charAt(i); // i-ésimo caractere da string 's
              contadorCaracteres++;                
        }
        
        System.out.println("Tamanho da String digitada é: " + contadorCaracteres); //exibe a mensagem do tamanho da palavra
         
    }
    
}
