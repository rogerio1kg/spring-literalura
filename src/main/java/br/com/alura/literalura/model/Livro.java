package br.com.alura.literalura.model;


import br.com.alura.literalura.dto.LivroDTO;
import jakarta.persistence.*;

@Entity
@Table
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String titulo;

    @ManyToOne(cascade = CascadeType.ALL)
    private Autor autor;

    private String idioma;
    private Integer anoNascimentoAutor;
    private Integer anoFalencimentoAutor;
    private Double numeroDownloads;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Integer getAnoNascimentoAutor() {
        return anoNascimentoAutor;
    }

    public void setAnoNascimentoAutor(Integer anoNascimentoAutor) {
        this.anoNascimentoAutor = anoNascimentoAutor;
    }

    public Integer getAnoFalencimentoAutor() {
        return anoFalencimentoAutor;
    }

    public void setAnoFalencimentoAutor(Integer anoFalencimentoAutor) {
        this.anoFalencimentoAutor = anoFalencimentoAutor;
    }

    public Double getNumeroDownloads() {
        return numeroDownloads;
    }

    public void setNumeroDownloads(Double numeroDownloads) {
        this.numeroDownloads = numeroDownloads;
    }

    public Livro() {}

    public Livro(LivroDTO livroDTO) {

    }
}
