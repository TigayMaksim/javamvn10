package ru.netology;

public class ManagerMovies {
    private Movies[] movies = new Movies[0];
    private int numberLast =0;

    public ManagerMovies() {
        this.numberLast = 10;
    }

    public ManagerMovies(int numberLast) {
        this.numberLast = numberLast;
    }


    public void save(Movies newMovies) {
        int length = movies.length + 1;
        Movies[] tmp = new Movies[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = newMovies;
        movies = tmp;
    }


    public Movies[] findAll() {
        return movies;
    }

    public Movies[] findLast() {
        if (numberLast < movies.length) {
            Movies[] result = new Movies[numberLast];
            for (int i = 0; i < numberLast; i++) {
                int index = movies.length - i - 1;
                result[i] = movies[index];
            }
            return result;
        } else {
            Movies[] result = new Movies[movies.length];
            for (int i = 0; i < movies.length; i++) {
                int index = movies.length - i - 1;
                result[i] = movies[index];
            }
            return result;
        }
    }
}

























   /* private Movies[] movies = new Movies[0];
    private int numberLastMovies;


    public ManagerMovies() {
        this.numberLastMovies = 10;
    }


    public ManagerMovies(int numberLastMovies) {
        this.numberLastMovies = numberLastMovies;
    }


    public void add(Movies newMovie) {

        int length = movies.length + 1;
        Movies[] tmp = new Movies[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = newMovie;
        movies = tmp;
    }


    public Movies[] findAll() {
        return movies;
    }


    public Movies[] findLast() {
        if (numberLastMovies < movies.length) {
            Movies[] result = new Movies[numberLastMovies];
            for (int i = 0; i < numberLastMovies; i++) {
                int index = movies.length - i - 1;
                result[i] = movies[index];
            }
            return result;
        } else {
            Movies[] result = new Movies[movies.length];
            for (int i = 0; i < movies.length; i++) {
                int index = movies.length - i - 1;
                result[i] = movies[index];
            }
            return result;
        }
    }*/



