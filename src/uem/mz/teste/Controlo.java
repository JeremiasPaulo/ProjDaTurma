
package uem.mz.teste;

import java.util.Stack;

/**
 *
 * @author Alfredo
 */
public class Controlo {
   
    static Stack<Pessoa> pessoas = new Stack<>();
    
    public static void main(String[] args) {
        
        
        Pessoa p1 = new Estudante(1233445, nomeAleatorio(),12, 'M');
        Pessoa p2 = new Estudante(1233445, nomeAleatorio(), 13, 'M');
        Pessoa p3 = new Estudante(1233445, nomeAleatorio(), 15, 'M');
        
       pessoas.add(p1);
       pessoas.add(p2);
       pessoas.add(p3);
       
        System.out.println(pessoas.lastElement());
        


    }
    
    private static String nomeAleatorio(){
        String[] nomes = {"Dercio","Edson","Abel"};        
        int posicao = (int) (Math.random() * nomes.length);
        return nomes[posicao];
    }
    
}
