package org.diabate.model.util;

import java.util.Arrays;

public enum Taille {
	
	XS("xs"),
	S("s"),
	M("m"),
	L("l"),
	XL("xl"),
	XXL("xxl"),
	XXXL("xxxl");
	
	private String label;
	
	private Taille (String label)
	{
		this.label = label;
	}

	public static Taille of(String label)
	{
		return Arrays.stream(values())
				.filter(value -> value.label.equals(label))
				.findFirst()
				.orElseThrow(null);
	}

}
