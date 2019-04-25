public class RunForYourLife implements Runnable
{
    private Thread t;
    private String nama;
    private int waktu;

    RunForYourLife(String nama, int waktu)
    {
        this.nama=nama;
        this.waktu=waktu;
        System.out.println( nama + ", Ready");
    }
    public void run()
    {
        System.out.println( nama + ", go!" );
        try
        {
            for (int cp = 1; cp <= 20; cp++)
            {
                System.out.println(nama + " has passed checkpoint("+ cp +")");
                t.sleep(waktu);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(nama + " was interrupted");
        }
        System.out.println("\n" + nama + " has finish \n ");

    }
    public void start()
    {
        System.out.println(nama + ", set .... ");
        if (t == null)
        {
            t = new Thread(this, nama);
            t.start();
        }
    }
}
