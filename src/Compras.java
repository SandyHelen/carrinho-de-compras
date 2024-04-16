public class Compras implements Comparable<Compras>{
    private String descricao;
    private double valorCompra;
    public Compras(String descricao, double valorCompra) {
        this.descricao = descricao;
        this.valorCompra = valorCompra;
    }
    public double getValorCompra() {
        return valorCompra;
    }

// retorna o objeto em String
    @Override
    public String toString() {
        return descricao + " - " + valorCompra;
    }

//implementa Comparable
    @Override
    public int compareTo(Compras outraCompra) {
        return Double.valueOf(this.valorCompra).compareTo(Double.valueOf(outraCompra.valorCompra));
    }
}
