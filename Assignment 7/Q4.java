// Q4 Extend the BST created in Q3 by adding methods to traverse the tree in level order, find the node with the maximum population (find-max), and find the node with the minimum population (find-min). Invoke these methods for execution.
import java.util.*;
class Country implements Comparable{
    String name;
    int population;
    Country(String name, int population){
        this.name = name;
        this.population = population;
    }
    public String toString(){return this.name + " : " + this.population;}
    public int compareTo(Country c){
        if(this.population > c.population) return 1;
        else if(this.population < c.population) return -1;
        else return 0;
    }
}
class BNode{
    Country info;
    BNode left, right;
    BNode(Country info){
        this.info = info;
        this.left = null;
        this.right = null;
    }
}
class BST{
    BNode root;
    BST(){this.root = null;}
    void insert(Country info){
        BNode newNode = new BNode(info);
        if(this.root == null) this.root = newNode;
        else{
            BNode temp = this.root;
            while(true)
                if(info.compareTo(temp.info) < 0)
                    if(temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else temp = temp.left;
                else
                    if(temp.right == null){
                        temp.right = newNode;
                        break;
                    }else temp = temp.right;
        }
    }
    void levelOrder(){
        Queue<BNode> q = new LinkedList<>();
        q.add(this.root);
        while(!q.isEmpty()){
            BNode temp = q.remove();
            System.out.print(temp.info + " ");
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }
    }
    BNode findMax(){
        BNode temp = this.root;
        while(temp.right != null) temp = temp.right;
        return temp;
    }
    BNode findMin(){
        BNode temp = this.root;
        while(temp.left != null) temp = temp.left;
        return temp;
    }
}
