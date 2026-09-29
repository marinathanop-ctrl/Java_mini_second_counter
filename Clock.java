import java.time.LocalTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.io.IOException;

public class Clock
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");

        while (true) 
        { 
            if (System.in.available() > 0)
            {
                scan.nextLine();
                break;
            }

            LocalTime now = LocalTime.now();
            System.out.println(now.format(fmt));

            try 
            {
                Thread.sleep(1000);
            }

            catch (InterruptedException e) {}
        }

        System.out.println("The clock has stopped!");
    }
}