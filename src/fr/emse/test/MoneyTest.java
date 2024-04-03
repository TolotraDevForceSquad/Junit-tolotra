package fr.emse.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MoneyTest {
    private Money f12CHF;
    private Money f7USD;

    @Before
    public void setUp() {
        f12CHF = new Money(12, "CHF");
        f7USD = new Money(7, "USD");
    }

    @Test
    public void testSimpleAdd() {
        Money expected = new Money(19, "CHF");
        IMoney result = f12CHF.add(new Money(7, "CHF"));
        assertEquals(expected, result);
    }

    @Test
    public void testEquals() {
        assertTrue(!f12CHF.equals(null));
        assertEquals(f12CHF, f12CHF);
        assertEquals(f12CHF, new Money(12, "CHF"));
        assertTrue(!f12CHF.equals(f7USD));
    }

    @Test
    public void testMixedSimpleAdd() {
        Money bag[] = { f12CHF, f7USD };
        MoneyBag expected = new MoneyBag(bag);
        assertEquals(expected, f12CHF.add(f7USD));
    }
}
