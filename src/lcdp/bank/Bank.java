/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcdp.bank;

import java.io.IOException;
import static lcdp.bank.Bank.b;

/**
 *
 * @author as
 */

        
public class Bank  {     
 static Bank1 j = new Bank1();
  public static int i;
  public static int gooo = 0;// amount you draw
  static Bank1 []b;
  public static boolean flag; // boolean that true if you are vip account6

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
     b = j.load();
new LOGIN().setVisible(true);
       

    }
    
}
