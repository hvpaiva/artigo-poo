package com.hvpaiva.artigopoo.richmodel.model;

import lombok.extern.java.Log;

@Log
public class Atleta {

	protected String name;

	public Atleta(final String name) {
		this.name = name;
	}

	public void treinar() {
		log.info(this.name + " realizou seu treino!");
	}
}
