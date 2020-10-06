package general;

public class InorderPredSucc {
    static int prev=0;
    static boolean prevSet=false;
    
    static int suc=0;
    static boolean sucSet=false;
	public static void main(String[] args) {

	}
	
	public static void util(Node node) {
		if(node==null)
			return ;
		util(node.left);
		//node.val=getPred()+getSuc();
		util(node.right);
	}
	public static int getSuc(Node node,int val) {
		if(node==null)
			return 0;
		getPred(node.left,val);
		if(!sucSet)
			prev=node.val;
		if(val==node.val) {
			prevSet=true;
			return prev;
		}
		
		getPred(node.right,val);
		return 0;
        
	}
	
	public static int getPred(Node node,int val) {
		if(node==null)
			return 0;
		getPred(node.left,val);
		if(val==node.val) {
			prevSet=true;
			return prev;
		}
		if(!prevSet)
		prev=node.val;
		getPred(node.right,val);
		return 0;
        
	}
}
