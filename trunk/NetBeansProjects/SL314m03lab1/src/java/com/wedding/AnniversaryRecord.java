/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wedding;

/**
 *
 * @author delpinof
 */
public class AnniversaryRecord {
    
    private int year;
    private String name;
    
    public AnniversaryRecord(int year, String name) {
        this.year = year;
        this.name = name;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    
    
}
