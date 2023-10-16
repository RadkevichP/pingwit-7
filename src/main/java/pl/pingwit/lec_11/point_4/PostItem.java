package pl.pingwit.lec_11.point_4;

import java.math.BigDecimal;

public class PostItem {

    protected final String from;
    protected final String to;

    public PostItem(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public void printDescription() {
        System.out.printf("This is PostItem from %s, to %s", from, to);
    }
}
