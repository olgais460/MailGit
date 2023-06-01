package Mail;

import java.util.*;
import java.util.function.Consumer;

public class MailService<LocalType> implements Consumer<MailMessage>  {

    private Map<String, List<String>> messagesHistory = new CustomHashMap();

    @Override
    public void accept(MailMessage mailMessage) {

        //сохраним на будущее соответствие "отправитель - текст сообщения"
        //сначала получим список ранее отправленных текстов этому получателю

        String currentTo = mailMessage.getTo(); //временная переменная для хранения получателя

        //получим список отправленных ему текстов сообщений (если вообще что-то ранее ему отправляли)
        List<String> currentContentList = messagesHistory.get(currentTo);

        if (currentContentList.equals(Collections.<String>emptyList())){
            //ранее не отправляли письмо данному получателю. Инициализируем пустой список сообщений
            currentContentList = new ArrayList<>();
        }

        //дополним этот список текстом текущего сообщения
        currentContentList.add(mailMessage.getContent());

        //поместим дополненный в историю
        messagesHistory.put(currentTo,currentContentList);
    }


    public Map<String, List<String>> getMailBox() {
        //возвращаем ранее заполненную историю сообщений, сгруппированных по получателю
        return messagesHistory;
    }


}
