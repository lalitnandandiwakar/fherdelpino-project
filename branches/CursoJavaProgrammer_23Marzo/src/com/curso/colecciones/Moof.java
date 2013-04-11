package com.curso.colecciones;

import java.util.Collections;

public class Moof {
	private int moofValue;

	Moof(int val) {
		setMoofValue(val);
	}

	@Override
	public String toString() {
		return String.valueOf(getMoofValue());
	}

	@Override
	public boolean equals(Object o) {
		if (o == null && !(o instanceof Moof))
			return false;

		Moof tmp = (Moof) o;
		return this.getMoofValue() == tmp.getMoofValue();
	}
	
//	@Override
//	public int hashCode() {
//		return moofValue;		
//	}
	
	

	public int getMoofValue() {
		return moofValue;
	}

	public void setMoofValue(int moofValue) {
		this.moofValue = moofValue;
	}

}
