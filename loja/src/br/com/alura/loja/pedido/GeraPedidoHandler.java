package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.orcavel.Orcamento;
import br.com.alura.loja.orcamento.orcavel.ItemOrcamento;
import br.com.alura.loja.pedido.acoes.AcaoAposGerarPedido;

public class GeraPedidoHandler {

	private final List<AcaoAposGerarPedido> acoesAposGerarPedido;
	
	// injecao de dependencias para servicos de infra
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoesAposGerarPedidos) {
		acoesAposGerarPedido = acoesAposGerarPedidos;
	}

	public void executar(GeraPedido geraPedido) {
		Orcamento newOrcamento = new Orcamento();
		newOrcamento.adicionarItem(new ItemOrcamento(geraPedido.getValorOrcamento()));

		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), newOrcamento);
		this.acoesAposGerarPedido.forEach(a -> a.executarAcao(pedido));
	}
	
}
