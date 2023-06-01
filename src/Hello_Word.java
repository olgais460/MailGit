public class Hello_Word {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Object object = new Object();
        System.out.println(object.hashCode());

        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        sb.append("Red ").append("Green ").append("Blue ").append("Orange");
        System.out.println(sb);

        System.out.printf("String %.2f \n", 47.454487);
        //Не разобралась, как дедается перенос стороки . какой символ перед \n

        System.out.println("Про b");
        byte b = -111;
        b >>>= 3;
        System.out.println("b=" + b);
        int a = 7;
        a += 4;
        System.out.println(a);



        }

    }



