import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import org.junit.Test;

/**
 * junitdemo
 * Created by VoidK on 1/29/2018 at 2:29 PM.
 */
public class RentalAnalysisTest {

  private RentalAnalysis ra = new RentalAnalysis();
  private ArrayList<RentalRecord> rList = ra.createRecords();
  private DecimalFormat df = new DecimalFormat("#.0");
  public RentalAnalysisTest() {
  }

  @Test
  public void testAveMonthlyRentalDurationHonda() {
    assertEquals("Ave Monthly Rental Dur for Honda", Math.floor(ra.aveMonthlyRentalDur("Honda Fit", rList)), 28.0, 0.0);
  }

  @Test
  public void testtotalRevHonda() {
    assertEquals("Total rev for Honda", ra.totalRev("Honda Fit", rList), 10497.5, 0.0);
  }

  @Test
  public void testAveMonthlyRentalDurationToyota() {
    assertEquals("Ave Monthly Rental Dur for Honda", Math.floor(ra.aveMonthlyRentalDur("Toyota Wish", rList)), 26.0, 0.0);
  }

  @Test
  public void testtotalRevToyota() {
    assertEquals("Total rev for Toyota Wish", ra.totalRev("Toyota Wish", rList), 12160, 0.0);
  }


}