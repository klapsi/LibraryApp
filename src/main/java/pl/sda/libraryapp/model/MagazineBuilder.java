package pl.sda.libraryapp.model;

public class MagazineBuilder {

    private String title;
    private int number;
    private int pageCount;

    public pl.sda.libraryapp.model.MagazineBuilder title(String title) {
        this.title = title;
        return this;
    }

    public pl.sda.libraryapp.model.MagazineBuilder number(int number) {
        this.number = number;
        return this;
    }

    public pl.sda.libraryapp.model.MagazineBuilder pageCount(int pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    public Magazine build() {
        Magazine magazine = new Magazine();
        magazine.setTitle(title);
        magazine.setNumber(number);
        magazine.setPageCount(pageCount);
        return magazine;
    }

}