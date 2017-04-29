/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoaula4;

import java.util.Scanner;

/**
 *
 * @author absyd
 */
public class Videoaula4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2, soma, sub, mult;
        float div;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número");
        num1 = s.nextInt();
        System.out.println("Informe o segundo número");
        num2 = s.nextInt();
        
        soma = num1 + num2;
        
        System.out.println("A soma dos números é: "+soma);
        
        sub = num1 - num2;
        
        System.out.println("A subtração dos números é "+sub);
        
        mult = num1 * num2;
       
        
        System.out.println("A multiplicação dos números é "+mult);
        
        div = (float)num1 / num2;
        
        System.out.println("A divisão dos números é "+div);
    }
    
}
