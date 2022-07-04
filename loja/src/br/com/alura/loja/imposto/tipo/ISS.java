package br.com.alura.loja.imposto.tipo;

import br.com.alura.loja.orcamento.orcavel.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto {

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	protected BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
