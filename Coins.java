public class Coins
{
  public static void main(String[] args)
  {
    coinConverter(1234);
  }
  public static void coinConverter(int a)
  {
    int dollarBills = (a/100);
    int coinChange = a - (dollarBills*100); 
    int quarterNum = coinChange/25; 
    int almFinal = coinChange - (quarterNum*25);
    int dimeNum = almFinal/10; 
    int semiFinal = almFinal - (dimeNum*10);
    int nickelNum = semiFinal/5;
    int theFinal = semiFinal - (nickelNum * 5);
    int pennyNum = theFinal/1;
    System.out.println(dollarBills + " " + quarterNum + " " + dimeNum + " " + nickelNum + " " + pennyNum);
  } 
}
