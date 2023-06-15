package entity;

import java.util.ArrayList;
import java.util.Comparator;

public class Queue {
	private ArrayList<Node> nodes = new ArrayList<>();
	
	public void addNode(Node n) {
		nodes.add(n);
	}
	
	public void RemoveNode(Node n) {
		nodes.remove(n);
	}
	
	public Node extractMin() {
		Node minimumNode;
		minimumNode = nodes.get(0);
		for(int i=0 ; i< nodes.size() ; i++)
			if(nodes.get(i).getD() < minimumNode.getD())
				minimumNode = nodes.get(i);
		nodes.remove(minimumNode);
		return minimumNode;
			
		
	}
	public boolean isQueueEmpty() {
		return nodes.isEmpty();
	}
	
	public boolean isQueueContainNode(Node e) {
		return nodes.contains(e);
	}
	

}
