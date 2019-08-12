package kz.kulamkadyr.task.model;

import java.util.Map;

/**
 * Класс DivisionClass со свойствами numString.
 */
public class DivisionClass {

    /** Поле numString*/
    Map<Integer, String> numString;

    /**
     * Конструктор - создание нового объекта с Map<int, String>
     * @param numString - numString
     */
    public DivisionClass(Map<Integer, String> numString) {
        this.numString = numString;
    }

    /**
     * Метод генерации сообщения по заданному Алгоритму
     * @return возвращает сообщение
     */
    public String getMessage(int number)
    {
        StringBuilder message = new StringBuilder();
        boolean first=true;
        for(Map.Entry entrySet:numString.entrySet())
        {
            if(first)
                first=false;

            if(number% (int)entrySet.getKey()==0)
                message.append(entrySet.getValue().toString());
        }

        return message.toString();
    }
}
