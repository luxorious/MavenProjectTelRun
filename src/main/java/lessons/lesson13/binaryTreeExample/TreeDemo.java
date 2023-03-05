package lessons.lesson13.binaryTreeExample;


public class TreeDemo {
    public static void main(String[] args) {
        BinTree binTree = new BinTree();

        binTree.insert(1, "node1");
        binTree.insert(2, "node2");
        binTree.insert(3, "node3");
        binTree.insert(4, "node4");

        binTree.print(binTree.find(1));
    }
}
