import java.util.*;
class GCD
{
    public static void amin (String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two different numbers");
        int n,n1,n2,t=0;
        n1=sc.nextInt();
        n2=sc.nextInt();
        while(n1%n2!=0)
        {
            t=n1%n2;
            n1=n2;
            n2=t;
        }
        System.out.println("GCD of two numbers="+n2);
    }
}
        
        
        

    
    

