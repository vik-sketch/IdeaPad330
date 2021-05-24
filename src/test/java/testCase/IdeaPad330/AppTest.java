package testCase.IdeaPad330;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//kljhdfjkhkjkasjdfio
// this line is added by vikash
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase								// changes done on 24th may
{
    /**
     * Create the test case						// to make sure i am writting one more comment here
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
