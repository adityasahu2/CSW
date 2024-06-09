// Q3 Create a class Country containing members for name and population, along with a constructor and necessary methods. Additionally, create a class BNode with a member 'info' to store a country object, 'left' to refer to the left child, and 'right' to refer to the right child. Provide the required constructor. Finally, create another class BST with a member 'root', along with the necessary constructor and a method to insert a node into the binary search tree. 
class Country{
    String name;
    int population;
    Country(String name, int population){
        this.name = name;
        this.population = population;
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
                if(info.population < temp.info.population)
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
}





// class Country {
//     String name;
//     int population;

//     public Country(String name, int population) {
//         this.name = name;
//         this.population = population;
//     }
// }

// class BNode {
//     Country info;
//     BNode left;
//     BNode right;

//     public BNode(Country country) {
//         this.info = country;
//         this.left = null;
//         this.right = null;
//     }
// }

// class BST {
//     BNode root;

//     public BST() {
//         this.root = null;
//     }

//     public void insert(Country country) {
//         BNode newNode = new BNode(country);

//         if (root == null) {
//             root = newNode;
//             return;
//         }

//         BNode current = root;
//         BNode parent = null;

//         while (true) {
//             parent = current;
//             if (country.name.compareTo(current.info.name) < 0) {
//                 current = current.left;
//                 if (current == null) {
//                     parent.left = newNode;
//                     return;
//                 }
//             } else {
//                 current = current.right;
//                 if (current == null) {
//                     parent.right = newNode;
//                     return;
//                 }
//             }
//         }
//     }
// }
        
// public class Q3 {
//   public static void main(String[] args) {
//     BST bst = new BST();

//     Country country1 = new Country("India", 1000000000);
//     Country country2 = new Country("USA", 300000000);

//     bst.insert(country1);
//     bst.insert(country2);

//     printInOrder(bst.root);
//   }

//   public static void printInOrder(BNode node) {
//     if (node == null) {
//       return;
//     }

//     printInOrder(node.left);
//     System.out.println("Country: " + node.info.name + ", Population: " + node.info.population);
//     printInOrder(node.right);
//   }
// }