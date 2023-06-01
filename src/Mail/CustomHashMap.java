package Mail;

import java.util.Collections;
import java.util.HashMap;

public class CustomHashMap extends HashMap {

    //переопределяем метод get класса HashMap, т.к. по условию задачи этот метод должен возвращать пустой список вместо null, если в соответствии нет нужного ключа
    //вот строка из класса Main, которая должна работать корректно: assert mailBox.get(randomTo).equals(Collections.<String>emptyList()): "wrong mailService mailbox content (3)";

    @Override
    public Object get(Object key) {
        if (super.get(key) == null) {
            return Collections.<String>emptyList();
        }else{
            return super.get(key);
        }

    }
}


