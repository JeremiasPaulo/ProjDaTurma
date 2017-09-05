/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficha5;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeremias C.Paulo
 */
public class multiplicacao_exer_2 {
    
   /**
    * Metodo recursivo recebendo dois parametros e multiplicando pela soma sucessiva
    * @param x valor a ser adicionado ao numero de vezes do y.
    * @param y numero de vezes em que o x deve ser multiplicado.
    * @return 
    */

    private static int multiplicacao(int x, int y){
              
                 if(y>0){  //condicao de paragem.
                 return x+multiplicacao(x, y-1);
                 }
                     
               return 0;
    }
    
    public static void main(String [] args){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digita o primeiro numero"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digita o primeiro numero"));
        
        System.out.println (multiplicacao(x,y));
    }

    

    

    
}
