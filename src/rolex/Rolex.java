/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rolex;

/**
 *
 * @author User
 */
public class Rolex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyTime t = new MyTime(1, 0, 59, true);
        
        t.tickBySecond();
        t.displayTime12();
        t.displayTime24();
    }
    
}
