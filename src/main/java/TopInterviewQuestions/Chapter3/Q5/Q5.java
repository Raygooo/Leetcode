package TopInterviewQuestions.Chapter3.Q5;

public class Q5 {
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
}

class Trie {

    /**
     * Initialize your data structure here.
     */

    TireNode[] mHeadNodes = new TireNode[26];

    public Trie() {
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        if (word == null || word.length() == 0) {
            return;
        }
        char start = word.charAt(0);
        int p = start - 'a';
        if (mHeadNodes[p] == null) {
            mHeadNodes[p] = new TireNode();
        }
        mHeadNodes[p].insert(word, 1);
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }
        int p = word.charAt(0) - 'a';
        if (mHeadNodes[p] == null) {
            return false;
        }
        return mHeadNodes[p].search(word, 1);
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        if (prefix == null || prefix.length() == 0) {
            return false;
        }
        int p = prefix.charAt(0) - 'a';
        if (mHeadNodes[p] == null) {
            return false;
        }
        return mHeadNodes[p].startsWith(prefix, 1);
    }

    public static class TireNode {
        boolean mIsAWord = false;
        TireNode[] mChildren = new TireNode[26];

        public TireNode() {
        }

        public void insert(String word, int nextP) {
            if (word.length() == nextP) {
                mIsAWord = true;
                return;
            }
            int childP = word.charAt(nextP) - 'a';
            if (mChildren[childP] == null) {
                mChildren[childP] = new TireNode();
            }
            mChildren[childP].insert(word, nextP + 1);
        }

        public boolean search(String word, int nextP) {
            if (word.length() == nextP) {
                return mIsAWord;
            }
            int childP = word.charAt(nextP) - 'a';
            if (mChildren[childP] == null) {
                return false;
            }
            return mChildren[childP].search(word, nextP + 1);
        }

        public boolean startsWith(String prefix, int nextP) {
            if (prefix.length() == nextP) {
                return true;
            }
            int childP = prefix.charAt(nextP) - 'a';
            if (mChildren[childP] == null) {
                return false;
            }
            return mChildren[childP].startsWith(prefix, nextP + 1);
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
