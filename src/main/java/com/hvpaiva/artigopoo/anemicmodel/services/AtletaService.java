package com.hvpaiva.artigopoo.anemicmodel.services;

import com.hvpaiva.artigopoo.anemicmodel.model.Atleta;
import lombok.extern.java.Log;

@Log
public class AtletaService {

	public void treinar(Atleta atleta) {
		log.info(atleta.getName() + " realizou seu treino!");
	}

}
