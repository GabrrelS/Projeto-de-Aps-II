package reserva;

import java.math.BigDecimal;
import assento.Assento;
import assento.TipoAssento;
import excessoes.ReservaException;
import facade.ReservaFacade;
import servicos.implementacao.DisponibilidadeServiceSimulado;
import servicos.implementacao.EmailServiceSimulado;
import servicos.implementacao.PagamentoServiceSimulado;

public class Principal {

    public static void main(String[] args) {

        ReservaFacade facade = new ReservaFacade(
                new DisponibilidadeServiceSimulado(),
                new PagamentoServiceSimulado(),
                new EmailServiceSimulado());

        Assento economica = new Assento("12A", new BigDecimal("400.00"), TipoAssento.ECONOMICA);
        Assento executiva = new Assento("3C", new BigDecimal("900.00"), TipoAssento.EXECUTIVA);
        Assento primeira  = new Assento("1A", new BigDecimal("2500.00"), TipoAssento.PRIMEIRA_CLASSE);

        try {
            facade.reservarVoo("João Pessoa", "São Paulo", "123.456.789-00",
                    "cliente1@email.com", economica);
            facade.reservarVoo("Recife", "Rio de Janeiro", "987.654.321-00",
                    "cliente2@email.com", executiva);
            facade.reservarVoo("Brasília", "Miami", "111.222.333-44",
                    "cliente3@email.com", primeira);
        } catch (ReservaException e) {
            System.out.println(">> ERRO: " + e.getMessage());
        }
    }
}
