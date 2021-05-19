package homework.author;

import homework.author.model.Author;
import homework.author.model.Book;
import homework.author.storage.AuthorStorage;
import homework.author.storage.BookStorage;

import java.util.Scanner;

public class AuthorBookMain implements Commands {


    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;
        while (run) {

            Commands.printCommands();

            int command;
            try {

                command = Integer.parseInt(scanner.next());
                switch (command) {
                    case EXIT -> run = false;
                    case ADD_AUTHOR -> addAuthor();
                    case SEARCH_AUTHOR_BY_NAME -> searchByName();
                    case PRINT_ALL_AUTHORS -> authorStorage.printAuthor();
                    case ADD_BOOK -> addBook();
                    case PRINT_ALL_BOOKS -> bookStorage.printBook();
                    case PRINT_BOOK_BY_RANGE -> printBookByPriceRang();
                    case CHECK_BOOK -> isBookExist();
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
        System.out.println(bookStorage.isBookExist(title, authorEmail));

    }

    private static void printBookByPriceRang() {
        System.out.println("Ներմուծեք մինիմում գինը");
        int min = Integer.parseInt(scanner.next());
        System.out.println("Ներմուծեք մաքսիմում գինը");
        int max = Integer.parseInt(scanner.next());
        bookStorage.printBookByPriceRang(min, max);
    }

    private static void addBook() {

        Book book = new Book();
        System.out.println("Ներմուծեք վերնագիր");
        book.setTitle(scanner.next());
        System.out.println("Ներմուծեք նկարագիրը");
        book.setDescription(scanner.next());
        System.out.println("Ներմուծեք գինը");
        book.setPrice(Integer.parseInt(scanner.next()));
        System.out.println("Ներմուծեք քանակը");
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





