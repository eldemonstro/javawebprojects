package io.github.eldemonstro.robo;

/*
 * @author: Fabricio Bezerra (github.com/eldemontro)
 */
public class Robo {

    private String nome;
    private String dtFabr;
    private int bateria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtFabr() {
        return dtFabr;
    }

    public void setDtFabr(String dtFabr) {
        this.dtFabr = dtFabr;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public Robo(String nome, String dtFabr, int bateria) {
        this.nome = nome;
        this.dtFabr = dtFabr;
        this.bateria = bateria;
    }

    public int tiraBateria() {
        this.setBateria(this.getBateria() - 1);
        return bateria;
    }

    public double soma(double numero1, double numero2) {
        tiraBateria();
        return numero1 + numero2;
    }

    public double multiplicacao(double numero1, double numero2) {
        tiraBateria();
        return numero1 * numero2;
    }

    public double subtracao(double numero1, double numero2) {
        tiraBateria();
        return numero1 - numero2;
    }

    public double divisao(double numero1, double numero2) {
        tiraBateria();
        return numero1 / numero2;
    }
}
