package pl.pingwit.lec_22.point_4;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        List<VisitData> visitData = fillInitialData();

        System.out.println(findUniqueNames(visitData));
        System.out.println(findUniqueSites(visitData));

        Map<String, Integer> visitCountBySite = countVisitsBySite(visitData);
        System.out.println(visitCountBySite);

    }

    private static Map<String, Integer> countVisitsBySite(List<VisitData> visitData) {
        SortedMap<String, Integer> visitBySite = new TreeMap<>(Comparator.reverseOrder());

        for (VisitData visitDatum : visitData) {
            String site = visitDatum.site();
            if (visitBySite.containsKey(site)) {
                // если в мапе есть ключ ->  увеличить значение на 1
                Integer count = visitBySite.get(site);
                visitBySite.put(site, count + 1);
            } else {
                // если ключа нет -> добавить ключ со значением 1
                visitBySite.put(site, 1);
            }
        }
        return visitBySite;
    }


    private static Set<String> findUniqueNames(List<VisitData> visitData) {
        SortedSet<String> result = new TreeSet<>();
        for (VisitData visit : visitData) {
            result.add(visit.username());
        }
        return result;
    }

    private static Set<String> findUniqueSites(List<VisitData> visitData) {
        SortedSet<String> result = new TreeSet<>();
        for (VisitData visit : visitData) {
            result.add(visit.site());
        }
        return result;
    }


    private static List<VisitData> fillInitialData() {
        return List.of(new VisitData("Alex", "gooogle.com"),
                new VisitData("Alex", "gooogle.com"),
                new VisitData("Alex", "yandex.com"),
                new VisitData("Alex", "av.com"),
                new VisitData("Vova", "av.com"),
                new VisitData("Vova", "av.com"),
                new VisitData("Vova", "abw.com"),
                new VisitData("Li", "gooogle.com"),
                new VisitData("Li", "alibaba.com"),
                new VisitData("Li", "aliexpress.com"));
    }
}
