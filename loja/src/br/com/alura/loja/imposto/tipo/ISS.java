package br.com.alura.loja.imposto.tipo;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.Imposto;
import br.com.alura.loja.orcamento.Orcamento;

public class ISS implements Imposto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
