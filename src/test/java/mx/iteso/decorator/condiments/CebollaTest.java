package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Taco.Size;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class CebollaTest {
	
    @Test
    public void testDescription(){
    	Taco taco = mock((Taco.class));
        when(taco.getDescription()).thenReturn("Any taco");
        
        Taco decorator = new Cebolla(taco);
    	
    	Assert.assertTrue(decorator.getDescription().contentEquals("Any taco con cebolla"));
    }
    
    @Test
    public void testCost(){
    	Taco taco = mock((Taco.class));
    	double cost= Math.random();
    	when(taco.cost()).thenReturn(cost);
    	
    	Taco decorator = new Cebolla(taco);
    	
    	Assert.assertTrue(decorator.cost()==cost);
    }
    
    @Test
    public void testSize(){
    	
    	for(Size size: Size.values())
    	{
    		Taco taco = mock((Taco.class));
            when(taco.getSize()).thenReturn(size);
            
            Taco decorator = new Cebolla(taco);
            Assert.assertTrue(decorator.getSize()==size);
    	}
    }
}
