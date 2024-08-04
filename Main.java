import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

class Main {

    public void JavaExceptions() {

        Set exampleSet = new HashSet();
        Hashtable exHashtable = new Hashtable();

        //accessing set
        exampleSet.iterator().next();
        //accessing hashtable
        exHashtable.elements().nextElement();
    }

    public static void main(String[] args) {
        Main E = new Main();
        E.JavaExceptions();
    }
}