package com.hvpaiva.artigopoo.richmodel.model;

import lombok.extern.java.Log;

@Log
public class Corredor extends Atleta {

	private Integer distanciaCorrida;

	public Corredor(final String name, final Integer distanciaCorrida) {
		super(name);
		this.distanciaCorrida = distanciaCorrida;
	}

	@Override
	public void treinar() {
		log.info(this.name + " correu " + this.distanciaCorrida + "m");
		super.treinar();
	}
}
