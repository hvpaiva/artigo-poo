package com.hvpaiva.artigopoo.anemicmodel.services;

import com.hvpaiva.artigopoo.anemicmodel.model.Atleta;
import com.hvpaiva.artigopoo.anemicmodel.model.Nadador;
import lombok.extern.java.Log;

@Log
public class NadadorService extends AtletaService {

	@Override
	public void treinar(final Atleta atleta) {
		// Corredor também é um atleta e pode usar
		// essa service, vai dar erro
		log.info(atleta.getName() + " nadou estilo " + ((Nadador) atleta).getModalidade());
		super.treinar(atleta);
	}
}
