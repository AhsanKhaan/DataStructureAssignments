/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph_driver;

/**
 *
 * @author M.Ahsan
 */
public class Graph_driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Graph g=new Graph();
    g.AddVertices('A');
   g.AddVertices('B');
   g.AddVertices('C');
   //g.AddVertices('D');
   //g.AddVertices('E');
   //g.AddVertices('F');
  // g.AddVertices('G');
   //g.AddVertices('H');
   //g.AddVertices('I');
   g.addedge(0, 1);
   g.addedge(0, 2);
   //g.addedge(0, 3);
   //g.addedge(0, 4);
   //g.addedge(1, 5);
   //g.addedge(5, 7);
   //g.addedge(3, 6);
  // g.addedge(6, 8);
 g.displaymatrix();
   g.dfs();
//        System.out.println("for weighted");
//   Directedgraph g2=new Directedgraph();
//   g2.AddVertices('A');
//   g2.AddVertices('B');
//   g2.AddEdge(0, 0,8);
//   g2.AddEdge(0, 1,9);
//   g2.displaymatrices();
    };
    
}
