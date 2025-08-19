# README

This Java project reads book data from a CSV file, models each book as an object, and provides various query functionalities such as filtering by author, rating, and retrieving book prices. It uses `BufferedReader` for efficient CSV reading, ensuring no external CSV libraries are needed.


## Functions

- Reads and parses a CSV file containing book details (name, author, rating, reviews, price, year, genre).
- Creates a list of `Book` objects representing each record.
- Provides query methods to:
  - Get number of books by an author
  - List authors and their books
  - Fetch books by rating
  - Retrieve book names and prices by author
- Outputs query results in console.


## How to Run


1. **Compile:**
   Open a terminal, navigate to the folder, and run:
   ```
   javac Book.java BookData.java BookQueries.java TestBookData.java
   ```

2. **Run the program:**
   ```
   java TestBookData
   ```
   This runs the main test file, which loads the CSV data and runs sample queries.

3. **Modify queries:**
   - Edit `TestBookData.java` to comment/uncomment or add queries.
   - Re-compile and run again to see different outputs.


## Technical Details

- Uses standard Java file IO (`BufferedReader`, `FileReader`) to read CSV lines.
- Splits CSV lines safely to handle commas inside quoted fields using regex.
- Parses numeric values with error handling.
- Uses Java collections (`List`, `HashSet`, `HashMap`) to store and aggregate book data.
- Implements encapsulation by modeling books as objects with getters.
- Allows lazy loading of CSV data (only on first query call).

