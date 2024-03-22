
import java.util.Scanner;
class Armstrongno {

public static int count(int num)
{
    int ct=0;
    while(num!=0)
    {
        ct++;
        num/=10;

    }
    return ct;
}
public static int power(int rem,int ct)
{
    int pow=1;
    for(int i=ct;i>0;i--)
    {
            pow *= rem;

    }
    return pow;
}
public static boolean isArmstrongno(int num)
{
    int ct = count(num);
    int sum=0;
    for(int i=num; i!=0; i/=10)
    {
        int rem = i%10;
        sum+=power(rem, ct);
    }
    return num==sum;
}
    
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a no:");
    int num = sc.nextInt();
    System.out.println(isArmstrongno(num));
}

}
