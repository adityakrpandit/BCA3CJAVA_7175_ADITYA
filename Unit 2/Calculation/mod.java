package modulation;

public class mod {
    
    int mod;
    public void calmod(int a, int b)
    {
        mod = a % b ;
    }
    public void dispmod()
    {
        System.out.println("Moduleation :" + mod);
    }

}