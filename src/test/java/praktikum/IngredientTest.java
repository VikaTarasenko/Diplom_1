package praktikum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static praktikum.IngredientType.SAUCE;

public class IngredientTest {

    @Test
    public void getPrice() {
        var ingredient = new Ingredient(SAUCE, "bulka", 40);

        Assert.assertEquals(40, 40, ingredient.getPrice());
    }

    @Test
    public void getName() {
        var ingredient = new Ingredient(SAUCE, "bulka", 40);
        assertEquals("bulka", ingredient.getName());
    }

    @Test
    public void getType() {
        var ingredient = new Ingredient(SAUCE, "bulka", 40);
        assertEquals(SAUCE, ingredient.getType());
    }
}