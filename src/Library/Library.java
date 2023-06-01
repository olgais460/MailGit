package Library;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {

        Librarian currentLibrarian = new Librarian();

        currentLibrarian.giveBook();

         Book book1 = new Book("Приключения", "Пушкин А.С.");
         Book book2 = new Book("Словарь", "Даль В.И.");
         Book book3 = new Book("Энциклопедия", "Семенов Р.Л.");

        currentLibrarian.books[0]= book1;
        currentLibrarian.books[1] =book2;
        currentLibrarian.books[2] =book3;


        Reader reader1 = new Reader("Ivan", 0001, "philosophy", "01/01/1990", 874125896);

reader1.amountOfBooks=currentLibrarian.books.length;

reader1.takeBook(reader1.amountOfBooks, reader1.studentName);

        reader1.name1=book1.bookName;
        reader1.name2=book2.bookName;
        reader1.name3=book3.bookName;
        reader1.takeBook(reader1.amountOfBooks, reader1.studentName, reader1.name1, reader1.name2, reader1.name3);
reader1.returnBook(reader1.amountOfBooks, reader1.studentName, reader1.name1, reader1.name2, reader1.name3);
        for (int i=0;i < currentLibrarian.books.length;i++){
            System.out.println(currentLibrarian.books[i]);
        }

}
    }