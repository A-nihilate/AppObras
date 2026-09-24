package br.dev.annihilate.appobras;

/**
 *
 * @author sesi2dia
 */
public class Comodo {
    
    String nome;
    double largura;
    double comprimento;

    public Comodo() {
    }

    public Comodo(String nome, double largura, double comprimento) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
    }
    
    
    
    public double cauculaArea(){
        return this.largura * this.comprimento;
    }

    
    @Override
    public String toString() {
        return "\nDados do Comodo) " +
                "\nNome: " + nome +
                "\nLargura: " + largura + 
                "\nComprimento: " + comprimento +
                "\nArea: " + cauculaArea() +
                "\n\n";
    }
    
    
    
    
    
}
