import java.util.*;
import java.io.*;
public class CaseConverter
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String str1;
        int choice;
        System.out.println("Enter the File name for case Conversion:-");
        str1=sc.nextLine();
        System.out.println("Enter 1.To Convert the File in Uppercase");
        System.out.println("Enter 2.To convert the File in Lowercase\n");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1:
            int ch,i=0;
            System.out.println("Enter the File name for Uppercase content");
            String f=sc.nextLine();
            FileWriter file1=new FileWriter(f);
            char array[]=new char[100];
            FileReader file2=new FileReader(str1);
            while((ch=file2.read())!=-1)
            {
                array[i]=(char)ch;
                i++;
            }
            String str=new String(array);
            String strU=str.toUpperCase();
            file1.write(strU);
            System.out.println("File Converted to Uppercase Sucessfully.");
            file1.close();
            file2.close();
            break;
        case 2:
        int c,j=0;
            System.out.println("Enter the File name for Lowercase content");
            String s=sc.nextLine();
            FileWriter file3=new FileWriter("Labcopy.txt");
            char array1[]=new char[100];
            FileReader file4=new FileReader("Lab.txt");
            while((c=file4.read())!=-1)
            {
                array1[j]=(char)c;
                j++;
            }
            String st=new String(array1);
            String strL=st.toLowerCase();
            file3.write(strL);
            System.out.println("File content Converted to LowerCase Sucessfully.");
            file3.close();
            file4.close();
        break;
        default:
        System.out.println("Invalid Option!!");
        }
    }
}