import java.util.*;
class TimeMap {
    HashMap<String,TreeMap<Integer,String>> map = new HashMap();
    public TimeMap() {
        map = new HashMap<String,TreeMap<Integer,String>>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer,String> tm = map.getOrDefault(key, new TreeMap<Integer,String>());
        tm.put(timestamp, value);
        map.put(key,tm);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
    	
    	TreeMap<Integer,String> tm = map.get(key);
    	Map.Entry<Integer,String> et = tm.floorEntry(timestamp);
    	if(et != null) {
    		return et.getValue();
    	}
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */