
package uem.mz.teste;

/**
 *
 * @author Alfredo
 */
public class Estudante extends Pessoa {
    
    private int nrEstudante;

    public Estudante(int nrEstudante, String nome, int idade, char sexo) {
        super(nome, idade, sexo);
        this.nrEstudante = nrEstudante;
    }
    
    //Alguns metodos aqui.

    @Override
    public String toString() {
        return super.toString() + "nrEstudante= " + nrEstudante + '}';
    }
    
    
    
    
}
