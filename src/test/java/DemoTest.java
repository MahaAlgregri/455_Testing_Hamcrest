
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.containsStringIgnoringCase;

import static org.junit.Assert.assertThat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
/**
 *
 * @author Maha
 */
public class DemoTest {

    public DemoTest() {
    }

    @Test
    public void testMultiplesOf() {

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("London", "Tokyo", "New York"));

        assertThat(cities, hasItem(containsStringIgnoringCase("london")));
    }

}
