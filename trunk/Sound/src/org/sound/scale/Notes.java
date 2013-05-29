package org.sound.scale;

public enum Notes {

	A("A"), A$("A#"), B("B"), C("C"), C$("C#"), D("D"), D$("D#"), E("E"), F("F"), F$(
			"F#"), G("G"), G$("G#");

	private String value;

	private Notes(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
