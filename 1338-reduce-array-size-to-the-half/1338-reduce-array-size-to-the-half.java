import java.util.*;
import java.util.Map.Entry;
class Solution {
    public int minSetSize(int[] arr) {
        HashMap <Integer,Integer>map = new HashMap();
        for(int i=0 ;i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        List<Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(((o1, o2) -> o2.getValue() - o1.getValue()));

        int answer = 0;
        int size = arr.length;
        for(Entry<Integer, Integer> entry : entryList){
            size -= entry.getValue();
            answer++;
            if(size <= arr.length/2) {
                return answer;
            }
        }
        return answer;
    }
}