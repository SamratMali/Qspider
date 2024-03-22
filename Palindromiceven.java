import java.util.Scanner;
class Palindromiceven
{

    public static int reverse(int num)
    {
        int rev = 0;
        while (num !=0) {
                    rev = rev * 10 + (num%10);
                num/=10;
            
        }
        return rev;
    }
    public static boolean checkpalindrom(int num,int rev)
    {
            return num==rev;
    }
    public static boolean checkeven(int num)
    {
            return num%2==0;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter The No:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ans=reverse(num);
        if(checkpalindrom(num,ans) && checkeven(num))
        {
                System.out.println(" it is a Palindromiceven no");
        }
        else
        {
            System.out.println("Not an Palindromiceven no");
        }



    }
}