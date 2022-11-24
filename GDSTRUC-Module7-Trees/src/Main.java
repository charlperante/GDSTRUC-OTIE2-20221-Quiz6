public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();
        Node root = null;

        tree.insert(25);        tree.insert(17);
        tree.insert(29);        tree.insert(10);
        tree.insert(16);        tree.insert(-5);
        tree.insert(-10);       tree.insert(55);

        //tree.traverseInOrder();
        tree.traverseInOrderDescending(); // Descending in-order traverse method
        System.out.println();
        //System.out.print(tree.get(25));

        System.out.println("Minimum Value: " + tree.getMin(root)); // Get minimum
        System.out.println("Maximum Value: " + tree.getMax(root)); // Get Maximum
    }
}