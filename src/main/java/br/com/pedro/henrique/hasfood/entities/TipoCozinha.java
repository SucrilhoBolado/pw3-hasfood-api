package br.com.pedro.henrique.hasfood.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tbl_tipo_cozinha")
public class TipoCozinha {
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="nome")
	private String nome;

}
