package com.hvpaiva.artigopoo.anemicmodel.services;

import com.hvpaiva.artigopoo.anemicmodel.model.Atleta;
import com.hvpaiva.artigopoo.anemicmodel.model.Corredor;
import lombok.extern.java.Log;

@Log
public class CorredorService extends AtletaService {

	@Override
	public void treinar(final Atleta atleta) {
		// Se eu passar um nadador aqui
		// ele só vai apresentar a mensagem genérica
		// de AtletaService, mas não é o comportamento
		// esperado.
		if (atleta instanceof Corredor)
			log.info(atleta.getName() + " correu " + ((Corredor) atleta).getDistanciaCorrida() + "m");
		super.treinar(atleta);
	}
}
