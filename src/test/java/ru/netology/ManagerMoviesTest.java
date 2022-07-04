package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerMoviesTest {
    @Test
    void addAll() {
        ManagerMovies manager = new ManagerMovies();
        int arraySize = 10;
        Movies[] expectedMovies = new Movies[arraySize];

        for (int i = 0; i < arraySize; i++) {
            String number = Integer.toString(i);
            Movies newMovies = new Movies();
            manager.save(newMovies);
            expectedMovies[i] = new Movies();
        }
        Movies[] actual = manager.findAll();
        Movies [] expected = expectedMovies;
    }
    @Test
    void findLast() {
        ManagerMovies manager = new ManagerMovies(10);
        int arraySize = 5;
        Movies[] expectedMovies = new Movies[arraySize];

        for (int i = 0; i < arraySize; i++) {
            String number = Integer.toString(i);
            Movies newMovies = new Movies();
            manager.save(newMovies);
            expectedMovies[i] = new Movies();
        }
        Movies[] actual = manager.findAll();
        Movies [] expected = expectedMovies;
    }
    @Test
    void shouldViewLastMovies() {

        ManagerMovies manager = new ManagerMovies();
        int arraySize = 15;
        Movies[] expectedMovies = new Movies[arraySize];


        for (int i = 0; i < arraySize; i++) {
            String number = Integer.toString(i);
            Movies newMovies = new Movies();
            manager.save(newMovies);
            expectedMovies[i] = newMovies;
        }

        Movies[] actual = manager.findLast();
        Movies[] expected = {expectedMovies[14], expectedMovies[13], expectedMovies[12], expectedMovies[11], expectedMovies[10], expectedMovies[9], expectedMovies[8], expectedMovies[7], expectedMovies[6], expectedMovies[5]};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    void shouldViewConfigLastMovies() {

        ManagerMovies manager = new ManagerMovies(3);
        int arraySize = 8;
        Movies[] expectedMovies = new Movies[arraySize];

        for (int i = 0; i < arraySize; i++) {
            String number = Integer.toString(i);
            Movies newMovie = new Movies();
            manager.save(newMovie);
            expectedMovies[i] = newMovie;
        }

        Movies[] actual = manager.findLast();
        Movies[] expected = {expectedMovies[7], expectedMovies[6], expectedMovies[5]};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void shouldViewWrongConfigLastMovies() {

        ManagerMovies manager = new ManagerMovies(10);
        int arraySize = 5;
        Movies[] expectedMovies = new Movies[arraySize];

        for (int i = 0; i < arraySize; i++) {
            String number = Integer.toString(i);
            Movies newMovie = new Movies();
            manager.save(newMovie);
            expectedMovies[i] = newMovie;
        }

        Movies[] actual = manager.findLast();
        Movies[] expected = {expectedMovies[4], expectedMovies[3], expectedMovies[2], expectedMovies[1], expectedMovies[0]};

        Assertions.assertArrayEquals(expected, actual);
    }
}
