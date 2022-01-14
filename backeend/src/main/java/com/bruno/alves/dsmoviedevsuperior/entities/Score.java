package com.bruno.alves.dsmoviedevsuperior.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ScorePk id = new ScorePk();
	private Double value;

}
