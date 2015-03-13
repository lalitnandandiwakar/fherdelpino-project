/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sl314.model;

/**
 *
 * @author delpinof
 */
public class League {
    private int year;
    private String season;
    private String title;
    
    /**
     * 
     * @param year
     * @param season
     * @param title 
     */
    public League(int year, String season, String title) {
        this.year = year;
        this.season = season;
        this.title = title;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the season
     */
    public String getSeason() {
        return season;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    
}
