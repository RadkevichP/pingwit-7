package pl.pingwit.lec_8.point_1;

import java.util.Objects;

// imei, type, model, storage: 32, 64, 256
public class AppleGadget {

    private String imei;
    private GadgetTypes type;

    private String model;

    private Integer storage;

    public AppleGadget(String imei, GadgetTypes type, String model, Integer storage) {
        this.imei = imei;
        this.type = type;
        this.model = model;
        this.storage = storage;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public GadgetTypes getType() {
        return type;
    }

    public void setType(GadgetTypes type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppleGadget that = (AppleGadget) o;
        return Objects.equals(imei, that.imei) && type == that.type && Objects.equals(model, that.model) && Objects.equals(storage, that.storage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imei, type, model, storage);
    }

    @Override
    public String toString() {
        return "AppleGadget{" +
                "imei='" + imei + '\'' +
                ", type=" + type +
                ", model='" + model + '\'' +
                ", storage=" + storage +
                '}';
    }

    // если объекты равны по equals(), то у них обязательно одинаковые хэшкоды!
    // но если у двух объектов одинаковые хэшкоды - они НЕОБЯЗАТЕЛЬНО! равны по equals()
}
