package homework.author.model;


import java.util.Objects;

public class Book {

    private String title;
    private String description;
    private int price;
    private int count;
    private String authorEmail;

    public Book(String title, String description, int price, int count, String authorEmail) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.count = count;
        this.authorEmail = authorEmail;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && count == book.count && Objects.equals(title, book.title) && Objects.equals(description, book.description) && Objects.equals(authorEmail, book.authorEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, price, count, authorEmail);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", authorEmail=" + authorEmail +
                '}';
    }


}
