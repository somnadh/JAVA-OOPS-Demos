import java.util.*;
class BankAccount1
{
	public static void main(String args[])
	{
	String accno=null;
	String name=null;
	String email=null;
	String s2=null;
    long balance=0;
	String ph_no=null;
	Scanner sc=new Scanner(System.in);
	int ch;
	boolean quit = false;
	
		do
		{
			System.out.println("\t\t---------WELCOME TO OUR CUSTMERS--------");
			System.out.println(" ");
			System.out.println("\t\t\tSOMNADH CO-ORPARATIVE BANK LIMITED\n\n");
			System.out.print("\t\t1.CreateAccount");
			System.out.println("\t\t2.DisplaySetails\n\n");
			System.out.print("\t\t3.Deposit");
			System.out.println("\t\t4.Withdrawal\n\n");
			System.out.print("\t\t\t\t5.Exit\n\n");
                        System.out.println("\t\t\t  SELECT YOUR SERVICE");
			ch=sc.nextInt();
			switch(ch)
			{ 
			case 1: 
				System.out.print("\tEnter User Name: ");
				name=sc.next();
				System.out.print("\tEnter Account No: ");
				accno=sc.next();
				System.out.print("\tEnter Contact No: ");
				ph_no=sc.next();	
				System.out.print("\tEnter Email: ");
				email=sc.next();
				System.out.print("\tEnter Opening Balance: ");
				balance=sc.nextLong();
				System.out.println("\tEnter password  ");
				s2=sc.next();
				if(balance>=10000)
					{
						System.out.println("\t\t\t\t$$$You have Succssfully Created Account$$$");
					}
				else
					{
						System.out.println("\t\t\t\t****MINIMUM BALANCE 10000*****");
					}		
					break;
					
					
		case 2:
			System.out.println("Enter ur Account number");
			String temp=sc.next();
			if(temp.equals(accno))
				{
					
					System.out.println("\t\t==>Account Holder's Name :"+name);
					System.out.println("\t\t==>Account No            :"+accno);
					System.out.println("\t\t==>"+name+" CONTACT NO   :"+ph_no);
					System.out.println("\t\t==>"+name+"E-MAIL        :"+email);
					System.out.println("\t\t==>"+name+" Balance      :"+balance);
				}
			else
				{
					System.out.println("\t\t\t\t WRONG ACCOUNT NO");
				}
					break;
					
					
		case 3:
				System.out.println("Enter ur Account number");
			        String temp2=sc.next();
	         		if(temp2.equals(accno))
				{
					long amt=0;
				        System.out.println("\tEnter Amount U Want to Deposit : ");
				        amt=sc.nextLong();
				        balance=balance+amt;
				        System.out.println("\t\t***You have deposited Succssfully***");
	           			System.out.println("\t\t\t==>your current Balance is ="+balance);
					
				}
			else
				{
					System.out.println("\t\t\t\tWRONG ACCOUT NUMBER");
				}

			break;

				
		case 4:
			System.out.println("Enter ur Account number");
			String temp1=sc.next();
			if(temp1.equals(accno))
				{
					System.out.println("Enter your password ");
					String s1=sc.next();
					if(s1.equals(s2))
					{
					long a=0;
				        System.out.println("\tEnter Amount U Want to withdraw : ");
		         		a=sc.nextLong();
		         		if((balance>=a)&&(10000<balance))
					{ 
						balance=balance-a;
						System.out.println("\t\t***Transaction completed succefully***");
						System.out.println("\t\t==>Your current Balance="+balance);
					}
				else
					{
					System.out.println("\t\t Sorry Transaction Failed--Less Balance");
					}
					}
					else
					{
						System.out.println("\t\t\t\tWRONG PASSWORD \n \t\t\t\t TRY AGAIN");
					}
				}
			else
			{
				System.out.println("\t\t\t\tWRONG ACCOUT NUMBER");
				
			}
           				break;
		
		case 5:
			System.out.println("\t\t\t\t\t\tTHANK--YOU\n\n");
			System.out.println("\t\t\t\t\t---------WE ARE WITH YOU----------");
			System.out.println("\t\t\t\t\t-Please Give Your's feedback to somunadhm26@gmail.com ");
			System.out.println("\t\t\t\t\t-Please Give A Missed call to get ur Details");
			quit=true;
				break;
		default:
				System.out.println("wrong Input");
			break;
			}
		}while(!quit);
	}
}