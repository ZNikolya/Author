package homework.author;

public class AuthorStorage {


    private Author[] array = new Author[10];
    private int size;


    public void addjoin(Author value) {

        if (size == array.length) {
            expand();
        }
        array[size++] = value;
    }

    private void expand() {
        Author[] arraynew = new Author[array.length + 10];
        System.arraycopy(array, 0, arraynew, 0, array.length);
        array = arraynew;
    }

    public void printAuthor() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " " + "\n");
        }
        System.out.println();
    }


}
