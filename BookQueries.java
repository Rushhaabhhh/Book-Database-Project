import java.util.HashSet;
import java.util.List;

class BookPrice {
    private String name;
    private float price;

    BookPrice(String name, float price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "BookPrice{name='" + name + "', price=" + price + "}";
    }
}

public class BookQueries {
    private List<Book> books;
    public BookQueries(List<Book> books) {
        this.books = books;
    }

    public int numberOfBooksByAuthor(String author) {
        HashSet<String> set = new HashSet<>();
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                set.add(b.getName());
            }
        }
        return set.size();
    }

    public HashSet<String> countOfAuthors() {
        HashSet<String> set = new HashSet<>();
        for (Book b : books) {
            set.add(b.getAuthor());
        }
        return set;
    }

    public HashSet<String> namesOfBooksByAuthor(String author) {
        HashSet<String> set = new HashSet<>();
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                set.add(b.getName());
            }
        }
        return set;
    }

    public HashSet<String> booksByRating(float rating) {
        HashSet<String> set = new HashSet<>();
        for (Book b : books) {
            if (b.getUserRating() == rating) {
                set.add(b.getName());
            }
        }
        return set;
    }

    public HashSet<BookPrice> getBooksAndPricesByAuthor(String author) {
        HashSet<BookPrice> set = new HashSet<>();
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                set.add(new BookPrice(b.getName(), b.getPrice()));
            }
        }
        return set;
    }
}
