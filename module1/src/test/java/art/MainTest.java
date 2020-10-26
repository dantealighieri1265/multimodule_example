/**
 * 
 */
package art;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author giuseppe
 *
 */
@RunWith(value = Parameterized.class)
public class MainTest {
	private int a1;
	private int a2;
	private int res;

	
    //Parametri in input
    @Parameterized.Parameters
    public static Collection<?> getParameters(){


        return Arrays.asList(new Object[][] {
                {1, 1, 1},
                {1, 2, 1},
                {2, 1, 1},
                {1, 0, 1}

        });
    }
    
    public MainTest(int a1, int a2, int res) {
    	this.a1 = a1;
    	this.a2 = a2;
    	this.res = res;
    }


	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Main main = new Main();
		assertEquals(res, main.foo(a1, a2));
	}

}
