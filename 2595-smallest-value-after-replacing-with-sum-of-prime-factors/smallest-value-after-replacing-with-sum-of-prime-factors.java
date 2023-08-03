class Solution {
    public int smallestValue(int n) {
        int k=n;
        if(n<=4)
            return n;
		while(true)
        {
            int sum=0;
            for (int i=2;i<=n/2;i++)
    {
                if(prime(i))
                {
                    while(n%i==0)
                    {
                        sum+=i;
                        n/=i;
                    }
                }
		    }
            if(n==1)
            {
                sum-=1;
            }
		    sum+=n;
		    if(n==sum)
		    {
                k=sum;
                break;
		    }
		    else
		    {
                n=sum;
                k=sum;
		    }
        }
		return k;
    }
    public boolean prime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}