import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limite;
    private double saldo;

    private List<Compras> listaCompra;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaCompra = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getListaCompra() {
        return listaCompra;
    }

    public void compraRealizada(Compras compra){
        if (compra.getValorCompra() <= this.saldo){
            System.out.println("Compra Realizada.\n");
            this.saldo -= compra.getValorCompra();
            this.listaCompra.add(compra);
        } else {
            System.out.println("Saldo insuficiente");
            System.out.println("Saldo disponível = " + this.saldo + "\n");

        }
    }
}
