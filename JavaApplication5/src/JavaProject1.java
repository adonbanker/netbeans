import java.util.*;

public class JavaProject1
{

public static void main(String args[])
{


   	
      	System.out.println("Welcome to Bank Management System");
      	CustomerNew c=new CustomerNew();
	Student1 s1=new Student1();


	int choice;
	
	do
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\n1. TO ADD DATA ABOUT REGULAR CUSTOMER\n2. TO VIEW DATA ABOUT REGULAR CUSTOMER");
		System.out.println("3. TO ADD DATA ABOUT STUDENT ACCOUNT");
		System.out.println("4. TO VIEW DATA ABOUT STUDENT ACCOUNT");
		System.out.println("5. TO DEBIT MONEY FROM REGULAR ACCOUNT\n6. TO CREDIT MOENY FROM REGULAR ACCOUNT");
		System.out.println("7. TO DEBIT MONEY FROM STUDENT ACCOUNT\n8. TO CREDIT MOENY FROM STUDENT ACCOUNT");
		System.out.println("9. TO CHECK BALANCE OF REGULAR CUSTOMER\n10.TO CHECK BALANCE OF STUDENT ACCOUNT");
		System.out.println("11. TO CHECK TIMING OF BANK");
		System.out.println("12. TO EXIT FROM BANK SYSTEM ");
		System.out.println("\nEnter Your Choice ");
		choice=s.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("TO ADD DATA ABOUT REGULAR CUSTOMER FILL INFORMATION");
				c.Addcust();
				System.out.println("DATA UPLOADED SUCCESFULLY");
				
			break;

			case 2:
				System.out.println("TO VIEW DATA ABOUT CUSTOMER FOLLOWING INFORMATION IS RELATED");
				c.Showregularinfo();		
			break;
			
			case 3:
				System.out.println("TO ADD DATA ABOUT STUDENT ACCOUNT FILL INFORMATION");
				s1.studentinfo();
			break;

			case 4:
				System.out.println("TO VIEW DATA ABOUT STUDENT CUSTOMER");
				s1.Showstudentinfo();
			break;

			case 5:
				System.out.println("TO DEBIT MONEY FROM REGULAR ACCOUNT");
				c.depo();
			break;

			case 6:
				System.out.println("TO CREDIT MOENY FROM REGULAR ACCOUNT");
				c.credit();
			break;

			case 7:
				System.out.println("TO DEBIT MONEY FROM STUDENT ACCOUNT");
				s1.debit();
			break;

			case 8:
				System.out.println("TO CREDIT MOENY FROM STUDENT ACCOUNT");
				s1.deposit();
			break;

			case 9:
				System.out.println("TO CHECK BALANCE OF REGULAR CUSTOMER");
				c.checkbal();
			break;

			case 10:
				System.out.println("TO CHECK BALANCE OF STUDENT ACCOUNT");
				s1.checkbalstud();
			break;

			case 11:
				System.out.println("TO CHECK TIMING OF BANK");
				s1.time();
			break;

			case 12:
				System.out.println("THANKS FOR USING BANK SYSTEM POWERED BY SHAHID JAMADAR AND TEAM");
				System.exit(0);
			break;

			default:
				System.out.println("PLEASE ENTER VALID CHOICE !!!!!!");

		}
	}while(choice!=12);

      }
}

class CustomerNew
{

    
      int rbalance,rage,rdeposit,cpin;
      int raccountno;
      String rname;
      String racconotype;
      String rcnt;
      int add,sub;
     
      Scanner cust= new Scanner(System.in);

     
	void Addcust()
	{
		
		
		System.out.println("\nEnter Account Number ");
		raccountno=cust.nextInt();
		
		System.out.println("\nEnter Customer Name " );
		rname=cust.next();
		
			System.out.println("\nEnter Type of Account  " );
			racconotype=cust.next();
			if(racconotype == "S")
		   	   {
				 System.out.println("Enter Deposit Ammount More than or At least 1000 ");
				 rdeposit=cust.nextInt();
				 rbalance=rdeposit;
			   }
			else
			  {
				 System.out.println("Enter Deposit Ammount More than or At least 500 ");
				rdeposit=cust.nextInt();
				 rbalance=rdeposit;
			  }

		System.out.println("\nEnter Account holder  Age " );
		rage=cust.nextInt();
		
		System.out.println("\nEnter Contact Number of Account Holder " );
		rcnt=cust.next();

	}
		
	

    	
    	
     	void Showregularinfo()
		{
			
	    		System.out.println("\nEnter Account Number ");
				raccountno=cust.nextInt();
				
				if(raccountno==1137 || raccountno== 9696 || raccountno== 7066  || raccountno== 8862)
				{
					System.out.println(" Account no. Of Account Holder " +raccountno);

					System.out.println(" Name Of Account Holder " +rname);

					System.out.println(" Current Balance in Account " +rbalance);

					System.out.println(" Age Of Account Holder " +rage);

					System.out.println(" Contact no. Of Account Holder " +rcnt);

					
				}
				
				else
				{
					System.out.println("Enter Valid Account Number !!!! ");
				}
			
	    
		}

