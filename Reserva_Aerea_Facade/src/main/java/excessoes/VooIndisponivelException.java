package excessoes;

public class VooIndisponivelException extends ReservaException {
    public VooIndisponivelException(String mensagem) {
        super(mensagem);
    }
}