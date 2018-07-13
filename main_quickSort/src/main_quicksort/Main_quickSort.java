/*
 * To change this
license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_quicksort;

import java.util.Scanner;

/**
 *
 * @author Ramish
 */
public class Main_quickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size:");
        int maxsize=in.nextInt();
       quickSort items;
       items=new quickSort();
//        for (int i = 0; i < maxsize; i++) {
//            System.out.print("Enter items in the array:");
//            int it=in.nextInt();
        
          items.insert();
        
        items.QuickSorted();
        System.out.println("DISPLAYING THE SORTED ITEMS");
        items.display();
        
        
    }
    
}