		void depo()
		{
			System.out.println("\nEnter 4 digit Password");
			cpin=cust.nextInt(); 
	
				if(cpin==1137 || cpin == 9696 || cpin == 7066 || cpin == 8862)
				{
					System.out.println("Enter Amount to Withdraw ");
					sub=cust.nextInt();
					rbalance=rbalance-sub;

					System.out.println("Amount Withdrawed " +sub);
					System.out.println("Thanks for using ATM \n Please Come Again");
				}
				else
				{
					System.out.println("Enter Valid Password Or check Password");
				}
		}

		void credit()
		{
			System.out.println("\nEnter 4 digit Password");
			cpin=cust.nextInt(); 
	
				if(cpin==1137 || cpin == 9696 || cpin == 7066 || cpin == 8862)
				{
					System.out.println("Enter Amount to Deposit ");
					add=cust.nextInt();
					rbalance=rbalance+add;

					System.out.println("Amount Deposit" +add);
					System.out.println("Thanks for using ATM \n Please Come Again");
				}
				else
				{
					System.out.println("Enter Valid Password Or check Password");
				}
		}


		void checkbal()
		{
			System.out.println("\nEnter 4 digit Password");
			cpin=cust.nextInt(); 
	
				if(cpin==1137 || cpin == 9696 || cpin == 7066 || cpin == 8862)
				{
					System.out.println("Current Balance in Your Account is Rs. " +rbalance);
					System.out.println("Thanks for using ATM \n Please Come Again");
				}
				else
				{
					System.out.println("Enter Valid Password Or check Password");
				}
		}



        
    	
}     

class Student1
{

      int sbalance,sage,sdeposit,sgurdianage,spin;
      String sname;
      int saccountno,subs,adds;
      String scnt,saccnotype;

	Scanner stud=new Scanner(System.in);
      

    	void studentinfo()
    	{
			System.out.println("\nEnter Account Number ");
			saccountno=stud.nextInt();    		
			

			System.out.println("\nEnter Customer Name " );
			sname=stud.next();
		
			System.out.println("\nEnter Type of Account  " );
			saccnotype=stud.next();
			if(saccnotype=="S")
		   	   {
				 System.out.println("Enter Deposit Ammount More than or At least 1000 ");
				 sdeposit=stud.nextInt();
				 sbalance=sdeposit;
			   }
			else
			  {
				 System.out.println("Enter Deposit Ammount More than or At least 500 ");
				 sdeposit=stud.nextInt();
				 sbalance=sdeposit;
			  }
			System.out.println("\nEnter Contact Number of Account Holder " );
			scnt=stud.next();

			System.out.println(" Enter Age Of Account Holder " );
			sage=stud.nextInt();

    	}

	void Showstudentinfo()
	{
		
    		System.out.println("\nEnter Account Number ");
			saccountno=stud.nextInt();
			
			if(saccountno== 1212 || saccountno== 1313 || saccountno== 1414  || saccountno== 1515)
			{
				System.out.println(" Account no. Of Account Holder " +saccountno);

				System.out.println(" Name Of Account Holder " +sname);

				System.out.println(" Type of Account " +saccnotype);

				System.out.println(" Current Balance in Account " +sbalance);

				System.out.println(" Age Of Account Holder " +sage);

				System.out.println(" Contact no. Of Account Holder " +scnt);
				

			}
			
			else
			{
				
				System.out.println("Enter Valid Account Number !!!! ");
			}
		
    
	}



		void debit()
		{
			System.out.println("\nEnter 4 digit Password");
			spin=stud.nextInt(); 
	
				if(spin==1212 || spin == 1313 || spin == 1414 || spin == 1515)
				{
					System.out.println("Enter Amount to Withdraw ");
					subs=stud.nextInt();
					sbalance=sbalance-subs;

					System.out.println("Amount Withdrawed " +subs);
					System.out.println("Thanks for using ATM \n Please Come Again");
				}
				else
				{
					System.out.println("Enter Valid Password Or check Password");
				}
		}

		void deposit()
		{
			System.out.println("\nEnter 4 digit Password");
			spin=stud.nextInt(); 
	
				if(spin==1212 || spin == 1313 || spin == 1414 || spin == 1515)
				{
					System.out.println("Enter Amount to Deposit ");
					adds=stud.nextInt();
					sbalance=sbalance+adds;

					System.out.println("Amount Deposit" +adds);
					System.out.println("Thanks for using ATM \n Please Come Again");
				}
				else
				{
					System.out.println("Enter Valid Password Or check Password");
				}
		}


		void checkbalstud()
		{
			System.out.println("\nEnter 4 digit Password");
			spin=stud.nextInt(); 
	
				if(spin==1212 || spin == 1313 || spin == 1414 || spin == 1515)
				{
					System.out.println("Current Balance in Your Account is Rs. " +sbalance);
					System.out.println("Thanks for using ATM \n Please Come Again");
				}
				else
				{
					System.out.println("Enter Valid Password Or check Password");
				}
		}


		void time()
		{

				System.out.println("MONDAY TO FRIDAY : MORNING 10:00 A.M. TO 2:00 ");
				System.out.println(" AND AFTERNOON 2:30 P.M. TO 5:00 P.M. ");

				System.out.println("1st AND  4th SATURDAY HALF DAY ");

				System.out.println("SUNDAY HOLIDAY");

				

		}


}