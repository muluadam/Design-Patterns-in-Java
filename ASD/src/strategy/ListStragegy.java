package practice.strategy;

interface ListStragegy {
    default void star(StringBuilder sb) {
      //  System.out.println("start");
    }

    void addListItem(StringBuilder sb, String item);

    default void end(StringBuilder sb) {
      //  System.out.println("end");
    }
}
