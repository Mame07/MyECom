package org.diabate.model.util;

import java.util.Arrays;

public enum Couleur {

	BLANC("blanc"),
	NOIR("noir"),
	GRIS("gris"),
	BLEU("bleu"),
	ROUGE("rouge"),
	VERT("vert"),
	JAUNE("jaune"),
	ORANGE("orange"),
	ROSE("rose");
	
	private String label;
	
	private Couleur(String label)
	{
		this.label = label;
	}

	public static Couleur of(String label)
	{
		return Arrays.stream(values())
				.filter(value -> value.label.equals(label))
				.findFirst()
				.orElseThrow(null);
	}
	
}
