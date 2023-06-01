package Phone;



import java.util.Arrays;

public class Phone {
    int number;
    String model;
    int weight;
    String Name;

    void receiveCall(String callerName, int callerNumber) {

        Name = callerName;
        number=callerNumber;
        System.out.println("звонит "+Name+" c номера "+number);

    }

    void receiveCall(String callerName) {
        Name = callerName;
        System.out.println("Звонит " + Name);
    }

    int getNumber() {
        return number;
    }


    public Phone(int number, String model, int weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone( int number, String model){
            this.number = number;
            this.model = model;}

            public Phone() {
            }
            void sendMessage(String...numbers)
            {
                System.out.println(Arrays.toString(numbers));
            }

}





