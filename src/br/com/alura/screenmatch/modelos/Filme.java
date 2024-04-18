package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo {
    private int avaliacao;
//    private int ano;

    public Filme(String name, int ano) {
        super(name, ano);
//        this.name = name;
//        this.ano = ano;
    }


    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

    public int getAvaliacao()
    {
        return this.avaliacao;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getAno() + ")";
    }

//    @Override
//    public int compareTo(Titulo outroTitulo) {
//        return this.getName().compareTo(outroTitulo.getName());
//    }

//    public static void main(String[] args) {
//        System.out.println("___classe instanciada!");
//    }
}
