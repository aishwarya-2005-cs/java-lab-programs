import java.util.Scanner;

class Books {
    String name;
    String author;
    int price;
    int numPages;

    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {
        String bookDetails = "Book name: " + this.name + "\n" +
                             "Author name: " + this.author + "\n" +
                             "Price: " + this.price + "\n" +
                             "Number of pages: " + this.numPages + "\n";
        return bookDetails;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        System.out.println("Enter the number of books:");
        n = s.nextInt();
        Books[] books = new Books[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the book details (name, author, price, number of pages):");
            String name = s.next();
            String author = s.next();
            int price = s.nextInt();
            int numPages = s.nextInt();
            books[i] = new Books(name, author, price, numPages);
        }

        System.out.println("Book details:");
        for (Books book : books) {
            System.out.println(book.toString());
            System.out.println("Name:K.Aishwarya,Usn:1BM23CS129");
        }

        s.close();
    }
}
