package com.hvpaiva.artigopoo.anemicmodel.services;

import com.hvpaiva.artigopoo.anemicmodel.model.Atleta;
import com.hvpaiva.artigopoo.anemicmodel.model.Corredor;
import com.hvpaiva.artigopoo.anemicmodel.model.Nadador;
import lombok.extern.java.Log;

@Log
public class AtletasService extends AtletaService {

	@Override
	public void treinar(final Atleta atleta) {
		// Reze pra não ser necessários mais
		// tipos de atletas, ou teremos que
		// refatorar o método.
		if (atleta instanceof Nadador) {
			log.info(atleta.getName() + " nadou estilo " + ((Nadador) atleta).getModalidade());
		} else if (atleta instanceof Corredor) {
			log.info(atleta.getName() + " correu " + ((Corredor) atleta).getDistanciaCorrida() + "m");
		}
		super.treinar(atleta);
	}
}
