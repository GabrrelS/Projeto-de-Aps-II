package assento;

import java.math.BigDecimal;

public class Assento {
    private final String numero;
    private final BigDecimal precoBase;
    private final TipoAssento tipo;

    public Assento(String numero, BigDecimal precoBase, TipoAssento tipo) {
        this.numero = numero;
        this.precoBase = precoBase;
        this.tipo = tipo;
    }

    public String getNumero() { return numero; }
    public BigDecimal getPrecoBase() { return precoBase; }
    public TipoAssento getTipo() { return tipo; }
    public String getTipoAssento() { return tipo.getDescricao(); }

    public BigDecimal calcularTaxaEmbarque() {
        switch (tipo) {
            case ECONOMICA:
                return new BigDecimal("50.00");
            case EXECUTIVA:
                return new BigDecimal("120.00");
            case PRIMEIRA_CLASSE:
                return new BigDecimal("300.00");
            default:
                throw new IllegalStateException("Tipo de assento desconhecido: " + tipo);
        }
    }

    public BigDecimal calcularPrecoTotal() {
        return precoBase.add(calcularTaxaEmbarque());
    }
}
