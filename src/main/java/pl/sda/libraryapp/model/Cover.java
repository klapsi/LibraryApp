package pl.sda.libraryapp.model;

public enum Cover {
        SOFT("miękka"), HARD("twarda");

        private String name;

        Cover(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
