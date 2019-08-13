package kz.kulamkadyr.task.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс одиночка DivisionClass
 */
public class DivisionClass {

    /**Поле для хранения объекта-одиночки*/
    private static DivisionClass instance;

    /** Поле numString*/
    Map<Integer, String> numString;

    /**Приватный конструктор одиночки
     * где создается объект map и в него добавляем данные*/
    private DivisionClass() {

        Map<Integer, String> map = new HashMap<>();
        map.put(7, "boo");
        map.put(3, "foo");
        map.put(5,"bar");

        numString=map;
    }

    /** Основной статический метод одиночки служит альтернативой
    * конструктору и является точкой доступа к экземпляру этого
    * класса.
     */
    public static DivisionClass getInstance()
    {
        if(instance == null) {
            instance = new DivisionClass();
        }
        return instance;
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
