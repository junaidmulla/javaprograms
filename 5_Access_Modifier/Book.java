class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public void borroBook() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    public boolean isBookBorrowed() {
        return isBorrowed;
    }
}
