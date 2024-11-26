package br.com.dio.desafio.dominio;

public abstract class Conteudo { //abstract não vai permitir que a classe conteudo seja extanciada.

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp(); //toda classe que extender Conteudo, deverá ter a função calcularXp().

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
