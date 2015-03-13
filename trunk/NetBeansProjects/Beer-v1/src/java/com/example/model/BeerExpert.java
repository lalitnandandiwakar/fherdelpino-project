/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author delpinof
 */
public class BeerExpert {
    public List getBrands(String tipo) {
        List lista = new ArrayList();
        if(tipo.equals("pilsner")) {
            lista.add("corona");
            lista.add("tecate");
            lista.add("estrella");
            lista.add("corona");
        } else if (tipo.equals("lager")){
            lista.add("Tecate light");
            lista.add("Modelo light");
        } else if (tipo.equals("munich")) {
            lista.add("Negra Modelo");
            lista.add("Leon");
        }
      return lista;  
    }
}
