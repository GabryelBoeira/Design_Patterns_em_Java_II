package br.com.alura.loja.imposto.tipo;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class IPI extends Imposto {

    public IPI(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    protected BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.14"));
    }
}
