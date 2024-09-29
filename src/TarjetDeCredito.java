import Compras.Compras;

import java.util.ArrayList;
import java.util.List;

public class TarjetDeCredito {
    private double limite;
    private double saldo;
    private List<Compras> listaDeCompras;

    public TarjetDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public boolean lanzarCompra (Compras compras){
        if (this.saldo > compras.getValor()){
            this.saldo -= compras.getValor();
            this.listaDeCompras.add(compras);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public List<Compras> getListaDeCompras(){
        return listaDeCompras;
    }

    public double getSaldo() {
        return saldo;
    }
}
