import java.util.ArrayList;

/**
 * junitdemo
 * Created by VoidK on 1/29/2018 at 2:26 PM.
 */
public class RentalAnalysis {

  public static ArrayList<RentalRecord> createRecords(){

    ArrayList<RentalRecord> rList= new ArrayList<RentalRecord>();

    //for Honda Fit records
    RentalRecord rh1 = new RentalRecord("Honda Fit","Jul", 1543.75, 25);
    rList.add(rh1);

    RentalRecord rh2 = new RentalRecord("Honda Fit", "Aug", 1235.00, 20);
    rList.add(rh2);

    RentalRecord rh3 = new RentalRecord("Honda Fit", "Sep", 1235.00, 20);
    rList.add(rh3);

    RentalRecord rh4 = new RentalRecord("Honda Fit", "Oct", 1543.75, 25);
    rList.add(rh4);

    RentalRecord rh5 = new RentalRecord("Honda Fit", "Nov", 1852.50, 30);
    rList.add(rh5);

    RentalRecord rh6 = new RentalRecord("Honda Fit", "Dec", 3087.50, 50);
    rList.add(rh6);

    //for Toyota Wish records
    RentalRecord rt1 = new RentalRecord("Toyota Wish","Jul", 1140.00, 15);
    rList.add(rt1);

    RentalRecord rt2 = new RentalRecord("Toyota Wish","Aug", 1140.00, 15);
    rList.add(rt2);

    RentalRecord rt3 = new RentalRecord("Toyota Wish","Sep", 1140.00, 15);
    rList.add(rt3);

    RentalRecord rt4 = new RentalRecord("Toyota Wish","Oct", 2280.00, 30);
    rList.add(rt4);

    RentalRecord rt5 = new RentalRecord("Toyota Wish","Nov", 2660.00, 35);
    rList.add(rt5);

    RentalRecord rt6 = new RentalRecord("Toyota Wish","Dec", 3800.00, 50);
    rList.add(rt6);

    return rList;

  }

  //complete this method
  public static double aveMonthlyRentalDur(String carModel, ArrayList<RentalRecord> rlist) {
    int totalRental = 0;
    double avgRental = 0;
    if(carModel == "Honda Fit")
    {
      for (int i = (rlist.size()-6); i < rlist.size(); i++) {
        totalRental += rlist.get(i-6).getDuration();
      }
    }
    else if(carModel == "Toyota Wish")
    {
      for (int i = (rlist.size()-6); i < rlist.size(); i++) {
        totalRental += rlist.get(i).getDuration();
      }
    }

    avgRental = (double)totalRental/6;
    return avgRental;

  }

  //complete this method
  public static double totalRev(String carModel, ArrayList<RentalRecord> rlist) {
    double totalRev = 0;
    if(carModel == "Honda Fit")
    {
      for(int i = (rlist.size()-6); i < rlist.size();i++ ) {
        totalRev += rlist.get(i-6).getRevenue();
      }
    }
    else if(carModel == "Toyota Wish")
    {
      for(int i = (rlist.size()-6); i < rlist.size();i++ ) {
        totalRev += rlist.get(i).getRevenue();
      }
    }
    return totalRev;

  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("TC1 " + aveMonthlyRentalDur("Honda Fit", createRecords()));
    System.out.println("TC1 " + totalRev("Honda Fit",createRecords()));
    System.out.println("TC2 " + aveMonthlyRentalDur("Toyota Wish", createRecords()));
    System.out.println("TC2 " + totalRev("Toyota Wish",createRecords()));
  }
}
