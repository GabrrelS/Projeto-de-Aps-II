package servicos.implementacao;

import servicos.DisponibilidadeService;

public class DisponibilidadeServiceSimulado implements DisponibilidadeService {
    @Override
    public boolean verificarDisponibilidade(String origem, String destino) {
        System.out.println("[Disponibilidade] Verificando voo " + origem + " -> " + destino);
        return true; // Simulação: sempre disponível
    }
}