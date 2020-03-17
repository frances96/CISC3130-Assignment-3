import java.util.HashSet;
import java.util.Set;
 
public class MovieBST {
    private Movie first;
   
 
    public void subSetRec(Set<String> s, Movie node, String start, String end) {
       
        if (node == null) {
            return;
        }
       
       
     
        if (start.compareTo(node.getTitle()) < 0) {
            subSetRec(s, node.getLeft(), start, end);
        }
       
 
        if (start.compareTo(node.getTitle()) <= 0 && end.compareTo(node.getTitle()) >=0) {
            s.add(node.getTitle());
        }
 
 
     
        if (end.compareTo(node.getTitle()) > 0) {
            subSetRec(s, node.getRight(), start, end);
        }
    }
   
 
    public Set<String> subSet(String start, String end) {
     
        Set<String> s = new HashSet<String>();
        subSetRec(s, this.first, start, end);
        return s;
    }
   
    public Movie getFirst() {
        return first;
    }
    public void setFirst(Movie first) {
        this.first = first;
    }
   
    public void addNode(String title, int releaseYear, int movieId, String[] genres) {
     
        this.first = addNodeRec(this.first, title);
        this.first.setReleaseYear(releaseYear);
        this.first.setMovieId(movieId);
        this.first.setGenres(genres);
    }
   
 
    public Movie addNodeRec(Movie root, String title) {
 
        if (root == null) {
            root = new Movie(title);
            return root;
        }
       
 
        if (title.compareTo(root.getTitle()) < 0) {
            root.setLeft(addNodeRec(root.getLeft(), title));
        }
        else if (title.compareTo(root.getTitle()) > 0)  {
            root.setRight(addNodeRec(root.getRight(), title));
        }
 
     
        return root;
    }
   
 
    public void traverseInOrder() {
        traverseInOrderRec(this.first);
    }
    public void traverseInOrderRec(Movie root) {
       
        if (root.getLeft() != null) {
            traverseInOrderRec(root.getLeft());
        }
        System.out.println(root.getTitle());
        if (root.getRight() != null) {
            traverseInOrderRec(root.getRight());
        }
    }
       
}
