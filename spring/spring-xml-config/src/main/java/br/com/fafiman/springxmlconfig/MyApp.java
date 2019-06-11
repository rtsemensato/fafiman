package br.com.fafiman.springxmlconfig;

import br.com.fafiman.springxmlconfig.entity.Operacao;
import br.com.fafiman.springxmlconfig.entity.Pessoa;
import br.com.fafiman.springxmlconfig.entity.Publicacao;
import br.com.fafiman.springxmlconfig.entity.TipoOperacao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 *
 * @author fernando
 */
public class MyApp {

    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Publicacao livro = context.getBean("publicacao", Publicacao.class);
        livro.setIsbn("123qwerty");
        livro.setTitulo("Diário de um vampiro");
        livro.gerarExemplares(3);

        Pessoa fernando = context.getBean("pessoa", Pessoa.class);
        fernando.setNome("Fernando");
        Pessoa alice = context.getBean("pessoa", Pessoa.class);
        alice.setNome("Alice");

        Operacao opReserva = context.getBean("operacao", Operacao.class);
        opReserva.setData(new Date());
        opReserva.setPessoa(fernando);
        opReserva.setTipoOperacao(TipoOperacao.RESERVA);
        opReserva.setExemplar(livro.getExemplarDisponivel());
        System.out.println(opReserva);

        Operacao opEmprestimo = context.getBean("operacao", Operacao.class);
        opEmprestimo.setData(new Date());
        opEmprestimo.setPessoa(alice);
        opEmprestimo.setTipoOperacao(TipoOperacao.EMPRESTIMO);
        opEmprestimo.setExemplar(livro.getExemplarDisponivel());
        System.out.println(opEmprestimo);

        context.close();
    }
}
