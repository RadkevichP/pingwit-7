package pl.pingwit.lec_25.point_4;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.pingwit.lec_22.point_3.Harvest;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class HarvestAggregation {

    private static HarvestStatisticsAggregator aggregator = new HarvestStatisticsAggregator();

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Harvest[] harvests = objectMapper.readValue(new File("src/main/java/pl/pingwit/lec_22/point_3/harvest.json"), Harvest[].class);

        List<PlantHarvestStatistics> plantHarvestStatistics = aggregator.aggregateStatistics(harvests);

        System.out.println(plantHarvestStatistics);

    }
}
