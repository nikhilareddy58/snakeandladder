package general;

public class InorderLevelOrder {

	public static void main(String[] args) {
		int[] a   = {4, 8, 10, 12, 14, 20, 22};
		int[] b  = {20, 8, 22, 4, 12, 10, 14};
		Node node=util(a,b,0,a.length-1,0,b.length-1);
		print(node);

	}
	
	public static void print(Node node) {
		if(node==null)
			return;
		
		print(node.left);
		System.out.println(node.val);
		print(node.right);
	}
	
	public static Node util(int[] a,int[] b, int i,int j, int x,int y) {
		if(i>=j||x==y)return null;
		boolean found = false;
		int m;
		for(m=i;m<=j;m++) {
			if(b[x]==a[m]) {
				found=true;
				break;
			}
		}
		if(!found)return null;
		Node root=new Node(b[x]);
		root.left=util(a,b,i,m-1,x++,y);
		root.right=util(a,b,m+1,j,x++,y);
		return root;
		
	}

}

//in[]    = {4, 8, 10, 12, 14, 20, 22};
//level[] = {20, 8, 22, 4, 12, 10, 14};

//          			20
// 			       8        22
//             4      12
//                 10     14


