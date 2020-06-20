class Solution {
    public List<String> generateParenthesis(int n) {
        
        if (n == 0) {
            return new ArrayList<>();
        }
        if (n == 1) {
            List<String> list = new ArrayList<>();
            list.add("()");
            return list;
        }
        List<String> list = generateParenthesis(n-1);
        Set<String> s = new HashSet<>();
        for(String str: list) {
            for(int i=0; i<str.length(); i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(str.substring(0,i));
                sb.append("()");
                sb.append(str.substring(i));
                s.add(sb.toString());
            }
        }
        List<String> lists = new ArrayList<>();
        lists.addAll(s);
        return lists;
    }
}