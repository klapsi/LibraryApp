package pl.sda.libraryapp.model;

import java.util.Optional;

public final class AudioBookBuilder{

    private String authorFirstName;
    private String authorLastName;
    private String title;
    private Format format;
    private int duration;

    public AudioBookBuilder authorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
        return this;
    }

    public pl.sda.libraryapp.model.AudioBookBuilder authorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
        return this;
    }

    public pl.sda.libraryapp.model.AudioBookBuilder title(String title) {
        this.title = title;
        return this;
    }

    public pl.sda.libraryapp.model.AudioBookBuilder format(Format format) {
        this.format = format;
        return this;
    }

    public pl.sda.libraryapp.model.AudioBookBuilder duration(int duration) {
        this.duration = duration;
        return this;
    }

    public AudioBook build() {
        AudioBook book = new AudioBook();
        Creator author = new Creator();
        author.setFirstName(authorFirstName);
        author.setLastName(authorLastName);
        book.setAuthor(author);
        book.setTitle(title);
        book.setFormat(Optional//
                .ofNullable(format)//
                .orElse(Format.MP3));
        book.setDuration(duration);
        return book;
    }

}