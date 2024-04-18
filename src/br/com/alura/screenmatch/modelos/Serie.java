package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.Contratos.Classificavel;

public class Serie extends Titulo implements Classificavel {
    protected int numeroTemporadas;
    public Serie(String name, int ano) {
        super(name, ano);
        this.name = name;
        this.ano = ano;
    }
    public int getNumeroTemporadas()
    {
        return this.numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas)
    {
        this.numeroTemporadas = numeroTemporadas;
    }

    @Override
    public String getName()
    {
        return  this.name;
    }

    public String toString()
    {
        return this.getName() + " (" + this.ano + ")";
    }

    @Override
    public int getClassificacao() {
        return 10;
    }

//    @Override
//    public int compareTo(Titulo outroTitulo) {
//        return this.getName().compareTo(outroTitulo.getName());
//    }
}
