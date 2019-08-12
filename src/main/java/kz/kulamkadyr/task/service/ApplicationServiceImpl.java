package kz.kulamkadyr.task.service;

import kz.kulamkadyr.task.model.DivisionClass;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    /**
     * Реализация метода getMessage интерфейса ApplicationService
     */

    @Override
    public String getMessage(int number) {

        /**
         * Создаем объект map и добавляем в него данные
         */
        Map<Integer, String> map = new HashMap<>();
        map.put(7, "boo");
        map.put(3, "foo");
        map.put(5,"bar");

        /**
         * Создаем объект класса DivisionClass с помощью конструктора
         */
        DivisionClass divisionClass = new DivisionClass(map);

        /**
         * Вызываем метод getMessage(int number) объекта divisionClass
         * и возвращаем его значение
         */
        return divisionClass.getMessage(number);
    }
}
