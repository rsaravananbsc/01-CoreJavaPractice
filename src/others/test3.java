package others;
class test3
{
public static void main(String args[])
{

int a = 100, b =200;
int temp;
System.out.println(+a);
System.out.println(+b);


a = a+b; // a=300
b = a-b; // b=100
a = a-b; // a=200 

System.out.println(+a);
System.out.println(+b);


}
}