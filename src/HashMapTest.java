import java.util.HashMap;

public class HashMapTest {
    private static final int TAMANHO = 100000;

    public static void main(String[] args) {

        HashMap<Integer, Produto> mapa = new HashMap<Integer, Produto>();

        for (int i = 0; i <= TAMANHO; i++) {
            mapa.put(i, new Produto(i, "Produto"+i, i*20.00));
        }

        long StartTime = System.currentTimeMillis();
        int codigoASerEncontrado = TAMANHO;

        for (int qtd = 0; qtd < TAMANHO; qtd++) {
            Produto p = mapa.get(codigoASerEncontrado);
        }

        long endTime = System.currentTimeMillis();

        System.out.println(mapa);
        System.out.println("Tempo de execucao: " + (endTime - StartTime) + " ms");
    }
}