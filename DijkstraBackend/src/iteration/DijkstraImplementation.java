package iteration;

import java.util.ArrayList;

import entity.Archer;
import entity.Graph;
import entity.Node;
import entity.Queue;

public class DijkstraImplementation  {
	private Graph g;
	private Node begin;
	private Queue queue = new Queue();
	public DijkstraImplementation(Graph g, Node begin) {
		super();
		this.g = g;
		this.begin = begin;
	}
	
	public void Dijkstra(){
		InitNodes();
		
		while(!queue.isQueueEmpty()) {
			
			Node minimum = queue.extractMin();
			
			for(int i=0 ; i<minimum.getArchers().size() ; i++) 
				
				if(queue.isQueueContainNode(minimum.getArchers().get(i).getNeighborNode(minimum))) 
					
					if(minimum.getD() + minimum.getArchers().get(i).getWeight() < minimum.getArchers().get(i).getNeighborNode(minimum).getD()) {
						
						minimum.getArchers().get(i).getNeighborNode(minimum).setD(minimum.getD() + minimum.getArchers().get(i).getWeight());
						
						minimum.getArchers().get(i).getNeighborNode(minimum).setPai(minimum);
					
					
				}
		}
		
	}
	
	
	private void InitNodes() {
		for(int i=0 ; i<g.getNodes().size() ; i++) 
			
			if(g.getNodes().get(i).equals(begin)) {
				
				g.getNodes().get(i).setD(0);
				
				g.getNodes().get(i).setPai(null);
				
				queue.addNode(begin);
				
			}
		
			else {
				
				g.getNodes().get(i).setD(500);
				
				g.getNodes().get(i).setPai(null);
				
				queue.addNode(g.getNodes().get(i));
			}
		
	}
	
	
	
	
	

}
