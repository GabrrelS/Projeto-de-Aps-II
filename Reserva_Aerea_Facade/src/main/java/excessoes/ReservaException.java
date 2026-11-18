package excessoes;

public class ReservaException extends RuntimeException {
    public ReservaException(String mensagem) {
        super(mensagem);
    }
}