public class GroveTester {
    public static void main(String[] args){
        Grove grove1 = new Grove("Grove 1");
        System.out.println(grove1);
        Tree tree1 = new Tree(1, 37, "Spruce");
        Tree tree2 = new Tree(2, 37, "Spruce");
        Tree tree3 = new Tree(3, 37, "Spruce");
        Tree tree4 = new Tree(4, 37, "Spruce");
        Tree tree5 = new Tree(5, 37, "Spruce");
        Tree tree6 = new Tree(6, 37, "Spruce");
        grove1.plantTree(tree1);
        grove1.plantTree(tree2);
        grove1.plantTree(tree3);
        grove1.plantTree(tree4);
        grove1.plantTree(tree5);
        grove1.plantTree(tree6);
        System.out.println(grove1);
        grove1.removeTree(3);
        grove1.removeTree(5);
        System.out.println(grove1);
        Tree tree7 = new Tree(7, 13, "Maple");
        grove1.plantTree(tree7);
        System.out.println(grove1);
    }
}
