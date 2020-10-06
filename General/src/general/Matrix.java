package general;

public class Matrix {

	public static void main(String[] args) {
		int a[][] = {{1,0,0,1},
	             {0,1,1,1},
	             {1,0,0,1}};
	      int i = 3;
	      int j = 4;
	      System.out.println(count(a, i, j));;
	}
	
	public static int count(int[][] a, int m, int n) {

	    int count = 0;

	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {

	            if (a[i][j] == 1) {
	                if (i - 1 >= 0 && j - 1 >= 0 && a[i - 1][j - 1] == 1) {
	                    count = count + 1;

	                }
	                if (i - 1 >= 0 && a[i - 1][j] == 1) {
	                    count = count + 1;
	                }
	                if (i - 1 >= 0 && j + 1 < n && a[i - 1][j + 1] == 1) {
	                    count = count + 1;
	                }
	                if (j + 1 < n && a[i][j + 1] == 1) {
	                    count = count + 1;
	                }
	            }
	        }
	    }


	    return count;
	}

}
