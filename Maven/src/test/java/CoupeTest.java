import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CoupeTest {

    public Coupe car = new Coupe();

    @Test(groups = "negative")
    public void numbersOfDoorsTest() {
        car.setNumbersOfDoors(0);

        int countDoors = car.getNumbersOfDoors();

        assertTrue(countDoors <= 2, "Минимальное количество дверей для Купе: 2");
    }

}
