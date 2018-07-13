/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.hashtable;

/**
 *
 * @author M.Ahsan
 */
public class MainHashtable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashTable ht=new HashTable(3);
        ht.hashfn(1);
       System.out.println(ht.hashfn(1));
        ht.displaytable();
    }
    
}
