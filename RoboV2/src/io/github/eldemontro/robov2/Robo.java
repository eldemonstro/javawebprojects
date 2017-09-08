package io.github.eldemontro.robov2;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabricio Bezerra (eldemonstro.github.io)
 */
public class Robo {

    private String nome, dataDeFabricacao;
    private int bateria;
    private boolean bateriaImportada;

    public Robo(String nome, String dataDeFabricacao, int bateria) {
        this.nome = nome;
        this.dataDeFabricacao = dataDeFabricacao;
        this.bateria = bateria;
    }

    public Robo(String nome, String dataDeFabricacao) {
        this.nome = nome;
        this.dataDeFabricacao = dataDeFabricacao;
        InputStream in = this.getClass().getResourceAsStream("/bateria.txt");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                try {
                    this.bateria = Integer.parseInt(line);
                } catch (NumberFormatException exception) {
                    System.err.println(exception);
                    throw exception;
                }
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(String dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public int getBateria() {
        return bateria;
    }

    public boolean isBateriaImportada() {
        return bateriaImportada;
    }

    public void setBateriaImportada(boolean bateriaImportada) {
        this.bateriaImportada = bateriaImportada;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public double soma(double n1, double n2) {
        return this.bateria > 0 ? n1 + n2 : 0;
    }

    public double subtracao(double n1, double n2) {
        return this.bateria > 0 ? n1 + n2 : 0;
    }

    public double multiplicacao(double n1, double n2) {
        return this.bateria > 0 ? n1 + n2 : 0;
    }

    public double divisao(double n1, double n2) {
        return this.bateria > 0 ? n1 + n2 : 0;
    }

    public void log(String log) {

    }

    public void gravarBateria() {

    }
}
