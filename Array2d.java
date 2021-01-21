package PA8;
public class Array2d {

	public static void shiftRowsDown(int[][] jagged) { // complete this method
		for (int r = jagged.length - 1;  r > 0 ; r--) {
	        int [] temp = jagged[r-1];
	        jagged[r-1] = jagged[r];
	        jagged[r] = temp;
	    }
	}
    
    private static int[] add(int[] arr1, int[] arr2) { // complete this method
    	int l;
    	int[] arr3;
    	int[] arr4;
    	if (arr1.length > arr2.length) {
    		l = arr1.length;
    		arr3 = new int[l];
    		arr4 = new int[l];
    		for(int i = 0; i <= arr1.length; i++) {
    			arr3[i] = arr1[i];
    		}
    		for(int j = 0; j <= arr2.length; j++) {
    			arr4[j] = arr2[j];
    		}
    	}
    	else if(arr2.length > arr1.length) {
    		l = arr2.length;
    		arr3 = new int[l];
    		arr4 = new int[l];
    		for(int i = 0; i <= arr2.length; i++) {
    			arr3[i] = arr2[i];
    		}
    		for(int j = 0; j <= arr2.length; j++) {
    			arr4[j] = arr1[j];
    		}
    	}
    	else {
    		l = arr1.length;
    		arr3 = new int[l];
    		arr4 = new int[l];
    		for(int i = 0; i <= arr1.length; i++) {
    			arr3[i] = arr1[i];
    		}
    		for(int j = 0; j <= arr2.length; j++) {
    			arr4[j] = arr2[j];
    		}
    	}
    	for(int x = 0; x <= arr3.length; x++) {
    		arr3[x] += arr4[x];
    	}
    	return arr3;
    }

	public static int[][] add(int[][] jagged1, int[][] jagged2) { // complete this method
		int l;
		int k;
		int[][] jagged3;
		int[][] jagged4;
		if (jagged1.length > jagged2.length){
			l = jagged1.length;
			k = jagged1[0].length;
			jagged3 = new int[l][k];
			jagged4 = new int[l][k];
			for(int i = 0; i <= jagged1.length; i++) {
				for(int j = 0; j <= jagged1[0].length; i++) {
					jagged3[i][j] = jagged1[i][j];
				}
			}
			for(int i = 0; i <= jagged2.length; i++) {
				for(int j = 0; j <= jagged2[0].length; i++) {
					jagged4[i][j] = jagged2[i][j];
				}
			}
		}
		else if (jagged2.length > jagged1.length) {
			l = jagged2.length;
			k = jagged2[0].length;
			jagged3 = new int[l][k];
			jagged4 = new int[l][k];
			for(int i = 0; i <= jagged2.length; i++) {
				for(int j = 0; j <= jagged2[0].length; i++) {
					jagged3[i][j] = jagged2[i][j];
				}
			}
			for(int i = 0; i <= jagged1.length; i++) {
				for(int j = 0; j <= jagged1[0].length; i++) {
					jagged4[i][j] = jagged1[i][j];
				}
			}
		}
		else {
			l = jagged1.length;
			k = jagged1[0].length;
			jagged3 = new int[l][k];
			jagged4 = new int[l][k];
			for(int i = 0; i <= jagged1.length; i++) {
				for(int j = 0; j <= jagged1[0].length; i++) {
					jagged3[i][j] = jagged1[i][j];
				}
			}
			for(int i = 0; i <= jagged2.length; i++) {
				for(int j = 0; j <= jagged2[0].length; i++) {
					jagged4[i][j] = jagged2[i][j];
				}
			}
		}
		for(int x = 0; x <= jagged3.length; x++) {
			for(int y = 0; y <= jagged4[0].length; y++) {
				jagged3[x] = add(jagged3[x], jagged4[x]);
			}
		}
		return jagged3;
	}

	private static boolean verifySquare(int[][] A) { // complete this method
		for(int i = 0; i < A.length; i++) {
            if(A.length == A[i].length) {
                return true;
            }else {
                break;
            }
        }
        return false;
	}

	public static boolean isOrthogonal(int[][] A) { // complete this method
		boolean var = verifySquare(A);
	    int[][] B = new int[A.length][A[0].length];
	    int[][] M;
	    int numRow = A.length;
	    int numCol = A[0].length;
	    for(int i = 0; i <=  numRow; i++) {
	        for(int j = 0; j <=  numCol; i++) {
	                B[i][j] = A[i][j];

	        }
	    }

	    transpose(B);
	    M = multiply(A, B);
	    
	}

	private static void transpose(int[][] A) {
		for (int r = 0; r < A.length; r++)
			for (int c = r+1; c < A.length; c++) {
				int temp = A[r][c];
				A[r][c] = A[c][r];
				A[c][r] = temp;
			}
	}

	private static int[][] multiply(int[][] A, int[][] B) {
		int n = A.length;
		int[][] M = new int[n][n];
		for (int r = 0; r < n; r++)
			for (int c = 0; c < n; c++)
				for (int k = 0; k < n; k++)
					M[r][c] += A[r][k] * B[k][c];
		return M;
	}
}