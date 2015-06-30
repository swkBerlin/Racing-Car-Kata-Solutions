package tddmicroexercises.leaderboard;

import junit.framework.Assert;
import org.junit.Test;

public class RaceTest {

    @Test
    public void isShouldCalculateDriverPoints() {
        Assert.assertEquals(25, TestData.race1.getPoints(TestData.driver1));
        Assert.assertEquals(18, TestData.race1.getPoints(TestData.driver2));
        Assert.assertEquals(15, TestData.race1.getPoints(TestData.driver3));
    }

}