package br.com.alura.screenmatch.modelos;

public abstract class Titulo implements Comparable<Titulo> {
    protected int ano;
    protected String name;

    public Titulo(String name, int ano) {
        this.name = name;
        this.ano = ano;
    }

    public String getName() {
        return name;
    }

    public void setName(String novoNome)
    {
        this.name = novoNome;
    }

    public int getAno()
    {
        return this.ano;
    }

    public int compareTo(Titulo outroTitulo) {
        return this.getName().compareTo(outroTitulo.getName());
    }
}
