/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedriver;

/**
 *
 * @author Owner
 */
public class Movie {
   
    private String title;
    private int releaseYear;
    private String[] genres;
    private int movieId;
    private Movie left, right;
   
   
    public Movie() {
        this.left = this.right = null;
    }
   
 
    public Movie(String title) {
        this.title = title;
        this.left = this.right = null;
    }
   
 
    public Movie(String title, int releaseYear, String[] genres) {
        super();
        this.title = title;
        this.releaseYear = releaseYear;
        this.genres = genres;
        this.left = this.right = null;
    }
   
 
    public Movie(String title, int releaseYear, String[] genres, int movieId) {
        super();
        this.title = title;
        this.releaseYear = releaseYear;
        this.genres = genres;
        this.movieId = movieId;
        this.left = this.right = null;
    }
   
 
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public String[] getGenres() {
        return genres;
    }
    public void setGenres(String[] genres) {
        this.genres = genres;
    }
    public int getMovieId() {
        return movieId;
    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    public Movie getLeft() {
        return left;
    }
    public void setLeft(Movie left) {
        this.left = left;
    }
    public Movie getRight() {
        return right;
    }
    public void setRight(Movie right) {
        this.right = right;
    }
}
