import myUnCompletedProjects.Petrol;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class PetrolClassTest {
    // Petrol petrol = new Petrol("Yaba","Diesel",30,250.00,5.00 );
    private Petrol petrol = new Petrol();
    @Test
    public void allArgsExistInClassPetrol(){
        assertNotNull(petrol);
    }
    @Test
    public void getLocationTest() {
        petrol.setLocation("yaba");
        String locationSet = petrol.getLocation();
        assertEquals("yaba", locationSet);
    }
    @Test
    public void setLocationTest(){
        petrol.setLocation("yaba");
        assertEquals("yaba", petrol.getLocation());
    }
    @Test
    public void getTypeOfPetrolTest(){
        petrol.setTypeOfPetrol("Diesel");
        String fuel =petrol.getTypeOfPetrol();
        assertEquals("Diesel",fuel);
    }
    @Test
    public void setTypeOfPetrolTest(){
        petrol.setTypeOfPetrol("Diesel");
        assertEquals("Diesel",petrol.getTypeOfPetrol());
    }
    @Test
    public void setLiterPurchase(){
        petrol.setLiterPurchase(20);
        assertEquals(20,petrol.getLiterPurchase());

    }
    @Test
    public void setPriceForPetrol(){
        petrol.setPriceForPetrol(250);
        double price = 250;
        assertEquals(price,petrol.getPriceForPetrol(),250.00);
    }
}
