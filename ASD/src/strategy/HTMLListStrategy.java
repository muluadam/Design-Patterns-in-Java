package practice.strategy;

class HTMLListStrategy implements ListStragegy {

    @Override
    public void star(StringBuilder sb) {
        //  ListStragegy.super.star(sb);
        sb.append("<ul>")
                .append(System.lineSeparator());
    }

    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append("<li>")
                .append(item)
                .append("</li")
                .append(System.lineSeparator());
    }

    @Override
    public void end(StringBuilder sb) {
        // ListStragegy.super.end(sb);
        sb.append("</ul>")
                .append(System.lineSeparator());
    }
}
