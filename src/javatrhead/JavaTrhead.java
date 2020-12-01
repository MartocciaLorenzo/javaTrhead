/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatrhead;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author martoccia.lorenzo
 */
public class JavaTrhead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      processo T1 = new processo("T1");
//      T1.start();
//        processo t2 = new processo("T2");
//        processoRunnable p1 = new processoRunnable("p1");
//        Thread t1 = new Thread(p1);
//        t1.start();
         conto c = new conto(2000);
         sportello sport1 = new sportello(c);
         sportello sport2 = new sportello(c);
         Thread genitore1 = new Thread (sport1);
         Thread genitore2 = new Thread (sport2);
         genitore1.start();
         genitore2.start();
         sport1.versa(500);
         sport2.versa(500);
//         try {
//            Thread.sleep(5000);
//             System.out.println(c.saldo());
//        } catch (InterruptedException ex) {
//            Logger.getLogger(JavaTrhead.class.getName()).log(Level.SEVERE, null, ex);
//        }
         
    }
    
}
