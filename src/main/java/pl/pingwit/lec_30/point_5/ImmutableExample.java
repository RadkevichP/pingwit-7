package pl.pingwit.lec_30.point_5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Radkevich
 * @since 18.05.23
 */
public class ImmutableExample {

    public static void main(String[] args) {
        ImmutableAccount immutableAccount = new ImmutableAccount("Haha", new ArrayList(List.of("khehfrk", "jbejrhberj")));
        immutableAccount.getAdresses().remove(0);
    }

}
