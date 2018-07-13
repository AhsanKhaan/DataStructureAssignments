/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_heapsort;

/**
 *
 * @author M.Ahsan
 */
public class Driver_Heapsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Heap h=new Heap(8);
        h.add(4);
        h.add(1);
        h.add(4);
        h.add(5);
        
        System.out.println(h.poll());
        System.out.println(h.toString());
    }
    
}
