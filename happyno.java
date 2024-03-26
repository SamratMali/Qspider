public class happyno {
    public static boolean isHappyno(int num)
    {
        while (true) {
            num = SumSqDigit(num);
            if(num == 4 || num == 1)
            {
                break;
            }

            
        }
        return num == 1;
    }
    public static int SumSqDigit(int num)
    {
        int sum=0;
        while(num!=0)
        {
            int rem = num%10;
            sum+=(rem*rem);
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int start=1;
        int end=1000000000;
        while(start<=end)
        {
            if(isHappyno(start))
            {
                System.out.println(start);
                start++;
            }

        }
    }
}
