import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * junitdemo
 * Created by VoidK on 1/22/2018 at 7:00 PM.
 */
class TestRentalCalculator {

  @org.junit.jupiter.api.Test
  void carRental() {
  }

  @org.junit.jupiter.api.Test
  void main() {
  }

  @Test
  //TC1 : First timer, Honda Fit, 1 Day, expect $61.75
  public void testTC1() {
    assertEquals(RentalCalculator.carRental("Honda Fit", 1, true), 61.75, 0.00, "TC1 failed");
  }

  @Test
  //TC2 : First timer, Toyota Wish, 1 Day, expect $76.00
  public void testTC2() {
    assertEquals(RentalCalculator.carRental("Toyota Wish", 1, true), 76.00, 0.00, "TC2 failed");
  }

  @Test
  //TC3 : Not First timer, HondaFit, 5 Days, expect $292.50
  public void testTC3() {
    assertEquals(RentalCalculator.carRental("Honda Fit", 5, false), 292.50, 0.00, "TC3 failed");
  }

  @Test
  //TC4 : Not First timer, Toyota Wish, 5 Days, expect $360.00
  public void testTC4() {
    assertEquals(RentalCalculator.carRental("Toyota Wish", 5, false), 360.00, 0.00, "TC4 failed");
  }

  @Test
  //TC5 : Not First timer, HondaFit, 3 Days, expect $195.00
  public void testTC5() {
    assertEquals(RentalCalculator.carRental("Honda Fit", 3, false), 195.00, 0.00, "TC5 failed");
  }

  @Test
  //TC6 : First timer, Toyota Wish, 3 Days, expect $240.00
  public void testTC6() {
    assertEquals(RentalCalculator.carRental("Toyota Wish", 3, false), 240.00, 0.00, "TC6 failed");
  }
}