import java.util.Random;
public class LetsGo
{
    public LetsGo()
    {

    }
    public int random(int minimal, int maksimal)
    {
        if(minimal>=maksimal)
        {
            throw new IllegalArgumentException("Nilai maksimal harus lebih besar");
        }
        Random acak = new Random();
        return acak.nextInt((maksimal-minimal) + 1 ) + minimal;

    }
    public static void main(String[] args)
    {
        LetsGo start = new LetsGo();
        RunForYourLife lionel = new RunForYourLife ("Lionel", start.random(10,44));
        RunForYourLife Andres = new RunForYourLife ("Andres", start.random(44,77));
        RunForYourLife Messi = new RunForYourLife("Messi", start.random(77,100));

        System.out.println("\nStart \n");
        lionel.start();
        Andres.start();
        Messi.start();
    }


}
