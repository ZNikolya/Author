package homework.author.Storgae;

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

    public void printBookByPriceRang(int min, int max) {
        for (int i = 0; i < size; i++) {
            if (array[i].getPrice() >= min && array[i].getPrice() <= max){
                System.out.println(array[i]);
            }else
                System.out.println("Այդ գնի սահմաններում գիրք չկա");
        }

    }


    public void isBookExist(String title,String authorEmail) {

        for (int i = 0; i < size; i++) {
            if (array[i].getTitle().equalsIgnoreCase(title) && array[i].getAuthorEmail().equalsIgnoreCase(authorEmail)){
                System.out.println(true);
            }else
                System.out.println(false);
        }
    }
}
