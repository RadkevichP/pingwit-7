package pl.pingwit.lec_23.point_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {
        List<String> data =  List.of("hop", "hey", "lalalei!", "где вопросы", "где ответы");

       /* for (String word : data) {
            System.out.println(word.length());
        }*/

        List<Integer> lengths = data.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(lengths);

        String song = data.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining("-"));

        System.out.println(song);


    }
}
