package br.com.alura.loja.orcamento.orcavel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.loja.orcamento.orcavel.ItemOrcamento;
import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.Finalizado;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel{

	private BigDecimal valor;
	private SituacaoOrcamento situacao;
	private List<Orcavel> itens;

	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.itens = new ArrayList<>();
		this.situacao = new EmAnalise();
	}

	public BigDecimal getValor() {
		//Simular lentidao do sistema
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public List<Orcavel> getItens() {
		return itens;
	}

	public void setItens(List<Orcavel> itens) {
		this.itens = itens;
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public boolean isNaoFinalizado() {
		return !(situacao instanceof Finalizado);
	}

	public void aplicarDescontoExtra() {
		BigDecimal valorDescontoExtra = this.situacao.calcularDescontoExtra(this);
		this.valor = this.valor.subtract(valorDescontoExtra);
	}

	public int getQuantidadeItens() {
		return this.itens.size();
	}

	public void adicionarItem(Orcavel item) {
		this.valor = valor.add(item.getValor());
		this.itens.add(item);
	}
}
