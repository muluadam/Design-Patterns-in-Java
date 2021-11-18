package practice.strategy;

class MarkDwonListStrategy implements ListStragegy {

    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append("*")
                .append(item)
                .append(System.lineSeparator());
    }


}
