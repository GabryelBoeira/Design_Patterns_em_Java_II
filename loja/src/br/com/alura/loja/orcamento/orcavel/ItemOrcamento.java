package br.com.alura.loja.orcamento.orcavel;

import java.math.BigDecimal;

public class ItemOrcamento implements Orcavel {

    private BigDecimal valor;

    public ItemOrcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
