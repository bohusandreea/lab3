public class RezolvareLab3 {

    public void ElementeComune2Siruri(String[] arr1, String[] arr2)
    {
        System.out.print("Elemnetele comune din 2 siruri : ");
        for(int i=0;i < arr1.length;i++)
        {
            for(int j=0;j < arr2.length;j++)
            {
                if(arr1[i].equals(arr2[j]))
                    System.out.println(arr1[i]);
            }
        }

    }

    public void NrPrime(int[] arr)
    {   System.out.print("Nr prime din sir : ");
        boolean prime;
        for(int i=0;i<arr.length;i++)
        {       prime=true;
            for(int j=2;j<=arr[i]/2;j++)
            {
                if(arr[i]%j==0)
                    prime=false;
            }
            if(prime)
                System.out.println(arr[i]);
        }
    }

    public void SirFibonacci(int n)
    {   System.out.print("Sirul lui Fibbonaci : ");
        int a=1;
        int b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=3;i<n;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }

    public void Palindrom(String arr)
    {
        String reverse="";
        String lowerCase = arr.toLowerCase();
        for(int i=lowerCase.length()-1;i>=0;i--)
            reverse=reverse+ lowerCase.charAt(i);
        if(lowerCase.equals(reverse))
            System.out.println("Cuvantul este palindrom.");


    }



}
