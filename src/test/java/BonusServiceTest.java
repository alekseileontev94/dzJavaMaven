import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    void testRegistered() {
        BonusService service = new BonusService();


        long amount = 1000;
        boolean registered = true;
        long expected = 30;


        long actual = service.calculate(amount, registered);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testForRegisteredLimit() {
        BonusService service = new BonusService();


        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;


        long actual = service.calculate(amount, registered);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testUnegisteredLimit() {
        BonusService service = new BonusService();


        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;


        long actual = service.calculate(amount, registered);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testUnegisteredL() {
        BonusService service = new BonusService();


        long amount = 2000;
        boolean registered = false;
        long expected = 20;


        long actual = service.calculate(amount, registered);


        Assertions.assertEquals(expected, actual);
    }
}