package taskParts.part3;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CivilizationTests {
    Civilization civ;

    @Test
    public void test_DefaultCivilization_Existed(){
        civ = new Civilization();
        Assertions.assertTrue(civ.getExisted());
    }

    @Test
    public void test_DefaultCivilization_HasDefaultName(){
        civ = new Civilization();
        Assertions.assertNotEquals(civ.getName(), null);
    }

    @Test
    public void test_InitiallyRuinedCivilization_neverExisted(){
        civ = new Civilization(true);
        Assertions.assertFalse(civ.getExisted());
    }

    @Test
    public void test_RuinedCivilization_doesntExist(){
        civ = new Civilization(true);
        Assertions.assertFalse(civ.exists());
    }

    @Test
    public void test_InitiallyNonRuinedCivilization_Existed(){
        civ = new Civilization(false);
        Assertions.assertTrue(civ.getExisted());
    }

    @Test
    public void test_InitiallyRuinedCivilizationWithName_NeverExisted(){
        civ = new Civilization("Test", true);
        Assertions.assertFalse(civ.getExisted());
    }

    @Test
    public void test_InitiallyNonRuinedCivilizationWithName_Existed(){
        civ = new Civilization("Test", false);
        Assertions.assertTrue(civ.getExisted());
    }

    @Test
    public void test_CivilizationWithName_getName_ReturnsRightName(){
        civ = new Civilization("Test");
        Assertions.assertEquals(civ.getName(), "Test");
    }

    @Test
    public void test_CivilizationWithNameAndRuinedStatus_ReturnsRightName(){
        civ = new Civilization("Test", true);
        Assertions.assertEquals(civ.getName(), "Test");
    }

    @Test
    public void test_turnToDust_RuinsCivilization() {
        civ = new Civilization("Test", false);
        try {
            civ.turnToDust();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(civ.exists());
    }

    @Test
    public void test_turnToDust_doesntChange_getExisted_ForInitiallyNonRuinedCivilization() {
        civ = new Civilization("Test", false);
        try {
            civ.turnToDust();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(civ.getExisted());
    }

    @Test
    public void test_turnToDust_doesntChange_getExisted_ForInitiallyRuinedCivilization() {
        civ = new Civilization("Test", true);
        try {
            civ.turnToDust();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertFalse(civ.getExisted());
    }

    @Test
    public void test_turnToDust_ForRuinedCivilization_ThrowsException(){
        civ = new Civilization("Test", true);
        Assertions.assertThrows(Exception.class, () -> {civ.turnToDust();});
        Assertions.assertFalse(civ.exists());
    }
}
