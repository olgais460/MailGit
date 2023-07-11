package Task;

import java.util.*;

/// Здравствуйте! Мне не удалось выполнить условие задачи. Отправляю, что получилось)
public class Massive {

    public static <T> void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 7;
        nums[3] = 9;
        nums[4] = 12;

        for (int i = 0; i < 5; i++) {

            System.out.println("[" + i + " ] " + nums[i]);
        }


        Map<Integer, Integer> difs = new HashMap();//создаем map
        int ancore = 10;

        for (int i=0;i<nums.length;i++) {
            int dif = Math.abs(ancore - nums[i]);//вычисляем разницу между 10 и текущим значением элемента массива

            difs.put( nums[i],dif);}  //  заполняем map с ключ-значением (значение тек. элемента- разница его и 10)
            System.out.println(difs);

            Integer res = Collections.min(difs.values());// вычисляем мин значение
            System.out.println(res);

        }
}
