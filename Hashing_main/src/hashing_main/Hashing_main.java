/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing_main;

/**
 *
 * @author prompt
 */
public class Hashing_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashingTable ht=new HashingTable(5);
        ht.insert(28);
        ht.insert(22);
        ht.insert(33);
        ht.display();
        System.out.println();
        int con=ht.find(33);
        System.out.println("    "+con);
        System.out.println();
        ht.delete(33);
        ht.display();
        // TODO code application logic here
    }
    
}
