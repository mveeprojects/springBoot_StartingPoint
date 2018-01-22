package hello;

import org.junit.Test;

import static hello.SimpleFunctions.add;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleTests {

    @Test
    public void addTest() {
        int actual = add(2,3);
        assertThat(actual, is(4));
    }
}
