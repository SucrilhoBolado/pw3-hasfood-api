package br.com.pedro.henrique.hasfood.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.pedro.henrique.hasfood.enums.StatusPedidoEnum;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter 
@Setter
@Table(name = "TBL_PEDIDO")

public class Pedido {
	@Column(name = "ID_PEDIDO")
	@Id
	private Long ID_Pedido;
	
	@Column(name = "DT_PEDIDO")
	private LocalDate Dt_Pedido;
	
	@Enumerated(EnumType.STRING)
	private StatusPedidoEnum Status;
	
	@Column(name = "ID_RESTAURANTE")
	private Long Id_Restaurante;
	
	
}
