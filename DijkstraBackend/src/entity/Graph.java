package entity;

import java.util.ArrayList;

public class Graph {
	private ArrayList<Node> nodes;
	private ArrayList<Archer> archers;
	private Node beginningNode;
	public Graph(ArrayList<Node> nodes, ArrayList<Archer> archers) {
		super();
		this.nodes = nodes;
		this.archers = archers;
	}
	
	
	public Node getBeginningNode() {
		return beginningNode;
	}


	public void setBeginningNode(Node beginningNode) {
		this.beginningNode = beginningNode;
	}


	public ArrayList<Node> getNodes() {
		return nodes;
	}
	public void setNodes(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}
	public ArrayList<Archer> getArchers() {
		return archers;
	}
	public void setArchers(ArrayList<Archer> archers) {
		this.archers = archers;
	}
	
	
	
	

}
