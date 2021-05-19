package homework.author;

public interface Commands {

    int EXIT = 0;
    int ADD_AUTHOR = 1;
    int SEARCH_AUTHOR_BY_NAME = 2;
    int PRINT_ALL_AUTHORS = 3;
    int ADD_BOOK = 4;
    int PRINT_ALL_BOOKS = 5;
    int PRINT_BOOK_BY_RANGE = 6;
    int CHECK_BOOK = 7;

    static void printCommands() {
        System.out.println("Ներմուծեք " + EXIT + " դուրս գալու համար");
        System.out.println("Ներմուծեք " + ADD_AUTHOR + " հեղինակ ավելացնելու համար");
        System.out.println("Ներմուծեք " + SEARCH_AUTHOR_BY_NAME + " հեղինակին անունով փնտրելու համար");
        System.out.println("Ներմուծեք " + PRINT_ALL_AUTHORS + " բոլոր հեղինակներին տեսնելու համար");
        System.out.println("Ներմուծեք " + ADD_BOOK + " գիրք ավելացնելու համար");
        System.out.println("Ներմուծեք " + PRINT_ALL_BOOKS + " բոլոր գրքերը տեսնելու համար");
        System.out.println("Ներմուծեք " + PRINT_BOOK_BY_RANGE + " տրված գնի սահմաններում գրքերը տեսնելու համար");
        System.out.println("Ներմուծեք " + CHECK_BOOK + " գիրքը վերնագրով և հեղինակի email-ով փնտրելու համար");

    }

}
