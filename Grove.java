import java.util.ArrayList;

public class Grove {
    public ArrayList<Tree> grove = new ArrayList<Tree>(16);
    public String groveName;

    public Grove(String groveName){
        this.groveName = groveName;
    }

    public int plantTree(Tree tree){
        if(grove.size()<16){
            grove.add(tree);
        return grove.indexOf(tree);
        } else {
            return -1;
        }
    }

    public Tree removeTree(int plot){
        Tree tree = grove.get(plot-1);
        grove.remove(plot-1);
        return tree;
    }

    public String toString(){
        return Integer.toString(grove.size());
    }
}
