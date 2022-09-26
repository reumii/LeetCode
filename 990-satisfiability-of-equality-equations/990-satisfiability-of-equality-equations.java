class Solution {
    public static HashMap<String,String> letterMap = new HashMap();
	public static boolean equationsPossible(String[] equations) {
        boolean answer = true;
        letterMap = new HashMap();
        
        for(int i=0; i<equations.length; i++) {
        	String l1 = equations[i].substring(0, 1);
        	String l2 = equations[i].substring(3);
        	String equ = equations[i].substring(1, 3);
        	if(equ.equals("==")) {
        		if(letterMap.containsKey(l1)) {
        			union(l1, l2);
        		}else if(letterMap.containsKey(l2)) {
        			union(l2, l1);
        		}else {
        			letterMap.put(l1, l1);
        			union(l1,l2);
        		}
        	}
        }
        
        for(int i=0; i<equations.length; i++) {
        	String l1 = equations[i].substring(0, 1);
        	String l2 = equations[i].substring(3);
        	String equ = equations[i].substring(1, 3);
        	
        	if(equ.equals("!=")) {
        		if(l1.equals(l2)) {
        			return false;
        		}else if(letterMap.containsKey(l1) && letterMap.containsKey(l2) && find(l1).equals(find(l2))) {
        			return false;
        		}
        	}
        }
        return answer;
    }
	
	public static String find(String letter) {
		if(!letterMap.containsKey(letter)) {
			return letter;
		}
		while(!letterMap.get(letter).equals(letter)) {
			letter = letterMap.get(letter);
		}
		return letter;
	}
    
    public static void union(String l1, String l2) {
		letterMap.put(find(l2), find(l1));
	}
}