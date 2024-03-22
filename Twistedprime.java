import java.util.Scanner;
class Twistedprime {
    
     public static boolean isprime(int num)
     { int i;
        for(i=2;i<=(num); i++)
        {
            if(num%i==0)
            {
                  break;
            }
        }
        return i== num;
     }
     public static int reverse(int num)
     {
        int rev=0;
        while(num!=0)
        {
            rev = rev * 10 + (num%10);
            num/=10;

        }
        return rev;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No:");
        int num = sc.nextInt();
        int temp = num;
        if(isprime(num))
        {
            int rev = reverse(num);
            {
                if(isprime(rev))
                {
                    System.out.println("is Twistedprime no");
                }
                else{
                     System.out.println("is Not prime no");
                }
            }

        }

    }

}
