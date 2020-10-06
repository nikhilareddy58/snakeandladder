package general;

import java.util.Map;
import java.util.TreeMap;

public class VerticalSum {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.left.right = new Node(5);
		root.right.left = new Node(6);
		
				//1
		    //2      3
		//4       6
    //       5  		
		TreeMap<Integer,Integer> map= new TreeMap<Integer,Integer>();
		util(root,map,0);
		
		for(Map.Entry<Integer,Integer> m:map.entrySet()) {
			System.out.println(m.getValue());
		}

	}
	
	public static void util(Node node, TreeMap<Integer,Integer> map,int level) {
		if(node==null)
			return;
		if(map.containsKey(level)) {
			map.put(level, map.get(level)+node.val);
		}else {
			map.put(level, node.val);
		}
		util(node.left,map,level-1);
		util(node.right,map,level+1);
		
	}

}
