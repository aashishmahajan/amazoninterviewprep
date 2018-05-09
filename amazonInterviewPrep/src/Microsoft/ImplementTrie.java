package Microsoft;

import java.util.HashMap;
import java.util.Map;

class Trie{
    Map<Character,Trie> children;
    boolean endOfFile;
    Trie(){
        children = new HashMap<>();
        endOfFile = false;
    }
}
public class ImplementTrie {
    Trie root;
    ImplementTrie(){
        root = new Trie();
    }

    public static void main(String[] args)
    {
        ImplementTrie t = new ImplementTrie();
        t.insert(t.root, "abc" );
        t.insert(t.root, "abcd");
        t.insert(t.root, "db" );
        t.insert(t.root, "bcdf");

        System.out.println(search(t.root,"bcdf"));
        t.delete(t.root, "db");
    }


    public void insert(Trie root, String str)
    {
        recursiveI(root,str,0);
    }

    private void recursiveI(Trie root, String str, int ind) {
        if(ind == str.length()){
            root.endOfFile = true;
            return;
        } else{
            char c = str.charAt(ind);
            Trie node = root.children.get(c);
            if (node == null) {
                node = new Trie();
                root.children.put(c,node);
            }
            recursiveI(node,str,ind+1);
        }
    }

    private static boolean search(Trie root, String str) {
        return recursiveSearch(root, str, 0);
    }

    private static boolean recursiveSearch(Trie root, String str, int ind) {
        if(ind == str.length()){
            return root.endOfFile;
        }else{
            if(root.children.containsKey(str.charAt(ind))){
                Trie node = root.children.get(str.charAt(ind));
                return recursiveSearch(node,str,ind+1);
            }
            return false;
        }
    }

    public void delete(Trie root, String str) {
        deleteI(root, str,0);
    }

    public void deleteI(Trie root, String str, int ind ){
        if(ind == str.length()){
            if(root.children.size()==0){
                root =null;
                return;
            }root.endOfFile = false;
            return;
        }else{
            if(root.children.containsKey(str.charAt(ind))){
                Trie node =root.children.get(str.charAt(ind));
                deleteI(node , str, ind+1);
                if(node.children.size()==0){
                    node.endOfFile=false;
                }
            }
            return;
        }
    }
}
