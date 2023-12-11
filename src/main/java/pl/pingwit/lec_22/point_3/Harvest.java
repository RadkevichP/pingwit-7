package pl.pingwit.lec_22.point_3;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Harvest {

    @JsonProperty("field_xms")
    private String field;

    @JsonProperty("square_xms")
    private BigDecimal square;
    private String plant;
    private BigDecimal weight;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public BigDecimal getSquare() {
        return square;
    }

    public void setSquare(BigDecimal square) {
        this.square = square;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Harvest{" +
                "field='" + field + '\'' +
                ", square=" + square +
                ", plant='" + plant + '\'' +
                ", weight=" + weight +
                '}';
    }
}
