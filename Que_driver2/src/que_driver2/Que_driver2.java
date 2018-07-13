/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que_driver2;

/**
 *
 * @author M.Ahsan
 */
public class Que_driver2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue q=new Queue(100);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);
        //System.out.println(q.displayfront());
        //System.out.println(q.displayrear());
        
       System.out.println(q.displayque());
    }
    
}
