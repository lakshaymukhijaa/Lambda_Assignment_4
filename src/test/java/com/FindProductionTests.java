package com ;
;
import org.junit.Assert;
import org.junit.Test;

public class FindProductionTests {

    @Test
    public void shouldGetProduction(){
        long expected = 24;
        long output = FindProduction.getResult(1,4);
        Assert.assertTrue(expected==output);
    }
}
