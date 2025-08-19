import java.io.*;
import java.util.*;

public class BookData {
    private final String filePath;
    private List<Book> bookData = null;

    public BookData(String filePath) {
        this.filePath = filePath;
    }

    private List<Book> csvToList() {
        List<Book> books = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                if (data.length < 7) continue; 
                
                books.add(new Book(
                    data[0].trim(),                    // name
                    data[1].trim(),                    // author
                    Float.parseFloat(data[2].trim()),  // userRating
                    Integer.parseInt(data[3].trim()),  // reviews
                    Float.parseFloat(data[4].trim()),  // price
                    Integer.parseInt(data[5].trim()),  // year
                    data[6].trim()                     // genre
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }
    


    public List<Book> getBookData() {
        if (bookData == null) {
            bookData = csvToList();
        }
        return bookData;
    }
}
