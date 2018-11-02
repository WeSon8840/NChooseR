/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nchooser;

import javax.swing.*;

/**
 *
 * @author glSon8840
 */
public class NChooseR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String listing = "";
        int n,r,numways;
        
        String myInputn = JOptionPane.showInputDialog(
            "This program will calculate the number of ways to choose r "
                    + "different objects from a set of n objects. \n"+
            "How many objects would you like to choose?");
        n = Integer.parseInt(myInputn);
        
        String myInputr = JOptionPane.showInputDialog("How many objects are there to chosse from?");
        r = Integer.parseInt(myInputr); 
        
        numways = fact(n)/(fact(r)*fact(n-r));
        
        JOptionPane.showMessageDialog(null, "There are " + numways + " to choose " + 
                n + " objects from a set of " + r + " objects");
    }
    
    
    
    public static int fact(int n){
        if((n == 0) || (n == 1)) {
            return 1;
        }
        else {
            return (n * fact(n - 1));
        }
  }

}
