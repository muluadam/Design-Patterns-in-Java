package practice.iterator;

public class Main {
    public static void main(String[] args) {
        Iterator<ThemeColor> iter= ThemeColor.getIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
