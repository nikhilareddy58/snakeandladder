package general;

public class NthNode {

	static int res;
	static int count;
	static boolean flag=false;

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
		
		count = 0;
		//util(root, 3);
		//System.out.println(res);

		util1(root,6);
		System.out.println(res);
	}

	public static void util(Node node, int n) {
		if (node == null)
			return;
		if (count <= n) {
			util(node.left, n);
			count++;
			if (count == n)
				res = node.val;
			util(node.right, n);
		}
	}

	public static void util1(Node node, int val) {
             if(node==null)
        	 return;
             util1(node.left,val);
             if(flag){
        		 res=node.val;
        		 flag=false;
        		 return;
        	 }
        	 if(val==node.val) {
        		 flag=true;
        	 }
        	 util1(node.right,val);
        	 
         
	}

}
