package practice.strategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TextProcessor tp= new TextProcessor(OutputFormat.MARKDOWN);
        tp.appendList(List.of("adam","is","great"));
        System.out.println(tp);
        tp.clear();
        tp.setOutPutFormat(OutputFormat.HTML);
        tp.appendList(List.of("Inheritacne","polu","encapsulation"));
        System.out.println(tp);

    }
}
