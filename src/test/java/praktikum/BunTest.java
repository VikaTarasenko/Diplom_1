package praktikum;


import org.junit.Assert;
import org.junit.Test;

import javax.naming.Name;

import static org.junit.Assert.assertEquals;

public class BunTest {

    @Test
    public void getName() {
        var bun = new Bun("bulka", 50);

    assertEquals("bulka", bun.getName());
    }

    @Test
    public void getPrice() {
        var bun = new Bun("bulka", 50);

       Assert.assertEquals(50, 50, bun.getPrice());
    }
}