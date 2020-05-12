import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.util.ArrayList; 
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  
public class PingWebsite 
{  
    // method for finding the ping statics of website 
    static void commands(ArrayList<String> commandList)throws IOException 
    {  
        // creating the sub process, execute system command 
        ProcessBuilder build = new ProcessBuilder(commandList); 
        Process process = build.start(); 
          
        // to read the output 
        BufferedReader input = new BufferedReader(new InputStreamReader 
                                   (process.getInputStream())); 
        BufferedReader Error = new BufferedReader(new InputStreamReader 
                                   (process.getErrorStream())); 
        String s = null; 
          
        System.out.println("Standard output: "); 
        while((s = input.readLine()) != null) 
        { 
            System.out.println(s); 
        } 
        System.out.println("error (if any): "); 
        while((s = Error.readLine()) != null) 
        { 
            System.out.println(s); 
        } 
    } 
      
    // Driver method 
    public static void main()throws IOException 
    {  
        InputStreamReader read=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(read);
	    String ip;
        // creating list for commands 
        ArrayList<String> commandList = new ArrayList<String>(); 
          
        commandList.add("ping"); 
        // can be replaced by IP 
        System.out.println("Enter website");
        ip=br.readLine();
        //commandList.add("www.google.com"); 
         commandList.add(ip);  
        PingWebsite.commands(commandList); 
    } 
}
