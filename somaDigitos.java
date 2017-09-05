package Ficha5;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeremias C.Paulo
 */
public class somaDigitos {
    
    
    private static int somaDigit(int nr){
    
        if(nr%10==nr){// condicao de paragem e necessaria para que o numero digitado seja natural
            return nr;
        }
    
        return ( (nr % 10) +somaDigit(nr / 10));//metodo recursivo garantindo a Soma do Proximo digito que compoe o numero digitado
    }
    
    public static void main(String [] args){
    
        int nr = Integer.parseInt(JOptionPane.showInputDialog("Digita o Numero"));
         System.out.println("Soma = "+somaDigit(nr));
    
    }
}
