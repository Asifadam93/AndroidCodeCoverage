package com.esgi.codecoverage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Asifadam93 on 23/07/2017.
 */

public class UtilClassTester {

    private Util util = null;

    @Before
    public void setUp() {
        util = Util.getInstance();
    }

    @Test
    public void testGetValue() {
        Assert.assertEquals(util.getValue(150), "High");
        Assert.assertEquals(util.getValue(30), "Low");
    }

}
