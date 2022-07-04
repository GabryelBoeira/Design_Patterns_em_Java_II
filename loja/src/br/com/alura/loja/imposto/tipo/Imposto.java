package br.com.alura.loja.imposto.tipo;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.orcavel.Orcamento;

public abstract class Imposto {

	private final Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImposto = realizarCalculo(orcamento);
		BigDecimal valorOutroImposto = BigDecimal.ZERO;

		if (outroImposto != null) {
			valorOutroImposto = outroImposto.calcular(orcamento);
		}
		return valorImposto.add(valorOutroImposto);
	}

}
