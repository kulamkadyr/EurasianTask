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

        DivisionClass divisionClass = DivisionClass.getInstance();

        String expectedMessage = "foobar";
        String actualMessgae = divisionClass.getMessage(15);

        Assert.assertEquals(expectedMessage, actualMessgae);
    }
}