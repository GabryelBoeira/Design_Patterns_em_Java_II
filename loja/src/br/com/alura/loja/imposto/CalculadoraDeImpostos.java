package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.tipo.Imposto;
import br.com.alura.loja.orcamento.orcavel.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
