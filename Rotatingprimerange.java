public class Rotatingprimerange {

    public static boolean isPrime(int num)
    {   int i;
        for( i=2;i<=num;i++)
        {
            break;
        }
        return i==num;
    }
    public static int rotateno(int num)
    {
        return (num%10)*power(10,Count(num)-1)+num/10;
    }
    public static int Count(int num)
    {   int ct=0;
        while ((num!=0))
        {
            ct++;
            num/=10;
        } 
        return ct;
    }
    public static int power(int rem , int ct)
    {
            int pow=1;
            for(int i=ct;i>0;i--)
            {
                    pow*= rem;

            }
            return pow;
    }

    public static void rotatingprime(int num)
    {
        int temp = num;
        if(isPrime(num))
        {
           num = rotateno(num);
            while (temp!=num) {
                if(!isPrime(num))
                {
                    break;
                }
                
                
            }
            if (temp==num) {

                System.out.println(num);
                
            }

        }

    } 
    public static void main(String[] args)
    {
        int start=1;
        int end=200;

        while (start<=end) {

            rotatingprime(start);

            start++;
            
        }

    }
    
}
