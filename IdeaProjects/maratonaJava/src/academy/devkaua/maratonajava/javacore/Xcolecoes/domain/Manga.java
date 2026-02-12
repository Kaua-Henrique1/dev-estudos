package academy.devkaua.maratonajava.javacore.Xcolecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private Double preco;

    public Manga(Long id, String nome, Double preco)  {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome) && Objects.equals(preco, manga.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Manga o) {
       /* if (this.id < o.getId()) {
            return -1;
        } else if (this.id.equals(o.getId())) {
            return 0;
        } else {
            return 1;
        } */

        return this.id.compareTo(o.getId()); // Como ele e um Objeto (Integer), ele ja tem acesso ao metodo compareTO.

        // return this.nome.compareTo(o.getNome());

        // Uso o método estático da classe Double para comparar dois tipos primitivos, já que primitivos não têm métodos.
        // return Double.compare(preco, o.getPreco());
    }
}
