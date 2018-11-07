package FixerIO_Example;

public class App 
{
    public static void main( String[] args ) {

        FixerLatestRatesParser fixerLatestRatesParser =  new FixerLatestRatesParser();
        System.out.println(fixerLatestRatesParser.getBaseRate());

    }
}
