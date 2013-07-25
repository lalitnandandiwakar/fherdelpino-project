/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soccer.leagues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sl314.model.League;

/**
 *
 * @author delpinof
 */
public class Leagues {

    private List<League> leagues;
    private List<String> errors;
    private static Leagues instance = new Leagues();

    public static Leagues getInstance() {
        return instance;
    }

    private Leagues() {
        super();
        League[] arrayLeague = {new League(2003, "Spring", "Soccer League (Spring '03)"),
            new League(2003, "Summer", "Summer Soccer Fest 2003"),
            new League(2003, "Fall", "Fall Soccer League (2003)"),
            new League(2004, "Spring", "Soccer League (Spring '04)"),
            new League(2004, "Summer", "The summer of soccer ove 2004"),
            new League(2004, "Fall", "Fall Soccer League (2004)")};
        leagues = new ArrayList<League>(Arrays.asList(arrayLeague));
        errors = new ArrayList<String>();
    }

    public List<League> getAllLeagues() {
        return leagues;
    }

    public List<String> getAllErrors() {
        return errors;
    }
}
