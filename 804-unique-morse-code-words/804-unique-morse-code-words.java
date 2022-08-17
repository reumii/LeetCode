class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet();
        for(int i=0; i<words.length; i++) {
            String trans = "";
            for(int j=0; j<words[i].length(); j++) {
                trans+= morse[words[i].charAt(j)-97];
            }
            set.add(trans);
        }
        return set.size();
    }
}