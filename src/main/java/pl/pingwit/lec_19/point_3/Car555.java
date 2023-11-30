package pl.pingwit.lec_19.point_3;

public class Car555 {

    private String brand;
    private String model;
    private String status;


    public Car555() {
    }

    public Car555(String brand, String model, String status) {
        this.brand = brand;
        this.model = model;
        this.status = status;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
