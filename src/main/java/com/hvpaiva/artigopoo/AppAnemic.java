package com.hvpaiva.artigopoo;

import com.hvpaiva.artigopoo.anemicmodel.model.Atleta;
import com.hvpaiva.artigopoo.anemicmodel.model.Corredor;
import com.hvpaiva.artigopoo.anemicmodel.model.Nadador;
import com.hvpaiva.artigopoo.anemicmodel.services.AtletaService;
import com.hvpaiva.artigopoo.anemicmodel.services.AtletasService;
import com.hvpaiva.artigopoo.anemicmodel.services.CorredorService;
import com.hvpaiva.artigopoo.anemicmodel.services.NadadorService;

public class AppAnemic {

	public static void main(String[] args) {

		// Fazer um atleta treinar.
		Atleta atleta = new Atleta();
		atleta.setName("João");

		AtletaService atletaService = new AtletaService();
		atletaService.treinar(atleta); // João realizou seu treino!

		// Nos casos em que o atleta possui
		// uma implementação mais específica
		Nadador nadador = new Nadador();
		nadador.setName("Maria");
		nadador.setModalidade("costas");

		Corredor corredor = new Corredor();
		corredor.setName("José");
		corredor.setDistanciaCorrida(100);

		// Como o comportamento pra cada
		// tipo de atleta é diferente, é
		// necessário refatorar a service

		// Exemplo com apenas uma service
		// com condicionais verificando que
		// instância de atleta cada atleta é
		AtletasService atletasService = new AtletasService();
		atletasService.treinar(nadador); // Maria nadou estilo costas. Maria realizou seu treino!
		atletasService.treinar(corredor); // José correu 100m. José realizou seu treino!

		// Pode-se criar uma service que extende a
		// AtletaService, mas com o comportamento específico
		AtletaService corredorService = new CorredorService();
		AtletaService nadadorService = new NadadorService();

		// No entanto nada impede de usarmos
		// a service de um tipo para o outro

		// Caso em que mantemos a condicional
		// pra verificar se a instancia é de Corredor.
		corredorService.treinar(corredor); // José correu 100m. José realizou seu treino!
		corredorService.treinar(nadador); // Maria realizou seu treino!

		// Caso em que não conferimos se a
		// instancia recebida é de nadador
		nadadorService.treinar(corredor); // Error: ClassCastException
		nadadorService.treinar(nadador); // Maria nadou estilo costas. Maria realizou seu treino!

		// Pode ser argumentado que as
		// services específicas não precisam
		// extender de AtletaService,
		// mas daí eles teriam que reescrever
		// o que é genérico de atleta,
		// duplicando código.

	}
}
