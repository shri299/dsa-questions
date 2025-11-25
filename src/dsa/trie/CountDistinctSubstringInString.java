package dsa.trie;

public class CountDistinctSubstringInString {

    //https://takeuforward.org/data-structure/number-of-distinct-substrings-in-a-string-using-trie/

    //TC : O(N^2)
    //SC : O(N^2)
    public static void main(String[] args) {
        String str = "ababa";
        System.out.println(countDistinctSubstrings(str)); // Output: 10
    }

    private static int countDistinctSubstrings(String str) {
        Trie trie = new Trie();
        int distinctCount = 0;

        for (int i = 0; i < str.length(); i++) {
            TrieNode current = trie.root;
            for (int j = i; j < str.length(); j++) {
                int index = str.charAt(j) - 'a';
                if (current.children[index] == null) {
                    current.children[index] = new TrieNode();
                    distinctCount++;
                }
                current = current.children[index];
            }
        }

        System.out.println("Number of distinct substrings: " + distinctCount);
        return distinctCount;
    }

    static class Trie{
        private final TrieNode root;

        public Trie() {
            root = new TrieNode();
        }
    }


    static class TrieNode{
        TrieNode[] children;
        boolean isEndOfWord;

        public TrieNode() {
            children = new TrieNode[26]; // Assuming only lowercase a-z
            isEndOfWord = false;
        }
    }
}
