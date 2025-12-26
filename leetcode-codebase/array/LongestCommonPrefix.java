
// https://leetcode.com/problems/longest-common-prefix/submissions/1865664304
// Problem Number - 14

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result="";
        if (strs == null || strs.length == 0){
            return "";
        } 
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return result;
                }
            }
            result += ch;

        }
        return result;
    }
}