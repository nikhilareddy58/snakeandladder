package general;

public class PostOrder {

	public static void main(String[] args) {
		int[] a = {4, 2, 5, 1, 3, 6};
		int[] b = {1, 2, 4, 5, 3, 6};
		Node node=util(a,b,0,a.length-1);
		print(node);
		
	}
	
	public static void print(Node node) {
		if(node==null)
			return;
		
		print(node.left);
		print(node.right);
		System.out.println(node.val);

	}

	public static Node util(int[] a,int[] b,int i,int j) {
		if(i>j) {
			return null;
		}
		System.out.println(i+" "+j);
		int m=0,n=0;
		boolean found=false;
		for( m=0;m<b.length;m++) {
			for( n=i;n<=j;n++) {
				if(a[n]==b[m]) {
					found =true;
					break;
				}
			}
			if(found)break;

		}
		System.out.println("n is: "+n);
		Node node=new Node(b[m]);
		node.left=util(a,b,i,n-1);
		node.right=util(a,b,n+1,j);
		return node;
	}
}
