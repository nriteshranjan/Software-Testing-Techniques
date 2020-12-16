import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;


public class CourierAgencyTest {
    CourierAgency courierAgency = new CourierAgency(0, "764036", 0, 100);

    // Valid Check
    @Test
    public void ValidCheck() { // for Domestic Doc
        assertEquals(200, courierAgency.costCalculate());
    }

    @Test
    public void ValidCheck1() { // for Domestic Parcel
        courierAgency.itemType = 1; // if item is parcel
        assertEquals(700 ,courierAgency.costCalculate());
        courierAgency.itemType = 0;
    }
    @Test
    public void ValidCheck2() { // for International doc
        courierAgency.courierType = 1; courierAgency.zipCode = "12345";
        assertEquals(200, courierAgency.costCalculate());

    }

    @Test
    public void ValidCheck3() { // for International parcel
        courierAgency.itemType = 1; // if item is parcel
        courierAgency.zipCode = "12345";
        assertEquals(700 ,courierAgency.costCalculate());
        courierAgency.itemType = 0;
    }

    // Invalid Check
    @Test
    public void invalidDocWt() throws Exception { // Invalid Document weight
        courierAgency.weight = 7000;
        try {
            courierAgency.maximumAllowedWt();
        }
        catch (Exception e) {
            assertSame("Item too heavy", e.getMessage());
        }

    }
    public void invalidDocWt1() throws Exception { // Invalid Document weight
        courierAgency.weight = 0;
        try {
            courierAgency.maximumAllowedWt();
        }
        catch (Exception e) {
            assertSame("Item too light", e.getMessage());
        }
    }

    @Test
    public void invalidParWt() throws Exception { // Invalid Parcel weight
        courierAgency.weight = 7000; courierAgency.itemType = 1;
        try {
            courierAgency.maximumAllowedWt();
        }
        catch (Exception e) {
            assertSame("Item too heavy", e.getMessage());
        }
    }

    @Test
    public void invalidParWt1() throws Exception { // Invalid Parcel weight
        courierAgency.weight = 0; courierAgency.itemType = 1;
        try {
            courierAgency.maximumAllowedWt();
        }
        catch (Exception e) {
            assertSame("Item too light", e.getMessage());
        }
    }

    @Test
    public void invalidZip() {
        courierAgency.zipCode = "12345-67890"; // Neither USA
        assertEquals(false, courierAgency.validZipCode());
    }

    @Test
    public void invalidZip1() {
        courierAgency.zipCode = "12345-67890"; // Neither USA
        assertEquals(false, courierAgency.validZipCode());
        // for correct USA code: 12345
    }

    @Test
    public void validCourierType() {
        courierAgency.zipCode = "764036";
        courierAgency.itemType = 0;
        courierAgency.weight = 100;
        assertEquals(0, courierAgency.getCourierType());
        // check cost
        assertEquals(100,courierAgency.costCalculate());
    }

    @Test
    public void validCourierType1() {
        courierAgency.courierType = 1;
        assertEquals(1, courierAgency.getCourierType());
        // check cost
        assertEquals(200,courierAgency.costCalculate());
    }
}