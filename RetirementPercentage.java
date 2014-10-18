// This program will calculate the $ amount added to 
// a retirement fund based on the percentage of 5%, 7% or 10%
// taken from a gross salary of $6,000 a month.

public class RetirementPercentage
{
  public static void main(String[] args)
  {
    double MonthlyPay = 6000, FivePercent, SevenPercent, TenPercent;
    
    System.out.println("The below percentages show the amount deducted " +
      " from a gross monthly salary of $" + MonthlyPay + ".");
       
    // 5% deduction
    FivePercent = MonthlyPay * .05;
    System.out.println("A 5% retirement contribution will deduct $" + FivePercent +
     " monthly.");
    
    // 7% deduction
    SevenPercent = MonthlyPay * .07;
    System.out.println("A 7% retirement contribution will deduct $" + SevenPercent +
     " monthly.");                       
    
    // 10% deduction
    TenPercent = MonthlyPay * .10;
    System.out.println("A 10% retirement contribution will deduct $" + TenPercent +
     " monthly.");                       
  }
}
    
   
    
    
