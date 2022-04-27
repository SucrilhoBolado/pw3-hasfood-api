package br.com.pedro.henrique.hasfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter 
@Setter
@Table(name = "TBL_ENTREGA")

public class Entrega {
	@Column(name = "ID_ENTREGA")
	@Id
	private Long ID_Entrega;
	
	@Column(name = "TX_NOME_CLIENTE")
	private String Nome_Cliente;
	
	@Column(name = "TX_ENDERECO")
	private String Endereco;
	
	@Column(name = "ID_PEDIDO")
	private Long Id_Pedido;
	
	@JoinColumn(name = "TBL_PEDIDO")
	private Pedido Id_Pedido1;
}
