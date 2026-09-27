import java.io.*;

public class Throws
{
   static void readFile() throws IOException
   {
    FileReader file = new FileReader("Aditya_notes.txt");
    BufferedReader br = new BufferedReader(file);
    System.out.println(br.readLine());
   }
    
    public static void main(String[] args)
    {
        try
        {
            readFile();
        }
        catch(IOException e)
        {
            System.out.println("Caller handled file error for Aditya: " + e.getMessage());
        }
    }
}