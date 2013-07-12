package com.curso.simulador;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class NumberNames {
	private HashMap<String, Integer> map = new HashMap<String, Integer>();

	public void put(String name, int value) {
		map.put(name, value);
	}
	
	public Set<String> getNames() {
		
		for (Entry<String,Integer> entry:  map.entrySet()) {
			entry.getKey();
			entry.getValue();
		}
		return map.keySet();
	}
}
