package pl.pingwit.lec_22.point_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UnmodifiableCollectionsExampleTest {

    @Test
    public void arrayList()
    {
        // Mutable
        List<String> list = new ArrayList<>();
        list.add("✅"); // Works

        Assertions.assertEquals(List.of("✅"), list);
    }

    @Test
    public void linkedList()
    {
        // Mutable
        List<String> list = new LinkedList<>();
        list.add("✅"); // Works

        Assertions.assertEquals(List.of("✅"), list);
    }

    @Test
    public void arraysAsList()
    {
        // Mutable but not growable
        List<String> list = Arrays.asList("✅");
        list.set(0, "✔️"); // Works

        Assertions.assertThrows(
                UnsupportedOperationException.class,
                () -> list.add(0, "⛔️"));
        Assertions.assertEquals(List.of("✔️"), list);
    }

    @Test
    public void collectionsEmptyList()
    {
        // Immutable
        List<String> list = Collections.emptyList();

        Assertions.assertThrows(
                UnsupportedOperationException.class,
                () -> list.add(0, "⛔️"));
        Assertions.assertEquals(List.of(), list);
    }

    @Test
    public void collectionsSingletonList()
    {
        // Immutable
        List<String> list =
                Collections.singletonList("✅");

        Assertions.assertThrows(
                UnsupportedOperationException.class,
                () -> list.add("⛔️"));
        Assertions.assertEquals(List.of("✅"), list);
    }

    @Test
    public void collectionsUnmodifiableList()
    {
        // Mutable
        List<String> arrayList = new ArrayList<>();
        arrayList.add("✅");

        // "Unmodifiable" but arrayList is still Mutable
        List<String> list = Collections.unmodifiableList(arrayList);

        Assertions.assertThrows(
                UnsupportedOperationException.class,
                () -> list.add("⛔️"));
        Assertions.assertEquals(List.of("✅"), list);
        arrayList.add("⛔️");
        Assertions.assertEquals(List.of("✅", "⛔️"), list);
    }

    @Test
    public void listOf()
    {
        // Immutable
        List<String> list = List.of("✅");

        Assertions.assertThrows(
                UnsupportedOperationException.class,
                () -> list.add("⛔️"));
        Assertions.assertEquals(List.of("✅"), list);
    }

    @Test
    public void listCopyOf()
    {
        // Immutable
        List<String> list = List.copyOf(new ArrayList<>(List.of("✅")));

        Assertions.assertThrows(
                UnsupportedOperationException.class,
                () -> list.add("⛔️"));
        Assertions.assertEquals(List.of("✅"), list);
    }

    @Test
    public void streamToList()
    {
        // Immutable
        List<String> list = Stream.of("✅").toList();

        Assertions.assertThrows(
                UnsupportedOperationException.class,
                () -> list.add("⛔️"));
        Assertions.assertEquals(List.of("✅"), list);
    }

    @Test
    public void streamCollectCollectorsToList()
    {
        // Mutable
        List<String> list = Stream.of("✅")
                .collect(Collectors.toList());
        list.add("✅");

        Assertions.assertEquals(List.of("✅", "✅"), list);
    }

    @Test
    public void streamCollectCollectorsToUnmodifiableList()
    {
        // Mutable
        List<String> list = Stream.of("✅")
                .collect(Collectors.toUnmodifiableList());

        Assertions.assertThrows(
                UnsupportedOperationException.class,
                () -> list.add("⛔️"));
        Assertions.assertEquals(List.of("✅"), list);
    }

}