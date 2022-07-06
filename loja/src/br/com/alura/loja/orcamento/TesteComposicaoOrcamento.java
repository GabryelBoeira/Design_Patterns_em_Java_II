package br.com.alura.loja.orcamento;

import br.com.alura.loja.orcamento.orcavel.ItemOrcamento;
import br.com.alura.loja.orcamento.orcavel.Orcamento;
import br.com.alura.loja.orcamento.orcavel.OrcamentoProxy;

import java.math.BigDecimal;

public class TesteComposicaoOrcamento {
    public static void main(String[] args) {
        //Reprovando orcamento por qualquer razao
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        //Novo orcamento com atualizacao do antigo
        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("400")));
        novo.adicionarItem(antigo);

        OrcamentoProxy proxy = new OrcamentoProxy(novo);
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
    }
}
