package Homework;

import Homework.Model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.UUID;

public class Homework4 {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setMovieDetail(1,
                UUID.randomUUID().toString(),
                "The Conjuring (2013)",
                "Paranormal investigators Ed and Lorraine Warren are called to help a family terrorized by a dark presence in their farmhouse. " +
                        "\nAs they uncover the sinister history of the house, they realize they may be facing one of their most terrifying cases yet.",
                "1 hour 52 minutes",
                new TreeSet<>(List.of("Horror", "Supernatural", "Thriller")));
        Movie movie2 = new Movie();
        movie2.setMovieDetail(2,
                UUID.randomUUID().toString(),
                "Mufasa: The Lion King (Upcoming 2024)",
                "A prequel to The Lion King, this film explores the origins of Mufasa, revealing his journey from an orphaned cub to the powerful king of the Pride Lands. " +
                        "\nWith friendships, rivalries, and destiny shaping his path, the story unveils the legend behind the lion.",
                "TBA",
                new TreeSet<>(List.of("Animation", "Adventure", "Family")));
        Movie movie3 = new Movie();
        movie3.setMovieDetail(3,
                UUID.randomUUID().toString(),
                "Jaws (1975)",
                "A quiet beach town is terrorized by a massive great white shark. " +
                        "\nAs panic spreads, a police chief, a marine biologist, and a grizzled shark hunter set out to stop the deadly creature before it strikes again.",
                "2 hours 4 minutes",
                new TreeSet<>(List.of("Thriller", "Horror", "Adventure")));
        Movie movie4 = new Movie();
        movie4.setMovieDetail(4,
                UUID.randomUUID().toString(),
                "Troll (2022)",
                "When a giant ancient troll awakens in the Norwegian mountains, it threatens to destroy everything in its path. " +
                        "\nA group of scientists and military forces must race against time to stop the mythical creature before it reaches civilization.",
                "1 hour 41 minutes",
                new TreeSet<>(List.of("Fantasy", "Adventure", "Action")));
        Movie movie5 = new Movie();
        movie5.setMovieDetail(5,
                UUID.randomUUID().toString(),
                "Barbie (2023)",
                "Living in the perfect world of Barbie Land, Barbie begins to question her reality when things start going wrong. " +
                        "\nShe sets out on a journey to the real world with Ken, discovering both the beauty and struggles of human life. " +
                        "\nAlong the way, she learns the true meaning of self-acceptance and empowerment.",
                "1 hour 54 minutes",
                new TreeSet<>(List.of("Fantasy", "Comedy", "Adventure")));

        List<Movie> movies  = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        for(Movie movie: movies){
            System.out.println(movie);
        }
    }
}