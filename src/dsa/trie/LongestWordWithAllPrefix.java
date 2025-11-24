package dsa.trie;

public class LongestWordWithAllPrefix {

    public static void main(String[] args) {
        //This is used to find the longest word in the dictionary such that all its prefixes are also present in the dictionary.
        String[] words = {"a", "ap", "apdp", "app", "appl", "apple", "apply"};
        System.out.println(longestWordWithAllPrefixes(words)); // Output: apple
    }

    private static String longestWordWithAllPrefixes(String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }

        String longestWord = "";
        for (String word : words) {
            if (trie.allPrefixesExist(word)) {
                if (word.length() > longestWord.length() ||
                        (word.length() == longestWord.length() && word.compareTo(longestWord) < 0)) {
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }


    static class Trie{
        private final TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode current = root;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                if (current.children[index] == null) {
                    current.children[index] = new TrieNode();
                }
                current = current.children[index];
            }
            current.isEndOfWord = true;
        }

        public boolean allPrefixesExist(String word) {
            TrieNode current = root;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                if (current.children[index] == null || !current.children[index].isEndOfWord) {
                    return false;
                }
                current = current.children[index];
            }
            return true;
        }
    }


    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;
    }
}
