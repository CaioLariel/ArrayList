
package pacotePrincipal;

import pacoteLista.ListaEstatica;

public class Principal {
    public static void main(String[] args) {
        
        ListaEstatica le = new ListaEstatica();
        le.inserir(10, 0);
        le.inserir(11, 1);
        le.inserir(12, 2);
        le.inserir(13, 3);
        le.inserir(14, 4);
        le.inserir(15, 5);
        le.inserir(16, 6);
        le.inserir(17, 7);
        le.remover(2);
  
        le.imprimir();
    }

}
