package br.com.alura.loja.orcamento;

import br.com.alura.loja.adapter.HttpAdapter;
import br.com.alura.loja.excecao.DomainException;

import java.util.Map;

public class RegistroDeOrcamento {

    private final HttpAdapter httpAdapter;

    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento) {
        if (orcamento.isNaoFinalizado())
            throw new DomainException("Orcamento nao finalizado");

        //Chamado para uma API externa
        String url = "htpp://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor",orcamento.getValor(),
                "itens", orcamento.getItens());

        httpAdapter.post(url, dados);
    }
}
