package br.com.caelum.eats.pedido;

import br.com.caelum.eats.dto.ItemDoCardapioDto;
import br.com.caelum.eats.pedido.ItemDoPedido;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDoPedidoDto {

	private Long id;
	private Integer quantidade;
	private String observacao;
	private ItemDoCardapioDto itemDoCardapio;

	public ItemDoPedidoDto(ItemDoPedido item) {
		this(item.getId(), item.getQuantidade(), item.getObservacao(), new ItemDoCardapioDto(item.getItemDoCardapio()));
	}

}
