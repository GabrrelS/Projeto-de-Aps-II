package servicos.implementacao;

import java.math.BigDecimal;
import servicos.PagamentoService;

public class PagamentoServiceSimulado implements PagamentoService {
    @Override
    public boolean processarPagamento(String cpf, BigDecimal valor) {
        System.out.printf("[Pagamento] Processando R$ %.2f para o CPF: %s%n", valor, cpf);
        return true; // Simulação: sempre aprovado
    }
}