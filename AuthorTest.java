package homework.author;

import java.util.Scanner;

public class AuthorTest {


    public static void main(String[] args) {

        Author author = new Author();
        AuthorStorage authorStorage = new AuthorStorage();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Քանի հատ հեղինակ ունենք");
        int number = scanner.nextInt();


        for (int i = 0; i < number; i++) {
            System.out.println("Ներմուծեք անուն");
            author.setName(scanner.next());
            System.out.println("Ներմուծեք ազգանուն");
            author.setSurname(scanner.next());
            System.out.println("Ներմուծեք email");
            author.setEmail(scanner.next());
            System.out.println("Ներմուծեք տարիք");
            author.setAge(Integer.parseInt(scanner.next()));
            System.out.println("Ներմուծեք սեռը");
            author.setGender(scanner.next());
            authorStorage.addjoin(author);
        }

        authorStorage.printAuthor();

    }


}
