package ca.yorku.eecs.mcalc;

import junit.framework.Assert;

import org.junit.Test;

public class ModelTest
{
    @Test
    public void testPayment(){

        MortgageModel myModel;

        myModel = new MortgageModel("700000","25","2.75");
//        Assert.assertEquals("C1","$3,229.18",myModel.computePayment());
        Assert.assertEquals("C1","$3229.18",myModel.computePayment());
        Assert.assertEquals("C1","$595,606",myModel.outstandingAfter(60));


        myModel = new MortgageModel("300000","20","4.5");
//        Assert.assertEquals("C2","$1,897.95",myModel.computePayment());
        Assert.assertEquals("C2","$1897.95",myModel.computePayment());

    }
}
