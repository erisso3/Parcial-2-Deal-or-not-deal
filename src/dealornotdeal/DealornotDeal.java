/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dealornotdeal;

import GUI.Frameprincipal;
import javax.swing.SwingUtilities;

/**
 *
 * @author eriss
 */
public class DealornotDeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frameprincipal();
            }
        });
    }
    
}
