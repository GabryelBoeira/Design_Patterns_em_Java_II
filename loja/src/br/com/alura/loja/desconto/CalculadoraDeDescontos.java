package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.tipo.Desconto;
import br.com.alura.loja.desconto.tipo.DescontoParaOrcamentoComMaisDeCincoItens;
import br.com.alura.loja.desconto.tipo.DescontoParaOrcamentoComValorMaiorQueQuinhentos;
import br.com.alura.loja.desconto.tipo.SemDesconto;
import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));
		return desconto.calcular(orcamento);
	}

}
