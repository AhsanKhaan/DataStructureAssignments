/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasharray_sep_chain;

/**
 *
 * @author prompt
 */
public class LinkList {
    
    public Node first;
    
    
    
    public LinkList(){
    this.first=null;
    }
    
   public boolean isempty(){
   
   return (first==null);
   
   }
   
   
   
   
   public void insertAtFirst(int val){
   Node node=new Node(val);
   node.setNode(first);
   first=node;
  
   }                                        //insert at first ends
   
   
   
   
   public void insertatend(int val){
   Node current=first;
   Node newNode=new Node(val);
   if(!isempty()){
       while(current.getNode()!=null){
   current=current.getNode();
   }
   current.setNode(newNode);
   }
   else
       first=newNode;
       
                                        
  
   }                                        //append function ends
   
   
   
   
   public void deleteFirst(){
       
   if(!isempty())
       first=first.getNode();
   else
       System.out.println("Impossible ");
   }                                           //deletefirst function ends
   
   
   
   
   public Node find(int data){
   Node current=first;
   while(current!=null && current.getData()!=data){
   current=current.getNode();
   }
      // System.out.println(" "+current.getData());
   if (current==null)
       return null;
   else
       return current;
               
   }                                               //find function ends
   
   
   
   public void insertAt(int pos,int placed){
   
   Node current=first;
   Node newnode=new Node(placed);
     while(current!=null &&current.getData()!=pos){
   current=current.getNode();
   }
   if (current==null)
           System.out.println("Imposiible to insert ");
   else{
   newnode.setNode(current.getNode());
   current.setNode(newnode);
   }
   //first=current;
   
   }
   
   
  
   
   public void displayList(){
   Node current=first;
       //System.out.println(" "+current.getData());
   while(current!=null){
       System.out.println(" hh");
   current.display();
   current=current.getNode();
   }
   
   }                                           //displaylist ends
    
    
    
}
