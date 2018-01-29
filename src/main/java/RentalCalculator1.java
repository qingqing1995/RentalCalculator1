/**
 * junitdemo
 * Created by VoidK on 1/29/2018 at 2:17 PM.
 */
public class RentalCalculator1 {
  public static double carRental(String carModel, int duration, boolean firstTimer, boolean member){

    double rentalFees = 0.0;

    if (firstTimer){
      if (carModel.equals("Honda"))
        rentalFees = 65.0*duration*0.95;
      else
        rentalFees = 80.0*duration*0.95;
    }
    else {
      if (member){

        if (carModel.equals("Honda") && (duration > 3))
          rentalFees = 65.0*duration*0.80;
        else if (carModel.equals("Honda") && (duration <= 3))
          rentalFees = 65.0*duration*0.90;
        else if (carModel.equals("Toyota") && (duration > 3))
          rentalFees = 80.0*duration*0.80;
        else
          rentalFees = 80.0*duration*0.90;


      }
      else { //non-member

        if (carModel.equals("Honda") && (duration > 3))
          rentalFees = 65.0*duration;
        else if (carModel.equals("Honda") && (duration <= 3))
          rentalFees = 65.0*duration;
        else if (carModel.equals("Toyota") && (duration > 3))
          rentalFees = 80.0*duration;
        else
          rentalFees = 80.0*duration;

      }
    }

    return rentalFees;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("TC1 " + RentalCalculator1.carRental("Honda", 1, true, false));
    System.out.println("TC2 " + RentalCalculator1.carRental("Toyota", 1, true, false));
    System.out.println("TC3 " + RentalCalculator1.carRental("Honda", 1, false, true));
    System.out.println("TC4 " + RentalCalculator1.carRental("Toyota", 1, false, true));
    System.out.println( "TC5 " + RentalCalculator1.carRental("Honda", 5, false, false));
    System.out.println("TC6 " + RentalCalculator1.carRental("Toyota", 5, false, false));
    System.out.println("TC7 " + RentalCalculator1.carRental("Honda", 5, false, true));
    System.out.println("TC8 " + RentalCalculator1.carRental("Toyota", 5, false, true));
  }
}
