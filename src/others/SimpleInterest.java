package others;
public class SimpleInterest 
{
 public static void main(String[] args) 
 {
  double i, p=3000, t=5;
  double r=9, ri=0.0;
  ri = r/100;
  i = p * ri * t ;
  System.out.println("Simple Interest for " +p+ " with " +r+ " interest for " +t+ " years: " +i);
 }
}
