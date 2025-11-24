package dsa.trie;

public class ImplementTrieTwo {

    //https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("apple");
        trie.insert("app");
        System.out.println(trie.countWordsEqualTo("apple")); //2
        System.out.println(trie.countWordsStartingWith("app")); //3
        trie.erase("apple");
        System.out.println(trie.countWordsEqualTo("apple")); //1
        System.out.println(trie.countWordsStartingWith("app")); //2
    }


    static class Trie{
        Node root;

        public Trie(){
            root = new Node();
        }

        public void insert(String word){
            Node curr = root;
            for(char ch : word.toCharArray()){
                int index = ch - 'a';
                if(curr.children[index] == null){
                    curr.children[index] = new Node();
                }
                curr = curr.children[index];
                curr.countPrefix++;
            }
            curr.endsWith++;
        }

        public int countWordsEqualTo(String word){
            Node curr = root;
            for(char ch : word.toCharArray()){
                int index = ch - 'a';
                if(curr.children[index] == null){
                    return 0;
                }
                curr = curr.children[index];
            }
            return curr.endsWith;
        }

        public int countWordsStartingWith(String prefix){
            Node curr = root;
            for(char ch : prefix.toCharArray()){
                int index = ch - 'a';
                if(curr.children[index] == null){
                    return 0;
                }
                curr = curr.children[index];
            }
            return curr.countPrefix;
        }

        public void erase(String word){
            Node curr = root;
            for(char ch : word.toCharArray()){
                int index = ch - 'a';
                if(curr.children[index] == null){
                    return;
                }
                curr = curr.children[index];
                curr.countPrefix--;
            }
            curr.endsWith--;
        }
    }


    static class Node{
        Node[] children;
        int endsWith;
        int countPrefix;

        public Node(){
            children = new Node[26];
            endsWith = 0;
            countPrefix = 0;
        }
    }
}
