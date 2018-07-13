/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_hashtable;

/**
 *
 * @author M.Ahsan
 */
public class Driver_Hashtable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hashtable ht=new Hashtable(3);
       // ht.Hashcode(89);

        System.out.println("hash code of 8");
       
        System.out.println(ht.Hashcode(8));
        System.out.println("hash code of 4");
        System.out.println(ht.Hashcode(4));
        ht.Insert(8);
        ht.Insert(8);
        System.out.println();
        //System.out.println(ht.Insert(89));
       ht.Insert(4);
       
        ht.displayhashtable();
        
   
    }
    
}
