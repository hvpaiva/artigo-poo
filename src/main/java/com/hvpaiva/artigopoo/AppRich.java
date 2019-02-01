package com.hvpaiva.artigopoo;

import com.hvpaiva.artigopoo.richmodel.model.Atleta;
import com.hvpaiva.artigopoo.richmodel.model.Corredor;
import com.hvpaiva.artigopoo.richmodel.model.Nadador;

public class AppRich {

	public static void main(String[] args) {
		//- E sem POJO? Usando os princípios básicos de POO

		Atleta atleta = new Atleta("João");
		atleta.treinar(); // João realizou seu treino!

		Atleta nadador = new Nadador("Carlos", "craw");
		nadador.treinar(); // Carlos nadou estilo craw. // João realizou seu treino!

		Atleta tester = new Corredor("José", 100);
		tester.treinar(); // José correu 100m. José realizou seu treino!

		// Nestes casos, a classe é responsável por seu
		// comportamento, sendo impossível, assim, que
		// uma instância use o comportamento de outra acidentalmente.

	}
}
