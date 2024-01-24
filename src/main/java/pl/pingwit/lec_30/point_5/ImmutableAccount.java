package pl.pingwit.lec_30.point_5;

import java.util.List;
import java.util.Objects;

/**
 * @author Pavel Radkevich
 * @since 18.05.23
 */
public final class ImmutableAccount {

    private final String name;
    private final List<String> adresses;

    public ImmutableAccount(String name, List<String> adresses) {
        this.name = name;
        this.adresses = List.copyOf(adresses);
    }

    public String getName() {
        return name;
    }

    public List<String> getAdresses() {
        return List.copyOf(adresses);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableAccount that = (ImmutableAccount) o;
        return Objects.equals(name, that.name) && Objects.equals(adresses, that.adresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adresses);
    }
}
