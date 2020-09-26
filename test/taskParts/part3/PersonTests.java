package taskParts.part3;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PersonTests {
    ByteArrayOutputStream baos;
    Person male;
    Person female;

    @Before
    public void createPerson(){
        baos = new ByteArrayOutputStream();
        male = new Person("John", true);
        female = new Person("Ann", false);
        System.setOut(new PrintStream(baos));
    }

    @Test
    public void test_shrug_male(){
        male.shrug();
        Assertions.assertEquals(baos.toString(), "John пожал плечами\r\n");
    }

    @Test
    public void test_shrug_female(){
        female.shrug();
        Assertions.assertEquals(baos.toString(), "Ann пожала плечами\r\n");
    }

    @Test
    public void test_think_male(){
        male.think("test");
        Assertions.assertEquals(baos.toString(), "John подумал, что test\r\n");
    }

    @Test
    public void test_think_female(){
        female.think("test");
        Assertions.assertEquals(baos.toString(), "Ann подумала, что test\r\n");
    }

    @Test
    public void test_assume_male(){
        male.assume("test");
        Assertions.assertEquals(baos.toString(), "John предположил, что test\r\n");
    }

    @Test
    public void test_assume_female(){
        female.assume("test");
        Assertions.assertEquals(baos.toString(), "Ann предположила, что test\r\n");
    }
}
