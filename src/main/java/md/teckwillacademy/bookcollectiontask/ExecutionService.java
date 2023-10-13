package md.teckwillacademy.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class ExecutionService {
    public static void main(String[] args) {

        Book mihaiBook = new Book("Atomic Habits","James C.");
        Book alexBook = new Book("Crime and Punishment","Feodor D.");
        Book ruxandaBook = new Book("Karamazov Brothers","Feodor D.");
        Book veronicasBook = new Book("To kill a Mockingbird","Harper L.");
        Book mihais2Book = new Book("1984","George O");

        mihais2Book.printTheBookDetails();
        mihaiBook.printTheBookDetails();
        alexBook.printTheBookDetails();
        ruxandaBook.printTheBookDetails();
        veronicasBook.printTheBookDetails();



        Library carturestuLibrary = new Library("Carturesti");
        carturestuLibrary.addBook(mihaiBook);
        carturestuLibrary.addBook(mihais2Book);
        carturestuLibrary.addBook(veronicasBook);
        carturestuLibrary.addBook(ruxandaBook);

        System.out.println(carturestuLibrary.getTheStockStatusNumber());
        System.out.println(carturestuLibrary.isThereSuchTheBookInTheStock(alexBook));

        carturestuLibrary.addBook(alexBook);
        System.out.println(carturestuLibrary.getTheStockStatusNumber());
        System.out.println(carturestuLibrary.isThereSuchTheBookInTheStock(alexBook));


        carturestuLibrary.deleteABookIfExists(alexBook);
        System.out.println(carturestuLibrary.getTheStockStatusNumber());

        carturestuLibrary.printAllTheBooks();

        Library victorsLibrary = new Library("Cartier");
        victorsLibrary.addBook(alexBook);
        victorsLibrary.addBook(ruxandaBook);
        victorsLibrary.addBook(veronicasBook);
        victorsLibrary.getTheStockStatusNumber();
        victorsLibrary.printAllTheBooks();


        Map<Object, Library> LibrariesMap = new HashMap<>();
        LibrariesMap.put("Str.Stefan cel mare 136", carturestuLibrary);
        LibrariesMap.put("Str.Dacia 24/3 ap 81",victorsLibrary);

        LibrariesMap.get("Str.Stefan cel mare 136").printAllTheBooks();
        System.out.println(LibrariesMap.get("Str.Dacia 24/3 ap 81").isThereSuchTheBookInTheStock(veronicasBook));

        int[] dataTable = new int[6];
       dataTable[0] = 65;
       dataTable[1] = 12;
         dataTable[2] = 52;
         dataTable[3] = 5;
        dataTable[4] = 1;
        dataTable[5] = 9;


        System.out.println(IntNumberArrayService.findMin(dataTable));
        System.out.println(IntNumberArrayService.getAvg(dataTable));
    }


}
