package excessoes;

public class PagamentoRecusadoException extends ReservaException {
    public PagamentoRecusadoException(String mensagem) {
        super(mensagem);
    }
}