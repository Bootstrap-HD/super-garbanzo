import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HorsePowerTest {

    public Coupe car = new Coupe("BMW", "3", 4, 300, 3.0, 2);
    public int horsePower = car.getEnginePower();

    @Test(groups = "positive")
    public void dataTypeTest() {
        boolean a = horsePower instanceof Integer;
        assertTrue(a);
    }

    @Test(groups = "positive")
    public void valueTest() {
        assertEquals(horsePower, 300);
    }
}
