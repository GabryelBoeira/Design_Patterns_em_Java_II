package br.com.alura.loja.adapter;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;
import br.com.alura.loja.orcamento.item.ItemOrcamento;

import java.math.BigDecimal;

public class TesteAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new HttpAdapterImpl());
        registro.registrar(orcamento);
    }
}
