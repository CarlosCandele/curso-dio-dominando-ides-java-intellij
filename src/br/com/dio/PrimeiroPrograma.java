package br.com.dio;


public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato("Pituco","Branco",2);



        System.out.println( " Nome: " + gato.getNome() + '\'' + "Cor: "+gato.getCor() + '\''+ " Idade: "+ gato.getIdade());

        Livro livro = new Livro("Codigo Limpo",278);
        System.out.println(livro);
    }
}

class Livro{
    private String titulo;
    private int paginas;

public Livro(String titulo, int paginas) {
    this.titulo = titulo;
    this.paginas = paginas;
    }

public String getTitulo() {
    return titulo;
    }
public void setTitulo(String titulo) {
    this.titulo = titulo;
    }

public int getPaginas() {
    return paginas;
    }
public void setPaginas(int paginas) {
    this.paginas = paginas;
    }

    public String toString() {
        return "Livro{" +
                "Titulo: " + titulo + '\'' +
                ", Paginas: " + paginas +
                "}";
    }

}
