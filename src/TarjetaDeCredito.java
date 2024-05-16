import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompra;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompra = new ArrayList<>();
    }

    // metodo
    public boolean lanzarCompra(Compra compra) {// si no tengo saldo que me de un false y devuelva la lista de compras
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.listaDeCompra.add(compra);
            return  true;
        }
        return false;
    }

    //getter recibir el valor
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompra() {
        return listaDeCompra;
    }

}
