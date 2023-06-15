package entity;


public class Archer {
	private Node node1;
	private Node node2;
	private int weight;
	public Archer(Node node, Node neighbor, int weight) {
		super();
		this.node1 = node;
		this.node2 = neighbor;
		this.weight = weight;
		node.getArchers().add(this);
		neighbor.getArchers().add(this);
	}
	
	
	
	public Node getMyNode(Node e) {
		if(e.equals(node1))
			return node1;
		return node2;
	}
	
	public Node getNeighborNode(Node e) {
		if(!e.equals(node1))
			return node1;
		return node2;
	}
	public Node getNode1() {
		return node1;
	}
	public void setNode1(Node node1) {
		this.node1 = node1;
	}
	public Node getNode2() {
		return node2;
	}
	public void setNode2(Node node2) {
		this.node2 = node2;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	


}
