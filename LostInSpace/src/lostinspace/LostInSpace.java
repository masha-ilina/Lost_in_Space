/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostinspace;

/**
 *
 * @author Etienne
 */
public class LostInSpace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map mapOne = new Map();
        
        mapOne.setDescription("Tony Etienne");
        mapOne.setRowCount(6.00);
        mapOne.setColumnCount(5.00);
        mapOne.setCurrentRow(6.00);
        mapOne.setCurrentColumn(5.00);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
    }
    
}
