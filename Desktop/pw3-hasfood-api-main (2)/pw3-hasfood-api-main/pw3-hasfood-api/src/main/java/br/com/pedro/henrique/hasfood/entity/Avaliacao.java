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
@Table(name = "TBL_AVALIACAO")

public class Avaliacao {
	@Column(name = "ID_AVALIACAO")
	@Id
	private Long Id_Avaliacao;
	
	@Column(name = "TX_COMENTARIO")
	private String Comentario;
	
	@Column(name = "NR_NOTA")
	private Long Nota;
	
	@JoinColumn(name = "TBL_PEDIDO")
	private Pedido Id_Pedido2;
}
