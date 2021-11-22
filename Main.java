import java.io.*;
import static java.lang.System.*;
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner it = new Scanner(System.in);
        Book b = new Book("The Child Called it", "Dave Pelzer", 1995, 208, true);
       Book b2 = new Book("The Child Called it", "Dave Pelzer", 2134, 214, true);

        System.out.println(b); // before specifcying toString, this prints hashcode. an aglorithm that is not meaningful to the object (book)
       
        Book my = new Book("Harry Potter and the Sorrcerers Stone", "J.K Rowling", 1997, 223, true);
        System.out.println("\n" + my);    

        System.out.println("The number of pages in Harry Potter and the Sorrcerers Stone "+my.getNumPages());

        System.out.println("Is The Child Called it a hardcover book? "+b.getHardcover());

        System.out.println("Enter new number of pages for The Child Called it: ");
        int np= it.nextInt();
        b.setNumPages(np);
        System.out.println(b);
        Scanner it2 = new Scanner(System.in);
        System.out.println("Change Author for Harry Potter and the Sorrcerers Stone:");
        String u =it2.nextLine();
        my.setAuthor(u);
        System.out.println(my);

        System.out.println("Are the books equal? " +b.equals(b));
        System.out.println("Are the books equal? " +b.equals(b2));
        System.out.println("Are the books equal? " +b.equals(my));
  }
}