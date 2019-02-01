package com.hvpaiva.artigopoo.richmodel.model;

import lombok.extern.java.Log;

@Log
public class Nadador extends Atleta {

	private String modalidade;

	public Nadador(final String name, final String modalidade) {
		super(name);
		this.modalidade = modalidade;
	}

	@Override
	public void treinar() {
		log.info(this.name + " nadou estilo " + this.modalidade);
		super.treinar();
	}
}
