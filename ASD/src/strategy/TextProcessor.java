package practice.strategy;

import java.util.List;

class TextProcessor {
    private StringBuilder sb = new StringBuilder();
    private ListStragegy listStragegy;

    public TextProcessor(OutputFormat format) {
        setOutPutFormat(format);
    }

    public void setOutPutFormat(OutputFormat format) {
        switch (format) {
            case HTML:
                listStragegy = new HTMLListStrategy();
                break;
            case MARKDOWN:
                listStragegy = new MarkDwonListStrategy();
                break;
        }
    }

    public void appendList(List<String> items) {
        listStragegy.star(sb);
        for (String item : items) {
            listStragegy.addListItem(sb, item);
        }
        listStragegy.end(sb);
    }

    public void clear() {
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
