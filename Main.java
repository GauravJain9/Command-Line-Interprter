import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    static public void main(String[] args)throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        String[] commands= new String[100];
        int j,i;
        System.out.println("######################");
        show s1=new show();
                s1.main();
         System.out.println("######################");
        for(i=0;i<100;i++)
        {
            System.out.print("cmd:");
            commands[i]=br.readLine();
            
            switch(commands[i])
            {
                case "ping":
                PingWebsite  p=new PingWebsite();
                p.main();
                break;
                case "memory":
                TestMemory t=new TestMemory();
                t.main();
                break;
                case "zip":
                ZipFolderWhole zipf=new ZipFolderWhole();
                zipf.main();
                break;
                case "unzip":
                Unzip z=new Unzip();
                z.main();
                break;
                case "semaphore":
                EvenOddSem sem=new EvenOddSem();
                sem.main();
                break;
                case "read":
                ReadFile re= new ReadFile();
                re.main();
                break;
                case "disp":
                Display_directories dis=new Display_directories();
                dis.main();
                break;
                
                case "show":
                show s=new show();
                s.main();
                break;
                case "disk":
                DiskSpaceDetail disk= new DiskSpaceDetail();
                disk.main();
                break;
                case "clear":
                clear cle=new clear();
                cle.main();
                
                
                default:
                System.out.println("Invalid Command");
                System.exit(0);
                break;
            }
          
    }
    for(j=0;j<200;j++)
            {
                    System.out.println("\b");
            }
        }
}
