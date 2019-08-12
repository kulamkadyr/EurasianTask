package kz.kulamkadyr.task.service;

import kz.kulamkadyr.task.model.DivisionClass;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ApplicationServiceImplTest {

    @Test
    public void getMessage() {

        Map<Integer, String> map = new HashMap<>();
        map.put(3, "foo");
        map.put(5,"bar");

        DivisionClass divisionClass = new DivisionClass(map);

        String expectedMessage = "foobar";
        String actualMessgae = divisionClass.getMessage(15);


        Assert.assertEquals(expectedMessage, actualMessgae);
    }
}