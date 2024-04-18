import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Filme interestelar = new Filme("Interestelar", 2016);
//        interestelar.setName("Interestelar");
//        interestelar.setAno(2016);
//        System.out.println("-------------");
//        System.out.println("Nome do filme: " + interestelar.getName());
//        System.out.println("-------------");

//        Serie got = new Serie();
//        got.setName("Game of Thrones");
//        got.setNumeroTemporadas(8);
//
//        System.out.println(got.getName());
//        System.out.println("Numero de temporadas: " + got.getNumeroTemporadas());
//        System.out.println("Classificação: " + got.getClassificacao());
//        System.out.println("-------------");

        var vingadores = new Filme("Vingadores", 2012);
        vingadores.setAvaliacao(10);
//        vingadores.setName("Vingadores");
//        vingadores.setAno(2012);

//        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        List<Titulo> lista = new ArrayList<>();
        lista.add(interestelar);
        lista.add(vingadores);

        Serie lost = new Serie("Lost", 2004);
        lista.add(lost);

        System.out.println("Primeiro filme: " + lista.get(0).getName());
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println(lista.toString());

        System.out.println("-------------");

        System.out.println("Lista de Filmes:");
        for (Titulo item : lista) {
            if (item instanceof Filme filme) { // <<--- cast
                System.out.println("O item: " + item.getName() + " é um filme. Avaliação: " + filme.getAvaliacao());
            } else if (item instanceof Serie) {
                System.out.println("O item: " + item.getName() + " é uma serie.");
            }
//            System.out.println(item);
        }
        System.out.println("-------------");
        System.out.println("Lista ordernada com Collections.sort: ");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAno));
        System.out.println("Lista ordernada com lista.sort: ");
        System.out.println(lista);
    }
}
