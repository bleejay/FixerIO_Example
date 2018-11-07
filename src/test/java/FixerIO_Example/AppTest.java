package FixerIO_Example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    FixerLatestRatesParser ratesParser = new FixerLatestRatesParser();

    @Test
    public void testSuccess(){
        Assert.assertEquals(true, ratesParser.getFileSuccess());
    }

//    @Test
//    public void testTimeStamp(){
//        Assert.assertEquals(1539182646, ratesParser.getTimeStamp());
//    }

    @Test
    public void testBaseRate(){
        Assert.assertEquals("EUR", ratesParser.getBaseRate());
    }

//    @Test
//    public void testDate(){
//        Assert.assertEquals("2018-10-10", ratesParser.getDate());
//    }

    @Test
    public void testNumberOfRates(){
        Assert.assertEquals(168,ratesParser.getRates().size());
    }

    @Test
    public void testSpecificRate(){
        System.out.println(ratesParser.getSpecificRate("EUR"));
    }
}

