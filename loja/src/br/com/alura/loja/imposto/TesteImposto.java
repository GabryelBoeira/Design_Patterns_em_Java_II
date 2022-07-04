package br.com.alura.loja.imposto;

import br.com.alura.loja.imposto.tipo.ICMS;
import br.com.alura.loja.imposto.tipo.IPI;
import br.com.alura.loja.imposto.tipo.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calc = new CalculadoraDeImpostos();

        System.out.println(calc.calcular(orcamento, new ISS(new IPI(new ICMS(null)))));
    }
}
