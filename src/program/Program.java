/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import entities.num.OrderStatus;
import java.util.Date;

/**
 *
 * @author Jackson Antunes
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        controle order = new controle(1020,new Date(),OrderStatus.confeccao);
        System.out.println(order);
    
    }
    
}
