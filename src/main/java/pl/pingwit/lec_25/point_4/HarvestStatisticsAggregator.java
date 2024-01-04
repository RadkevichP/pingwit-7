package pl.pingwit.lec_25.point_4;

import pl.pingwit.lec_22.point_3.Harvest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HarvestStatisticsAggregator {

    // принимает массив Harvest, возвращаетт List;HarvestStatistics
    public List<PlantHarvestStatistics> aggregateStatistics(Harvest[] harvests) {
        Map<String, List<Harvest>> harvestsByPlant = Arrays.stream(harvests)
                .collect(Collectors.groupingBy(Harvest::getPlant));

        return harvestsByPlant.entrySet().stream()
                .map(this::aggregatePlantStats)
                .toList();
    }

    private PlantHarvestStatistics aggregatePlantStats(Map.Entry<String, List<Harvest>> entry) {
        String plant = entry.getKey();
        List<Harvest> plantHarvests = entry.getValue();

        BigDecimal totalWeight = plantHarvests.stream()
                .map(Harvest::getWeight)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal totalSquare = plantHarvests.stream()
                .map(Harvest::getSquare)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return new PlantHarvestStatistics(plant, totalWeight, totalSquare);
    }
}
