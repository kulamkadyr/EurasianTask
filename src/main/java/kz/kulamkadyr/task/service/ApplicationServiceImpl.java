package kz.kulamkadyr.task.service;

import kz.kulamkadyr.task.model.DivisionClass;
import org.springframework.stereotype.Service;

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


        /**
         * Создаем объект класса DivisionClass с помощью метода getInstance
         */
        DivisionClass divisionClass = DivisionClass.getInstance();

        /**
         * Вызываем метод getMessage(int number) объекта divisionClass
         * и возвращаем его значение
         */
        return divisionClass.getMessage(number);
    }
}
