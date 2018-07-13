/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_linklist;

/**
 *
 * @author M.Ahsan
 */
public class Driver_linklist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        S_Linklist ll=new S_Linklist();
        ll.add(10);
        ll.add(3);
        //System.out.println(ll.remove(3));
        System.out.println(ll.remove(10));
        System.out.println(ll.getsize());
//           DLinklist ll=new DLinklist();
//         // System.out.println(ll.getsize());
//        //  ll.add(2);
//          
//         // ll.add(2);
//      //    System.out.println(ll.add(24));
//          
//        //  System.out.println(ll.remove(24));
//          //          System.out.println(ll.getsize());
//               //ll.find(2);
//               System.out.println(ll.find(2));
    }
    
}
