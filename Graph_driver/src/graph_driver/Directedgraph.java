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
public class Directedgraph {

    private int max_vertices;
    private Vertex[] verticeslist;
    private int[][] adjancymatrix;
    private int nvertices;

    public Directedgraph() {
        this.max_vertices = 3;
        this.verticeslist =new Vertex[max_vertices];
        this.adjancymatrix = new int[max_vertices][max_vertices];
        this.nvertices = 0;
    }
public Vertex[] getverticeslist(){
return this.verticeslist;
}
    public void AddVertices(char vertex) {
        this.verticeslist[nvertices++] = new Vertex(vertex);
    }

    public void AddEdge(int start, int end, int weight) {
        this.adjancymatrix[start][end] = weight;
    }
    public void displayvertex(char vertex){
        
            System.out.println(verticeslist[vertex].getlabel());
        
    }
    public void displaymatrices(){
        for (int i = 0; i < verticeslist.length; i++) {
            for (int j = 0; j <verticeslist.length; j++) {
                System.out.print(this.adjancymatrix[i][j]+" ");
            }
            System.out.println();
        }
    
    }
};
