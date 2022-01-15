package br.com.dio;


import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro);

        /*int a = 2;
        int b = 10;
        System.out.println("Hello World! " + (a + b));*/

    }
}

class Livro {
    private String nome;
    private Integer nomPaginas;

    public Livro(String nome, Integer nomPaginas) {
        this.nome = nome;
        this.nomPaginas = nomPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNomPaginas() {
        return nomPaginas;
    }

    public void setNomPaginas(Integer nomPaginas) {
        this.nomPaginas = nomPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", nomPaginas=" + nomPaginas +
                '}';
    }
}
