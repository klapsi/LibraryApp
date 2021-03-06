package pl.sda.libraryapp.model;

import java.util.Objects;

public abstract class Medium {

    protected String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        pl.sda.libraryapp.model.Medium medium = (pl.sda.libraryapp.model.Medium) o;
        return Objects.equals(title, medium.title);
    }

    @Override public int hashCode() {
        return Objects.hash(title);
    }

}