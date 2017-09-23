package io.github.eldemontro.estacionamento;

import java.text.ParseException;
import java.util.Date;

public class Ticket {
    private int id;
    private String placa;
    private String cor;
    private String modelo;
    private Date dataEntrada;
    private Date dataSaida;
    private double valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Ticket(int id, String placa, String cor, String modelo, String dataEntrada, String dataSaida, double valor) throws ParseException {
        this.id = id;
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.dataEntrada = Util.STRINGTODATE(dataEntrada);
        this.dataSaida = Util.STRINGTODATE(dataSaida);
        this.valor = valor;
    }
    
    
}
