package iteration;

import java.util.Comparator;

import entity.Node;

public class CompareNodesD implements Comparator<Node> {

	@Override
	public int compare(Node o1, Node o2) {
		return o1.getD() < o2.getD() ? -1 : o1.getD() > o2.getD() ? 1 : 0;
	}

}
