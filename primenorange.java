class primenorange {
    
    public static void main(String[] args)
    {
        int start = 100;
        int end = 200;

        while(start<=end)
        {
            if(isPrime(start))
            {
                System.out.println(start);
            }
            start++;

        }
    }
    public static boolean isPrime(int num)
    {
        int i;
        for(i=2;i<=(num);i++)
        {
            if(num%i==0)
            {
                break;
            }   
        }
        return i==num;
    }   
}
