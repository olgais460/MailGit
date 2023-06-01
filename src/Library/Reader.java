package Library;

public class Reader {
    String studentName;
    int readMemberNumber;
    String faculty;
    String DateOfBirthday;
    int PhoneNumber;

    public Reader(String studentName, int readMemberNumber, String faculty, String dateOfBirthday, int phoneNumber) {
        this.studentName = studentName;
        this.readMemberNumber = readMemberNumber;
        this.faculty = faculty;
        this.DateOfBirthday = dateOfBirthday;
        this.PhoneNumber = phoneNumber;
    }

    int amountOfBooks;
    String name1;
    String name2;
    String name3;


    void takeBook() {
        System.out.println("The student took books");
    }

    void returnBook() {
        System.out.println("The student returned books");
    }

    void takeBook(int amountOfBooks, String studentName, String name1,String name2,String name3) {
        System.out.println(studentName+" взял "+amountOfBooks+"книги "+name1+" "+name2+" "+name3);}

        void takeBook(int amountOfBooks,String studentName) {
            System.out.println(studentName+" взял "+amountOfBooks+"книги");}

            void returnBook(int amountOfBooks, String studentName, String name1,String name2,String name3) {
                System.out.println(studentName+" вернул "+amountOfBooks+"книги "+name1+" "+name2+" "+name3);
            }


    }
