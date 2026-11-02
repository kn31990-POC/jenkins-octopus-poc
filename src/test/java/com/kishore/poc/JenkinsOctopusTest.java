package com.kishore.poc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JenkinsOctopusTest {

    @Test
    public void testExecution() {

        System.out.println("Jenkins Octopus POC");

        Assert.assertTrue(true, "Test Passed");
    }
}