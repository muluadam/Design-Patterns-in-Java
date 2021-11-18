package practice.iterator;

public enum ThemeColor {
    RED,
    ORANGE,
    BLACK,
    WHITE;
public static Iterator<ThemeColor>  getIterator(){
    return  new ThemeColorIterator();
}

    private  static  class  ThemeColorIterator implements  Iterator<ThemeColor>{
private  int position;

        @Override
        public boolean hasNext() {
            return position< ThemeColor.values().length; // values gives an array of elements in the
        }

        @Override
        public ThemeColor next() {
            return ThemeColor.values()[position++];  // increment after retrival
        }
    }

}
