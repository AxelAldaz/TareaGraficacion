/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIFO;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author 'Axel
 */
public class LIFO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String[] words = { "Kevin", "Alberto", "Jorge", "", "Juan", "Fransisco", "Emma", "Antonio", "Vianey","Rodrigo" };
            Random random = new Random();
            Scanner sc = new Scanner(System.in);
            Stack lifo = new Stack();
            int cant = sc.nextInt();
            for (int i = 0; i < cant; i++)
            {
                  Random rnd = new Random();
             
                int rand = rnd.nextInt(9);
                lifo.add(words[rand]); 
                System.out.println( words[rand]+" "+rand);
            }
         System.out.println();
            for (int j = 0; j < cant; j++)
            {
    
                 System.out.println(lifo.pop() );
            }

    }
    
}
