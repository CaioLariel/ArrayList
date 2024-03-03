package pacoteLista;

// criar uma arrayList
public class ListaEstatica {

    //atributos
    private double vetor[];
    private int n;

    //construtor
    public ListaEstatica() {
        this.vetor = new double[5];
        this.n = 0;
    }

    //metodos
    //1 - inserção
    public boolean inserir(int valor, int pos) {
        criarVetor();
        if (!validaPos(pos)) {
            return false;
        }

        for (int i = n; i > pos; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[pos] = valor;
        n++;
        return true;
    }

    // metodo impressao
    public void imprimir() {
        for (int i = 0; i < n; i++) {
            System.out.print(" | " + vetor[i]);
        }
        //trativa de erro
        System.out.println("");
    }

    //metodo validação
    public boolean validaPos(int pos) {
        if (pos < 0 || pos > n) {
            System.out.println("NÃO FOI POSSIVEL INSERIR NA POSIÇÃO :" + pos);
            return false;
        }
        return true;
    }
    //metodo de remoção

    public boolean remover(int pos) {
        if (!validaPos(pos)) {
            return false;
        }
        for (int i = pos; i <= n; i++) {
            vetor[i] = vetor[i + 1];
        }
        n--;
        return true;
    }

    public void criarVetor() {
        if (n == vetor.length) {
            double novoVetor[] = new double[vetor.length * 2];
            for (int i = 0; i < vetor.length; i++) {
                novoVetor[i] = vetor[i];
            }
            System.out.println("o vetor foi duplicado de tamanho");
            vetor = novoVetor;
        }

    }
}
