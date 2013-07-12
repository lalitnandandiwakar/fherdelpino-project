package com.curso;

public class Anagrama {

	final static String[] listaNoPermitido = new String[] { " ", "?", "!", "," };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String palabra = "pedro";

		String otraPalabra = "pORDe";

		System.out.println(esAnagrama(palabra, otraPalabra));
	}

	public static boolean esAnagrama(String cadena, String anagrama) {

		cadena = limpiaCadena(cadena.toLowerCase());
		anagrama = limpiaCadena(anagrama.toLowerCase());

		for (Character c : cadena.toCharArray()) {
			anagrama = anagrama.replaceFirst(c.toString(),"");
		}

		return anagrama.isEmpty() ? true : false;
	}

	static String limpiaCadena(String cadena) {

		int encontrado = 0;

		for (String noPermitido : listaNoPermitido) {
			encontrado = cadena.indexOf(noPermitido);
			if (encontrado > 0) {
				cadena = cadena.substring(0, encontrado)
						+ cadena.substring(encontrado + 1, cadena.length());
			}
		}

		return cadena;
	}

}
