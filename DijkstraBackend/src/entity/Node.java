package entity;

import java.util.ArrayList;

///
public class Node implements Comparable {
	private String name;
	private ArrayList<Archer> archers = new ArrayList<>();
	private int d;
	private Node pai;
	
	public Node(String name) {
		this.name = name;
	}
	
	public void addNeighbor(Node neighbor, int weight) {
		archers.add(new Archer(this, neighbor,weight));
	}
	
	@Override
	public int compareTo(Object o) {
		if(!(o instanceof Node))
			return 0;
		Node node = (Node)o;
		 return node.name.compareTo(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getD() {
		return d;
	}

	public ArrayList<Archer> getArchers() {
		return archers;
	}

	public void setArchers(ArrayList<Archer> archers) {
		this.archers = archers;
	}

	public void setD(int d) {
		this.d = d;
	}

	public Node getPai() {
		return pai;
	}

	public void setPai(Node pai) {
		this.pai = pai;
	}
	
	

}
