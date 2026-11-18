package servicos;

public interface EmailService {
    void enviarConfirmacao(String email, String detalhes);
}
