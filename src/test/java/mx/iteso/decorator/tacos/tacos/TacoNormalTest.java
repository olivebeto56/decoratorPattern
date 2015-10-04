package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Taco.Size;
import mx.iteso.decorator.tacos.TacoNormal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TacoNormalTest {
	
	Taco mini;
    Taco regular;
    Taco mega;
    
    @Before
    public void setup() {
        mini = new TacoNormal(Size.mini);
        regular = new TacoNormal(Size.regular);
        mega = new TacoNormal(Size.mega);
    }
    
    @Test
    public void testCost() {
    	Assert.assertTrue(8.00 == mini.cost());
    	Assert.assertTrue(8.00 == regular.cost());
    	Assert.assertTrue(8.00 == mega.cost());
    }
    
    @Test
    public void testDescriptionContainsSize() {
    	Assert.assertTrue(mini.getDescription().contains(""+mini.getSize()));
    	Assert.assertTrue(regular.getDescription().contains(""+regular.getSize()));
    	Assert.assertTrue(mega.getDescription().contains(""+mega.getSize()));
    }
    
    @Test
    public void testDescriptionContainsType() {
    	Assert.assertTrue(mini.getDescription().contains("Taco normal"));
    	Assert.assertTrue(regular.getDescription().contains("Taco normal"));
    	Assert.assertTrue(mega.getDescription().contains("Taco normal"));
    }
}
