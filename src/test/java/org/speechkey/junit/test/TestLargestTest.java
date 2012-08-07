package org.speechkey.junit.test;

import org.speechkey.junit.Largest;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class TestLargestTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestLargestTest( String testName )
    {
        super( testName );
    }

    /**
     * Rigourous Test :-)
     */
    public void testSimple()
    {
        assertEquals(9, Largest.largest(new int[] {8, 9, 7}) );
    }
}
