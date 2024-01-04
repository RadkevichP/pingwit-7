package pl.pingwit.lec_25.point_3;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.pingwit.lec_22.point_3.Harvest;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) throws IOException {

        List<Address> addressList = List.of(
                new Address("Minsk", "Mayskaya", 2, 77),
                new Address("Minsk", "Karla Marksa", 8, 42),
                new Address("Minsk", "Darvin", 5, 23),
                new Address("Kiev", "Mayskaya", 2, 77),
                new Address("Minsk", "Nemiga", 7, 56),
                new Address("Minsk", "Nemiga", 7, 56),
                new Address("Kiev", "Azovskaya", 7, 187),
                new Address("Kiev", "Darvin", 13, 18),
                new Address("Kiev", "Darvin", 156, 98),
                new Address("Kiev", "Kazanskaya", 78, 9),
                new Address("Kiev", "Darvin", 156, 98)
        );

        // также разберем еще раз задачу с харвестами
        Map<String, List<Address>> addressesByCity = new HashMap<>();

        Map<String, List<Address>> addressesByCities = addressList.stream()
                .collect(Collectors.groupingBy(Address::getCity, Collectors.toList()));

        System.out.println(addressesByCities);

        Map<String, List<Address>> addressesByStreets = addressList.stream()
                .collect(Collectors.groupingBy(Address::getStreet, Collectors.toList()));


    }
}
