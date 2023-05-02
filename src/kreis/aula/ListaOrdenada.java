package kreis.aula;

import java.util.ArrayList;
import java.util.Collections;

public class ListaOrdenada {
    public static void main(String[] args) {
        // criar a lista L
        ArrayList<Integer> L = new ArrayList<Integer>();
        L.add(10);
        L.add(5);
        L.add(8);
        L.add(1);
        L.add(9);
        L.add(2);
        L.add(4);
        L.add(7);
        L.add(3);
        L.add(6);

        // ordenar a lista L em ordem crescente
        Collections.sort(L);

        // exibir a lista L ordenada
        for (int i = 0; i < L.size(); i++) {
            System.out.print(L.get(i) + " ");
        }
    }
}