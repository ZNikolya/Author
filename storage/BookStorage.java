package homework.author.storage;

import homework.author.model.Book;

public class BookStorage {

    private Book[] array = new Book[10];
    private int size;


    public void addBook(Book value) {

        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Book[] arraynew = new Book[array.length + 10];
        System.arraycopy(array, 0, arraynew, 0, array.length);
        array = arraynew;
    }

    public void printBook() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " " + "\n");
        }
        System.out.println();
    }

    public Book printBookByPriceRang(int min, int max) {
        for (int i = 0; i < size; ++i) {
            if (array[i].getPrice() >= min && array[i].getPrice() <= max) {
                return array[i];
            }
        }
        return null;
    }


    public Book isBookExist(String title, String authorEmail) {
        for (int i = 0; i < size; i++) {
            if (array[i].getTitle().equalsIgnoreCase(title) && array[i].getAuthorEmail().equalsIgnoreCase(authorEmail)) {
                System.out.println(true);
            }
        }
        return null;
    }
}