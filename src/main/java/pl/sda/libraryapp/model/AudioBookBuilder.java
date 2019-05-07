package pl.sda.libraryapp.model;

import java.util.Optional;

public final class AudioBookBuilder extends BookBuilder<AudioBook> {

    protected Format format;

    public AudioBookBuilder format(Format format){
        this.format = format;
        return this;
    }

    @Override
    public AudioBookBuilder authorFirstName(String authorFirstName) {
        super.authorFirstName(authorFirstName);
        return this;
    }

    @Override
    public AudioBookBuilder authorLastName(String authorLastName) {
        super.authorLastName(authorLastName);
        return this;
    }

    @Override
    public AudioBookBuilder title(String title) {
        super.title(title);
        return this;
    }

    @Override
    public AudioBook build(){
        AudioBook book =new AudioBook();
        Author author = new Author();
        author.setFirstName(authorFirstName);
        author.setLastName(authorLastName);
        book.setAuthor(author);
        book.setTitle(title);
        book.setFormat(Optional.ofNullable(format).orElse(Format.MP3));
        return book;
    }

}