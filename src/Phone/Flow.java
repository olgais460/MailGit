package Phone;

public class Flow {
    public static void main(String[] args) {
        Phone nokia = new Phone(791247561, "1A3B", 25);
        Phone samsung = new Phone(123456, "4g78k", 52);
        Phone sony = new Phone(456987, "7885", 78);


        int sonyNumber = sony.getNumber();
        int SamsungNumber = samsung.getNumber();
        int NokiaNumber = nokia.getNumber();


        System.out.println("Nokia Number " + nokia.number + ",model " + nokia.model + ",weight " + nokia.weight);
        sony.receiveCall("Мама");
        samsung.receiveCall("Роман");
        nokia.receiveCall("Светлана");

        sony.receiveCall("юля", 123456);


        Person Ivan = new Person();
        Person Maria = new Person();

        Maria.talk("Maria");

        Maria.move("Maria");
        Ivan.talk("Ivan");
        Ivan.move("Ivan");
        nokia.sendMessage("147812", "54545151","4484851");

    }
}