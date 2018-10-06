import java.io.*;
class dynamic2
{
	public static void main(String[] args)
	{
		File f1=new File("C:/Users/DELL/Documents/Dynamic2-java/abc.txt");
		File f2=new File("C:/Users/DELL/Documents/Dynamic2-java/xyz.txt");
		if(f1.exists()&&f2.exists())
		{
			try
			{
				FileInputStream fin =new FileInputStream(f1);
				FileOutputStream fout=new FileOutputStream(f2);
				int i;
				System.out.println("\nCopying data from \"abc.txt\" to \"xyz.txt\":-");
				i=fin.read();
				while(i!=-1)
				{
					fout.write((char)i);
					i=fin.read();
				}
				fout.close();
				fin.close();
				System.out.println("\nDone. ");
				System.out.println("\nThe contents of \"xyz.txt\" are:-");
				fin=new FileInputStream(f2);
				i=fin.read();
				while(i!=-1)
				{
					System.out.print((char)i);
					i=fin.read();
				}
				System.out.println("\n");
				fin.close();
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		else if(f1.exists() && !f2.exists())
		{
			System.out.println("xyz.txt does not exist");
		}
		else if(!f1.exists() && f2.exists())
		{
			System.out.println("abc.txt does not exist");
		}
		else
		{
			System.out.println("Neither abc.txt nor xyz.txt exist");
		}
	}
}