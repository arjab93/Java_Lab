//Client Program
import java.io.*;
import java.net.*;
class ClientAr
{
    public static void main(String args[]) throws IOException
    {
        Socket s = new Socket ("localhost" ,1064);
        String str;
        System.out.println("Enter Radius  :");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        PrintStream ps=new PrintStream(s.getOutputStream());
        ps.println(str);
        BufferedReader fs=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String result = fs.readLine();
        System.out.println("Area of the circle is : "+ result);
        br.close();
        fs.close();
        ps.close();
        s.close();
    }
}