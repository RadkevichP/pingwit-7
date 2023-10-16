package pl.pingwit.lec_11.point_4;

import java.math.BigDecimal;

public class Parcel extends PostItem {

    // PostItem - класс-родитель,  superclass
    // Parcel - класс-наследник, subclass
    // DRY - Don't repeat yourself
    private BigDecimal weight;

    public Parcel(String from, String to, BigDecimal weight) {
        super(from, to);
        this.weight = weight;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Override
    public void printDescription() {
        System.out.printf("This is a Parcel from %s, to %s, with weight %s", from, to, weight);
    }
}
