package pl.pingwit.lec_9.immutableClasses;

public final class House {
    private final String type;
    private final int floors;
    private final int tenants;
    private final boolean isHeating;

    public House(String type, int floors, int tenants, boolean isHeating) {
        this.type = type;
        this.floors = floors;
        this.tenants = tenants;
        this.isHeating = isHeating;
    }

    public String getType() {
        return type;
    }

    public int getFloors() {
        return floors;
    }

    public int getTenants() {
        return tenants;
    }

    public boolean isHeating() {
        return isHeating;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", floors=" + floors +
                ", tenants=" + tenants +
                ", isHeating=" + isHeating +
                '}';
    }
}
