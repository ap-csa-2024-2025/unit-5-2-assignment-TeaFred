public class Coins
{
  public static void main(String[] args)
  {
    coinConverter(1234);
  }

  // write code for coinConverter
  public static void coinConverter(double a)
  {
    double money = (int)(a/(100);
    int dollarBills = (int)(money);
    double coinChange = money - (int)dollarBills; 
    int toInt = (int)(coinChange * 100);
    int quarterNum = toInt%25; 
    int almFinal = toInt - (quarternum*25);
    int dimeNum = almFinal%10; 
    int semiFinal = almFinal - (dimeNum*10);
    int nickelNum = semiFinal%5;
    int theFinal = semiFinal - (nickelNum * 5);
    int pennyNum = theFinal%1;
    System.out.println(dollarBills + " " + quaterNum + " " + dimeNum + " " + nickelNum + " " + pennyNum);
  } 
    

}
