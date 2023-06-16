package Orders;

public class App {
    public static void main(String[] args) {

        BinaryTree <Integer> n17 = new BinaryTree<>(17);
        BinaryTree <Integer> n6 = new BinaryTree<>(6,null,n17);
        BinaryTree <Integer> n5 = new BinaryTree<>(5,null,n6);

        BinaryTree <Integer> n19 = new BinaryTree<>(19);
        BinaryTree <Integer> n22 = new BinaryTree<>(22);
        BinaryTree <Integer> n21 = new BinaryTree<>(21,null,n22);
        BinaryTree <Integer> n50 = new BinaryTree<>(50);


        BinaryTree <Integer> n23 = new BinaryTree<>(23,n21,n50);
        BinaryTree <Integer> n18 = new BinaryTree<>(18,n5,n19);
        BinaryTree <Integer> n20 = new BinaryTree<>(20,n18,n23);

        System.out.println("Inorder: ");
        n20.inorder();
        System.out.println("******************** \n Postorder");
        n20.postorder();
        System.out.println("********************* \n PreOrder");
        n20.preorder();
    }
}
