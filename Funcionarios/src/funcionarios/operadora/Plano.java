package funcionarios.operadora;

public class Plano {
    private double custoMinuto;
    private String nome;
    private int creditoInicial;
    private Operadora operadora;

    public double getCustoMinuto() {
        return custoMinuto;
    }

    public void setCustoMinuto(double custoMinuto) {
        this.custoMinuto = custoMinuto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCreditoInicial() {
        return creditoInicial;
    }

    public void setCreditoInicial(int creditoInicial) {
        this.creditoInicial = creditoInicial;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }

    public Plano(double custoMinuto, String nome, int creditoInicial, Operadora operadora) {
        this.custoMinuto = custoMinuto;
        this.nome = nome;
        this.creditoInicial = creditoInicial;
        this.operadora = operadora;
    }
}
