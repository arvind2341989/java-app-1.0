package org.anudip.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.anudip.app.mathematics.Addition;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void shouldProvideResult() {
    	Addition addition = new Addition();
    	
    	int result = addition.add(10, 2);
    	
        assertEquals(12, result, "Addition result is incorrect.");
    }
}
