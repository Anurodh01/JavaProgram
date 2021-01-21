import java.util.*;
import java.io.*;
public class copyfile
{
    public static void main(String args[]) throws IOException
    {
        String str1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file to copy:");
        str1=sc.nextLine();
        System.out.println("Enter the file name to which we have to copy");
        String str2=sc.nextLine();
        FileWriter file2=new FileWriter(str2);
        FileReader file1=new FileReader(str1);
        int ch,i=0;
        char array[]=new char[1000];
        while((ch=file1.read())!=-1)
        {
            array[i]=(char)ch;
            i++;
        }
        String str=new String(array);
        file2.write(str);
        System.out.println("File copied to another File Sucessfully");
        file1.close();
        file2.close();
    }

} 