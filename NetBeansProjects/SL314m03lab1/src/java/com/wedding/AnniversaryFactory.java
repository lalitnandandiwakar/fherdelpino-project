/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wedding;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author delpinof
 */
public class AnniversaryFactory {

    public static List<AnniversaryRecord> getAnniversaryRecords() {
        AnniversaryRecord[] an = {new AnniversaryRecord(1, "Paper"),
            new AnniversaryRecord(2, "Cotton"),
            new AnniversaryRecord(3, "Leather"),
            new AnniversaryRecord(4, "Linen, Silk"),
            new AnniversaryRecord(5, "Wood"),
            new AnniversaryRecord(6, "Iron"),
            new AnniversaryRecord(7, "Wool, Copper"),
            new AnniversaryRecord(8, "Bronze"),
            new AnniversaryRecord(9, "Pottery, China"),
            new AnniversaryRecord(10, "Tin, Aluminum"),
            new AnniversaryRecord(11, "Steel"),
            new AnniversaryRecord(12, "Silk"),
            new AnniversaryRecord(13, "Lace"),
            new AnniversaryRecord(14, "Ivory"),
            new AnniversaryRecord(15, "Crystal"),
            new AnniversaryRecord(20, "China"),
            new AnniversaryRecord(25, "Silver"),
            new AnniversaryRecord(30, "Pearl"),
            new AnniversaryRecord(35, "Coral"),
            new AnniversaryRecord(40, "Ruby"),
            new AnniversaryRecord(45, "Sapphire"),
            new AnniversaryRecord(50, "Gold"),
            new AnniversaryRecord(55, "Emerald"),
            new AnniversaryRecord(60, "Diamond")};

        return Arrays.asList(an);
    }
}
