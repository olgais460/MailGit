package Mail;

import java.util.*;
import java.util.function.Consumer;

public class MailService<ContentType> implements Consumer<CommonMessage>{

    private Map<String, List<ContentType>> messagesHistory = new CustomHashMap();

    @Override
    public void accept(CommonMessage currentMessage) {

        //сохраним на будущее соответствие "отправитель - текст сообщения (или число для варианта с зарплатой)"
        //сначала получим список ранее отправленных текстов/чисел этому получателю

        String currentTo = currentMessage.getTo(); //временная переменная для хранения получателя

        //получим список отправленных ему текстов/чисел сообщений (если вообще что-то ранее ему отправляли)
        List<ContentType> currentContentList = messagesHistory.get(currentTo);

        if (currentContentList.equals(Collections.<String>emptyList())){
            //ранее не отправляли письмо данному получателю. Инициализируем пустой список сообщений
            currentContentList = new ArrayList<>();
        }

        //дополним этот список текстом текущего сообщения
        currentContentList.add((ContentType) currentMessage.getContent());

        //поместим дополненный в историю
        messagesHistory.put(currentTo,currentContentList);
    }


    public Map<String, List<ContentType>> getMailBox() {
        //возвращаем ранее заполненную историю сообщений, сгруппированных по получателю
        return messagesHistory;
    }


}
