package BookSorted;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> bookList = new TreeSet<>(new OrderBookNameComparator()); //isme gore siraladik

        bookList.add(new Book("Sefiller       " , 999 ,"Victor Hugo   " , "1862"));
        bookList.add(new Book("Vadideki Zambak" , 328 ,"Balzac         " , "1835"));
        bookList.add(new Book("Suç ve Ceza    " , 704 ,"Dostoyevski    " , "1866"));
        bookList.add(new Book("Moby Dıck      " , 744 ,"Herman Melvılle" , "1851"));
        bookList.add(new Book("Baba ve Piç    " , 416 ,"Elif Şafak     " , "2006"));

        for ( Book book : bookList){
            System.out.println(book.getBookName() + " -->> " + book.getWriterName()); //isme gore siraladigimiz kitaplarin adini ve yazarini yazdiriyoruz
        }

        System.out.println("=================================================================");
        System.out.println("*****************************************************************");
        System.out.println("=================================================================");

        TreeSet<Book> booksList2 = new TreeSet<>(new OrderBookPageNoComparator()); //sayfa sayisina gore siraladik

        booksList2.add(new Book("Sefiller       " , 999 ,"Victor Hugo   " , "1862"));
        booksList2.add(new Book("Vadideki Zambak" , 328 ,"Balzac         " , "1835"));
        booksList2.add(new Book("Suç ve Ceza    " , 704 ,"Dostoyevski    " , "1866"));
        booksList2.add(new Book("Moby Dıck      " , 744 ,"Herman Melvılle" , "1851"));
        booksList2.add(new Book("Baba ve Piç    " , 416 ,"Elif Şafak     " , "2006"));

        for ( Book book : booksList2){
            System.out.println(book.getPageNo() + " sayfa  -->> " + book.getBookName() + " -->> " + book.getWriterName()); //isme gore siraladigimiz kitaplarin adini ve yazarini yazdiriyoruz
        }
        System.out.println("=================================================================");



    }
}
