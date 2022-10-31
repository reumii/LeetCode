class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
      for(int i=0; i<matrix[0].length; i++) {
			 int num = matrix[0][i];
			 for(int j=1; j<matrix.length && (i+j) < matrix[0].length; j++) {
				if(num != matrix[j][i+j]) return false;
			 }
		 }
		 
		 for(int i=1; i<matrix.length; i++) {
			 int num = matrix[i][0];
			 for(int j=1; j<matrix[0].length && (i+j) < matrix.length; j++) {
				if(num != matrix[i+j][j]) return false;
			 }
		 }
		 
         return true;  
    }
}