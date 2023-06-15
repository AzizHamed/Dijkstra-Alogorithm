package iteration;

import java.util.ArrayList;

import entity.Archer;
import entity.Graph;
import entity.Node;

public class Main {
	public static void main(String[] args) {
		Node node1 = new Node("a");
		Node node2 = new Node("b");
		Node node3 = new Node("c");
		Node node4 = new Node("d");
		Node pai;
		
		Archer a = new Archer(node1,node2,5);
		Archer b = new Archer(node2,node3,2);
		Archer c = new Archer(node3,node4,7);
		Archer d = new Archer(node1,node4,1);
		
		ArrayList<Node> nodes = new ArrayList<>();	
		ArrayList<Archer> archer = new ArrayList<>();	

		nodes.add(node1);
		nodes.add(node2);
		nodes.add(node3);
		nodes.add(node4);
		
		archer.add(a);
		archer.add(b);
		archer.add(c);
		
		Graph g = new Graph(nodes, archer);
		
		
		DijkstraImplementation dijkstra = new DijkstraImplementation(g, node1);
		dijkstra.Dijkstra();
		for(int i=0 ; i<nodes.size(); i++) {
			System.out.println(nodes.get(i).getName() +  " path to " + node1.getName() +
			 " : ");
			pai = nodes.get(i);
			while(pai!=null) {
				System.out.print(" -----> " + pai.getName());
				pai = pai.getPai();
			}
			System.out.println();
		
		}
	  





	}
}
