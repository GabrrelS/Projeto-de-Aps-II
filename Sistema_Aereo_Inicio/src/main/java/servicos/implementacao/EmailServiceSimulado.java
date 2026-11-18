package servicos.implementacao;

import servicos.EmailService;

public class EmailServiceSimulado implements EmailService {
    @Override
    public void enviarConfirmacao(String email, String detalhes) {
        System.out.println("[E-mail] Enviando confirmação para: " + email);
        System.out.println("[E-mail] " + detalhes);
    }
}
