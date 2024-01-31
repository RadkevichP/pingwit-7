package pl.pingwit.lec_31.point_1;

import java.util.ArrayList;
import java.util.List;


public class ImmutableExample {

    public static void main(String[] args) {
        ImmutableAccount immutableAccount = new ImmutableAccount("Haha", new ArrayList(List.of("khehfrk", "jbejrhberj")));
        immutableAccount.getAdresses().remove(0);
    }

}
