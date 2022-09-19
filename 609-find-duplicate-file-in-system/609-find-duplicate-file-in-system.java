class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> answer = new ArrayList<List<String>>();
		HashMap<String,List<String>> map = new HashMap();
		
		for(int i=0; i<paths.length; i++) {
			String[] p = paths[i].split(" ");
			String directory = p[0];
			for(int j=1; j<p.length; j++) {
				String content = p[j].substring(p[j].indexOf("(")+1 ,p[j].length()-1);
				List<String> list = map.getOrDefault(content, new ArrayList<String>());
				list.add(directory +"/"+p[j].substring(0,p[j].indexOf("(")));
				map.put(content, list);
			}
		}
		
		for(String m : map.keySet()) {
			if(map.get(m).size()>1) {
				answer.add(map.get(m));
			}
		}
		return answer;
    }
}