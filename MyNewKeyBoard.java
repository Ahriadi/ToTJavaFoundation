public class MyNewKeyBoard{	public static void main(String [] d)	{		java.util.Scanner pembaca=new java.util.Scanner(System.in);				System.out.print("Masukkan Nama Anda   :");		String nama=pembaca.nextLine();				System.out.print("Masukkan Alamat Anda   :");		String alamat=pembaca.nextLine();				System.out.print("Masukkan Umur Anda   :");		String umur=pembaca.nextLine();				System.out.println("===================Data Anda===================");		System.out.println("Nama		:" +nama);		System.out.println("Alamat		:" +alamat);		System.out.println("Umur		:" +umur);					}}