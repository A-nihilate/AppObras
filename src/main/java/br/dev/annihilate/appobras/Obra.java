
package br.dev.annihilate.appobras;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sesi2dia
 */
public class Obra {
    
    String proprietario;
    String local;
    String cidade;
    String uf;
    
    List <Comodo> listaComodos = new ArrayList<>();

    public Obra() {
    }

    public Obra(String proprietario, String local, String cidade, String uf) {
        this.proprietario = proprietario;
        this.local = local;
        this.cidade = cidade;
        this.uf = uf;
    }
    
        
    public double caucularAreaTotal( ){
        double areaTotal = 0;
        
        for (Comodo currentComodo : listaComodos) {
            areaTotal += currentComodo.cauculaArea();
//           caucular area e somar area da lista de comodos
        }
        
        return areaTotal;
    }

    @Override
    public String toString() {
        return "Dados da Obra: " +
                "\nproprietario: " + proprietario +
                "\nlocal: " + local + 
                "\ncidade: " + cidade +
                "\nuf: " + uf +
                "\nAreaTotal: " + caucularAreaTotal();
    } 
    
        
    
}
