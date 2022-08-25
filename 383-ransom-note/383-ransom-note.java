class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder st = new StringBuilder(magazine);
        for(int i=0; i<ransomNote.length(); i++) {
            int index = st.indexOf(Character.toString(ransomNote.charAt(i)));
            if(index < 0) {
                return false;
            }
            st.deleteCharAt(index);
        }
        return true;
    }
}