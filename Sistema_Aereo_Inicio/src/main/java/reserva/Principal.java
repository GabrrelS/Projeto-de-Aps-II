package reserva;

import java.math.BigDecimal;
import assento.Assento;
import assento.TipoAssento;

public class Principal {

    public static void main(String[] args) {

        Assento economica = new Assento("12A", new BigDecimal("400.00"), TipoAssento.ECONOMICA);
        Assento executiva = new Assento("3C", new BigDecimal("900.00"), TipoAssento.EXECUTIVA);
        Assento primeira  = new Assento("1A", new BigDecimal("2500.00"), TipoAssento.PRIMEIRA_CLASSE);

        imprimir(economica);
        imprimir(executiva);
        imprimir(primeira);
    }

    private static void imprimir(Assento a) {
        System.out.printf("Assento %s (%s) | Base: R$ %.2f | Taxa: R$ %.2f | Total: R$ %.2f%n",
                a.getNumero(), a.getTipoAssento(), a.getPrecoBase(),
                a.calcularTaxaEmbarque(), a.calcularPrecoTotal());
    }
}
