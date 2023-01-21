package praktikum;

import org.junit.Test;


public class IngredientTypeTest {

    @Test
    public void values() {
        assert IngredientType.FILLING != null;
    }

    @Test
    public void valueOf() {
        assert IngredientType.SAUCE != null;
    }
}