public class complexity {

    public static boolean isPrime(int n){
        if (n==1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for (int i=5;i*i<=n;i=i+6)
        if(n%i==0 || n%(i+2)==0)
        return false;
    return true;
    }
    
    public static void main(String[] args) {
        int a,b,c,d,e;
        a=20;
        b=11;
        c=9;
        d=41;
        e=0;

        System.out.println(isPrime(a));
        System.out.println(isPrime(b));
        System.out.println(isPrime(c));
        System.out.println(isPrime(d));
        System.out.println(isPrime(e));
    }
}
