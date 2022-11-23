// 36. Valid Sudoku
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<board.length; i++){
			HashSet<Character> set1 = new HashSet();
			HashSet<Character> set2 = new HashSet();
			
			for(int j=0; j<board.length; j++) {
				char num1 = board[i][j];
				if(num1 != '.') {
					if(set1.contains(num1)) {
						return false;
					}
					set1.add(num1);
				}
				
				char num2 = board[j][i];
				if(num2 != '.') {
					if(set2.contains(num2)) {
						return false;
					}
					
					set2.add(num2);
				}
			}	
		}

        for(int a=0; a<3; a++) {
			for(int b=0; b<3; b++) {
				HashSet<Character> set = new HashSet();
				int idx1 = 3*a;
				int idx2 = 3*b;
				
				for(int i=0; i<3; i++) {
					for(int j=0; j<3; j++) {
						char num = board[idx1 + i][idx2 +j];
						if(num != '.') {
							if(set.contains(num)) {
								return false;
							}
							set.add(num);
						}
					}
				}
			}
		}

        return true;
    }
}
