package leetCode;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLenth = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder currentSubString = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                //if(currentSubString.indexOf(String.valueOf(s.charAt(j)));
                if (currentSubString.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                }
                currentSubString.append(s.charAt(j));
                if(currentSubString.length()>maxLenth){
                    maxLenth=currentSubString.length();
                }

            }
        }

        return maxLenth;
    }
}