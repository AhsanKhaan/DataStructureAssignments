///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package trie;

import java.util.HashMap;




public class Node {
	public Node parent;
	public Boolean endOfWord = false; //Does this Node mark the end of a particular word?
	public HashMap<Character,Node> children = new HashMap<Character,Node>();
}