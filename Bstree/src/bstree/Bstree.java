/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstree;

/**
 *
 * @author M.Ahsan
 */
public class Bstree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bstree bst=new Bstree();
        
        System.out.println(bst.insert(10));
      System.out.println(bst.insert(10));
        System.out.println(bst.insert(9));
        System.out.println(bst.insert(11));
        System.out.println(bst.insert(1));
        System.out.println(bst.insert(20));
        System.out.println(bst.insert(4));
        System.out.println(bst.insert(0));
// System.out.println("pre order");
       // bst.preorder();
       // System.out.println("inorder");
      //bst.inorder();
       // System.out.println("post order");
       // bst.postorder();
       bst.levelordert();
    };
  
    Node root;
    private boolean insert(int val){
        if (root==null) {
            root=new Node(val);
            return true;
        }else
            return this.root.insert(val);
    }
    private boolean find(int val){
    if(root==null){
    return false;
    }else
        return this.root.find(val);
    
    }
    private boolean delete(int val){
    if(root==null){
    return false;
    }else
        return this.root.delete(val);
    }
    public void preorder(){
        if (root==null)
            System.out.println("pre order:");
        root.preorder();
    }
   public void inorder(){
       if (root==null){System.out.println("In order:");}
       root.inorder();
   } 
   public void postorder(){
   if(root==null){System.out.println("Postorder");}
   root.postorder();
   }
   public void levelordert(){
   if(root==null)
           System.out.println("level order traversal");
       System.out.println(this.root.getidata());   
   root.levelordert();
   }
};
