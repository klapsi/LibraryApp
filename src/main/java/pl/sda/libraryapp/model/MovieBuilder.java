package pl.sda.libraryapp.model;

public class MovieBuilder {

    private String title;
    private String directorFirstName;
    private String directorLastName;
    private int duration;

    public pl.sda.libraryapp.model.MovieBuilder title(String title) {
        this.title = title;
        return this;
    }

    public pl.sda.libraryapp.model.MovieBuilder directorFirstName(String directorFirstName) {
        this.directorFirstName = directorFirstName;
        return this;
    }

    public pl.sda.libraryapp.model.MovieBuilder directorLastName(String directorLastName) {
        this.directorLastName = directorLastName;
        return this;
    }

    public pl.sda.libraryapp.model.MovieBuilder duration(int duration) {
        this.duration = duration;
        return this;
    }

    public Movie build() {
        Movie movie = new Movie();
        movie.setTitle(title);
        Creator director = new Creator();
        director.setFirstName(directorFirstName);
        director.setLastName(directorLastName);
        movie.setDirector(director);
        movie.setDuration(duration);
        return movie;
    }

}