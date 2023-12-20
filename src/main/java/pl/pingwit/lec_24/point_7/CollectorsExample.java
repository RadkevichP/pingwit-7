package pl.pingwit.lec_24.point_7;

import java.util.List;

public class CollectorsExample {

    public static void main(String[] args) {
        List<FootballClub> footballClubs = List.of(
                new FootballClub("A1", "Minsk", "Belarus"),
                new FootballClub("B1", "Brest", "Belarus"),
                new FootballClub("B41", "Baranovichi", "Belarus"),
                new FootballClub("B52", "Baranovichi", "Belarus"),
                new FootballClub("Sh1", "Kiyv", "Ukraine"),
                new FootballClub("Tt1", "Kiyv", "Ukraine"),
                new FootballClub("Lala", "Polotsk", "Belarus"),
                new FootballClub("Bebe", "Minsk", "Belarus"),
                new FootballClub("Lllx", "Lviv", "Ukraine"));

        // оставить только бел клубы

        // сгруппировать клубы по городам

        // сгруппировать клубы по странам
    }
}
