import java.util.Scanner;

public class UniqueNo {


    public static boolean isUniqueno(int num)
    {
        while(num!=0)
        {
            int temp = num;
            int last = temp%10;
            temp/=10;
            while(temp!=0)
            {
                if(last!=temp%10)
                {
                    temp/=10;
                }
                break;
            }
            if(temp!=0)
            {
                break;
            }
            num/=10;
        }
        if (num == 0) {
            System.out.println("Unique number");
            return true;
        }
        else
        {
            System.out.println("number is not unique");
            return false;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("ENTER A NO: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(isUniqueno(num));

    }
    
}
