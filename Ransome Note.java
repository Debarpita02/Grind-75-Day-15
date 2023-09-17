class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCounts = new int[26];
        for(int i = 0; i < Math.max(ransomNote.length(), magazine.length()); i++) {
            if(i < magazine.length()) {
                charCounts[magazine.charAt(i)-'a'] += 1;
            }
            if(i < ransomNote.length()) {
                charCounts[ransomNote.charAt(i)-'a'] -= 1;
            }
        }
        for(int count : charCounts) {
            if(count < 0) {
                return false;
            }
        }
        return true;
    }
}