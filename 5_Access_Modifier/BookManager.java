class BookManager {
    public static void main(String[] args) {
        Book secret = new Book("The Secret", "Rhonda Byrne");
        secret.borroBook();
        boolean bookStatus = secret.isBookBorrowed();
        if (bookStatus) {
            System.out.println("Book is Borrowed by someone.");
        } else {
            System.out.println("Book is available");
        }
    }
}