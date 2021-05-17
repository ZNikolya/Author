package homework.author;

import homework.author.storage.AuthorStorage;
import homework.author.storage.BookStorage;
import homework.author.model.Author;
import homework.author.model.Book;

import java.util.Scanner;

public class AuthorBookMain {

    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();
    static Scanner scanner = new Scanner(System.in);

    public static void main(java.lang.String[] args) {

        boolean run = true;
        while (run) {

            System.out.println("Ներմուծեք 0 դուրս գալու համար");
            System.out.println("Ներմուծեք 1 հեղինակ ավելացնելու համար");
            System.out.println("Ներմուծեք 2 հեղինակին անունով փնտրելու համար");
            System.out.println("Ներմուծեք 3 բոլոր հեղինակներին տեսնելու համար");
            System.out.println("Ներմուծեք 4 գիրք ավելացնելու համար");
            System.out.println("Ներմուծեք 5 բոլոր գրքերը տեսնելու համար");
            System.out.println("Ներմուծեք 6 տրված գնի սահմաններում գրքերը տեսնելու համար");
            System.out.println("Ներմուծեք 7 գիրքը վերնագրով և հեղինակի email-ով փնտրելու համար");

            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
                switch (command) {
                    case 0 -> run = false;
                    case 1 -> addAuthor();
                    case 2 -> searchByName();
                    case 3 -> authorStorage.printAuthor();
                    case 4 -> addBook();
                    case 5 -> bookStorage.printBook();
                    case 6 -> printBookByPriceRang();
                    case 7 -> isBookExist();
                    default -> System.out.println("Սխալ հրաման");
                }
            } catch (NumberFormatException e) {
                command = -1;
            }

        }
    }

    private static void isBookExist() {
        System.out.println("ներմուծեք գրքի վերնագիրը");
        String title = scanner.next();
        System.out.println("իսկ հիմա հեղինակի email-ը");
        String authorEmail = scanner.next();
        bookStorage.isBookExist(title, authorEmail);

    }

    private static void printBookByPriceRang() {
        System.out.println("Ներմուծեք մինիմում գինը");
        int min = Integer.parseInt(scanner.next());
        System.out.println("Ներմուծեք մաքսիմում գինը");
        int max = Integer.parseInt(scanner.next());
        bookStorage.printBookByPriceRang(min,max);
    }

    private static void addBook() {

        Book book = new Book();
        System.out.println("Ներմուծեք վերնագիր");
        book.setTitle(scanner.next());
        System.out.println("Ներմուծեք նկարագիրը");
        book.setDescription(scanner.next());
        System.out.println("Ներմուծեք գինը");
        book.setPrice(Integer.parseInt(scanner.next()));
        System.out.println("Ներմուծեք count");
        book.setCount(Integer.parseInt(scanner.next()));
        System.out.println("Ներմուծեք գրքի հեղինակին");
        book.setAuthorEmail(scanner.next());
        bookStorage.addBook(book);

    }

    private static void searchByName() {
        System.out.println("Ներմուծեք հեղինակի անունը");
        String name = scanner.nextLine();
        authorStorage.searchByName(name);
    }

    private static void addAuthor() {
        Author author = new Author();
        System.out.println("Ներմուծեք անուն");
        author.setName(scanner.next());
        System.out.println("Ներմուծեք ազգանուն");
        author.setSurname(scanner.next());
        System.out.println("Ներմուծեք email");
        author.setEmail(scanner.next());
        System.out.println("Ներմուծեք տարիք");
        author.setAge(Integer.parseInt(scanner.next()));
        System.out.println("Ներմուծեք սեռը");
        String gender = scanner.next();
        if (!"MALE".equalsIgnoreCase(gender) && !"FEMALE".equalsIgnoreCase(gender)) {
            System.err.println("Սխալ սեռ");
            return;
        }
        author.setGender(gender);
        authorStorage.addjoin(author);
    }
}





