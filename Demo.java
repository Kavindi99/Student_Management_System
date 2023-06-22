import java.util.*;
class Demo{
	static Scanner scan = new Scanner(System.in);
	static int marks[][] = new int[0][2];                         //to store PRF & DBMS marks
	static String StudentID[][]=new String[0][2];                 //to store StudentID & StudentName
	
	
	public static void main(String[]args){
		while(true){
		System.out.println("------------------------------------------------------------------------------------\n|                      WELCOME TO GDSE MARKS MANAGEMENT SYSTEM                     |\n------------------------------------------------------------------------------------\n");
			
		System.out.println("[1] Add New Student                        [2] Add New Student With Marks\n[3] Add Marks                              [4] Update Student Details\n[5] Update Marks                           [6] Delete Student\n[7] Print Student Details                  [8] Print Student Ranks\n[9] Best in Programming Fundamentals       [10] Best in Database Management System\n");
			
		System.out.print("\nEnter your option to continue > ");
		int op= scan.nextInt();
		
		clearConsole();                                          //to clear console
		
		switch(op){
			case 1: 
				addNewStudent();
				break;
			case 2: 
				addNewStudentWithMarks();
				break;
			case 3: 
				addMarks();
				break;
			case 4: 
				updateStudentDetails();
				break;
			case 5: 
				updateStudentMarks();
				break;
			case 6: 
				deleteStudent();
				break;
			case 7:
				printStudentDetails();
				break;
			case 8:
				printStudentRanks();
				break;
			case 9:
				bestInPRF();
				break;
			case 10:
				bestInDMBS();
				break;   
			
				}
			}
		}
	public static void addNewStudent(){                  // to add marks (1)
		
		char Option = 'y';
		while(Option=='y'){
			System.out.println("------------------------------------------------------------------------------------\n|                                ADD NEW STUDENT                                   |\n------------------------------------------------------------------------------------\n");
			
			arraysIncrement();
			
			while(true){
				System.out.print("\nEnter Student ID : ");
				StudentID[StudentID.length-1][0]= scan.next();
				
				int count =0;
				for(int i=0; i<StudentID.length-1; i++){
					if(StudentID[StudentID.length-1][0].equals (StudentID[i][0])){
						count++;
					}
				}
				
				if(count==0){
					break;
				}
				else{
					System.out.println("The Student ID already exist");
				}
			}
			
			System.out.print("Enter Student Name: ");
			StudentID[StudentID.length-1][1] = scan.next();
			System.out.println();
			
			System.out.print("Student has been added successfully.");
			
			while(true){
				System.out.print("Do you want to add a new student(y/n): ");
				Option = scan.next().charAt(0);
				
				if(Option=='y' || Option=='n'){
					break;
				}
				else{
					System.out.print("Invalid Option.Try Again");
				}
			}
			
			clearConsole();
		}
	}
	
	public static void addNewStudentWithMarks(){         //to add new student with marks (2)
		
		char Option = 'y';
		while (Option == 'y'){
			System.out.println("------------------------------------------------------------------------------------\n|                              ADD NEW STUDENT WITH MARKS                          |\n------------------------------------------------------------------------------------\n");
			
			arraysIncrement();
		   
		while(true){
			System.out.print("\nEnter Student ID :");
			StudentID[StudentID.length-1][0]= scan.next();
			
			int count = 0;
			for(int i=0; i<StudentID.length-1; i++){
				if(StudentID[StudentID.length-1][0] .equals (StudentID[i][0])){
					count++;
				}
			}
			if(count==0){
				break;
			}
			else{
				System.out.println("The Student ID already exists");
			}
		}
		System.out.print("Enter Student Name : ");
		StudentID[StudentID.length-1][1]=scan.next();
		System.out.println();
		
		while(true){
				System.out.print("Programming Fundamentals Marks : ");
				marks[marks.length-1][0]=scan.nextInt();
				
				if(marks[marks.length-1][0]<0 || marks[marks.length-1][0]>100 ){
					System.out.println("Invalid marks, Please enter correct marks.\n");
				}else{
					break;
					}
				}
				
		
		while(true){
				System.out.print("Database Management System Marks : ");
				marks[marks.length-1][1]=scan.nextInt();
				
				if(marks[marks.length-1][1]<0 ||marks[marks.length-1][1]>100 ){
					System.out.println("Invalid marks, Please enter correct marks.\n");
				}else{
					break;
					}
				}
				
	    System.out.print("Student has been added successfully.");
	    
	    while(true){
				System.out.print("Do you want to add new student(y/n): ");
				Option = scan.next().charAt(0);
				
				if(Option=='y' || Option=='n'){
					break;
				}
				else{
					System.out.print("Invalid Option.Try Again");
				}
			}
			
		 clearConsole();
		 
		}
	 }
	 
	 public static void  addMarks(){                    //to add marks for added stuents(3)
		 
		 System.out.println("------------------------------------------------------------------------------------\n|                                     ADD MARKS                                    |\n------------------------------------------------------------------------------------\n");
			
		 char Option = 'y';
		 while(Option =='y'){
			 
			 int IDNumber = -1; 
			 char OptionNew = 'y';
			 
			 while(true){
				 System.out.print("\nEnter Student ID : ");
				 String ID = scan.next();
				 
				 for(int i=0; i<StudentID.length; i++){
					 if(ID .equals (StudentID[i][0])){
						 IDNumber = i;
					 }
				 }
						 
			    if(IDNumber== -1){
					System.out.print("Invalid Student ID."+ "  ");
					
					while(true){
						System.out.print("Do you want to search again ?(y/n) ");
						OptionNew = scan.next().charAt(0);
						
						if(OptionNew == 'y'||OptionNew =='n'){
							break;
						}
						else{
							System.out.print("Invalid Option");
						}
					}
					
				}
				else{
					System.out.println("Student ID: "+ StudentID[IDNumber][1]);
					break;
				}
				if(OptionNew =='n'){
					break;
				}
			}
			
			if(OptionNew =='n'){
				break;
			}
			else if(marks[IDNumber][0] !=0 && marks[IDNumber][1] !=0){
				System.out.println("This student's marks  have been already added. ");
				
				while(true){
					System.out.print("Do you want to add marks for another student? (y/n)");
					Option = scan.next().charAt(0);
					
						if(Option =='y' || Option =='n'){
							break;
						}
						else{
							System.out.print("Invalid Option");
						}
				}
			}
			else{
				while(true){
					System.out.print("\nProgramming Fundementals Marks : ");
					marks[IDNumber][0]=scan.nextInt();
					
					if(marks[IDNumber][0]<0 || marks[IDNumber][0]>100){
						System.out.println("Invalid marks, please enter correct marks. ");
					}
					else{
						break;
					}
				}
				
				while(true){
					System.out.print("Database Management Marks : ");
					marks[IDNumber][1] = scan.nextInt();
					
					if(marks[IDNumber][1]<0 || marks [IDNumber][1]>100){
						System.out.println("Invalid marks, please enter correct marks.");
					}
					else{
						break;
					}
				}
				
				System.out.print("Marks have been added.");
				
				while(true){
					System.out.print("Do you want to add marks for another student? (y/n)");
					Option = scan.next().charAt(0);
					
					if(Option == 'y' || Option =='n'){
						break;
					}
					else{
						System.out.print("Invalid Option.");
					}
				}
			}
		}
		
		clearConsole();
		
	} 
	
	public static void updateStudentDetails(){           //to update student details(4)
		System.out.println("------------------------------------------------------------------------------------\n|                               UPDATE STUDENT DETAILS                             |\n------------------------------------------------------------------------------------\n");
			
		char Option = 'y';
		while(Option == 'y'){
			
			int IDNumber = -1;
			char OptionNew = 'y';
			
			while(OptionNew == 'y'){
				System.out.print("\nEnter Student ID : ");
				String ID = scan.next();
				
				for(int i =0; i<StudentID.length; i++){
					if(ID .equals (StudentID[i][0])){
						IDNumber = i;
					}
				}
				
				if(IDNumber == -1){
					System.out.print("Invalid Number.");
					
					while(true){
						System.out.print("Do you want to search again ?(y/n)");
						OptionNew = scan.next().charAt(0);
						
						if(OptionNew == 'y' || OptionNew == 'n'){
							break;
						}
						else{
							System.out.print("Invalid Option.");
						}
					}
				}
				else{
					System.out.println("Student Name : "+ StudentID[IDNumber][1]);
					break;
				}
			}
			
			if(OptionNew =='n'){
				break;
			}
			
			System.out.print("\nEnter the new student name : ");
			StudentID[IDNumber][1] =scan.next();
			
			System.out.println("Student details has been updated successfully. ");
			
			while(true){
				System.out.print("Do you want to update another student details ? (y/n)");
				Option = scan.next().charAt(0);
				
				if(Option =='y' || Option =='n'){
					break;
				}
				else{
					System.out.print("Invalid Option. ");
				}
			}
		}
		
		clearConsole();
					
	}
	
	public static void updateStudentMarks(){             //to update student marks(5)
		System.out.println("------------------------------------------------------------------------------------\n|                                     UPDATE MARKS                                 |\n------------------------------------------------------------------------------------\n");
			
		char Option ='y';
		while(Option == 'y'){
			
			int IDNumber = -1;
			char OptionNew = 'y';
			
			while(OptionNew == 'y'){
				System.out.print("\nEnter Student ID : ");
				String ID = scan.next();
				
				for(int i=0; i<StudentID.length; i++){
					if(ID .equals (StudentID[i][0])){
						IDNumber = i;
					}
				}
				
				if(IDNumber == -1){
					System.out.print("Invalid Student ID.");
					
					while(true){
						System.out.print("Do you want to search again?(y/n)");
						OptionNew = scan.next().charAt(0);
						
						if(OptionNew == 'y' || OptionNew == 'n'){
							break;
						}
						else{
							System.out.print("Invalid Option.");
						}
					}
					
				}
				else if(marks[IDNumber][0]==0 && marks[IDNumber][1]==0){
					System.out.print("This student's marks  yet to be added.");
					
					while(true){
						System.out.print("Do you want to search again ? (y/n)");
						OptionNew = scan.next().charAt(0);
						
						if(OptionNew == 'y' || OptionNew == 'n'){
							break;
						}
						else{
							System.out.print("Invalid Option. ");
						}
					}
					
				}
				else{
					System.out.println("Student Name : "+ StudentID[IDNumber][1]);
					
					System.out.println("Programming Fundementals Marks : "+ marks[IDNumber][0]);
					System.out.println("Database Management System Marks : "+ marks[IDNumber][1]);
					
					break;
				}
			}
			
			if(OptionNew == 'n'){
				break;
			}
			
			while(true){
				System.out.print("\nEnter new Programming Fundamentals Marks : ");
				marks[IDNumber][0] = scan.nextInt();
				
				if(marks[IDNumber][0]<0 || marks[IDNumber][0]>100){
					System.out.println("Invalid marks, please enter correct marks. \n");
				}
				else{
					break;
				}
			}
			
			while(true){
				System.out.print("Enter new Database Management System Marks : ");
				marks[IDNumber][1] = scan.nextInt();
				
				if(marks[IDNumber][1]<0 || marks[IDNumber][1]>100){
					System.out.println("Invalid marks,please enter correct marks. \n");
				}
				else{
					break;
				}
			}
			
			System.out.println("Marks have been updated successfully. ");
			
			while(true){
				System.out.print("Do you want to update marks for another student ? (y/n)");
				Option = scan.next().charAt(0);
				
				if(Option == 'y' || Option == 'n'){
					break;
				}
				else{
					System.out.print("Invalid Option.");
				}
			}
		}
		
		clearConsole();		 
						
     }
     
     public static void deleteStudent(){              //to delete student(6)
		 System.out.println("------------------------------------------------------------------------------------\n|                                       DELETE STUDENT                             |\n------------------------------------------------------------------------------------\n");
			
		 char Option = 'y';
		 while(Option == 'y'){
			 
			 int IDNumber = -1;
			 
			 System.out.print("\nEnter Student ID : ");
			 String ID = scan.next();
			 
			 for(int i=0; i<StudentID.length; i++){
				 if(ID .equals (StudentID[i][0])){
					 IDNumber = i;
				 }
			 }
			 
			 if(IDNumber ==-1){
				 System.out.print("Invalid Student ID.");
				 
				 while(true){
					 System.out.print("Do you want to search again ? (y/n)");
					 Option = scan.next().charAt(0);
					 
					 if(Option =='y' || Option == 'n'){
						 break;
					 }
					 else{
						 System.out.print("Invalid Option.");
					 }
				 }
			 }
			 else{
				 String[][] tempStudentID = new String[StudentID.length][2];
				 int [][] tempMarks = new int [StudentID.length][2];
				 
				 for(int i=0; i<StudentID.length; i++){
					 for(int j=0; j<StudentID[i].length; j++){
						 if(IDNumber != i){
							 tempStudentID[i][j]=StudentID[i][j];
							 tempMarks[i][j]=marks[i][j];
						 }
					 }
				 }
				 
				 StudentID = tempStudentID;
				 marks = tempMarks;
				 
				 System.out.println("Student has been deleted successfully.");
				 
				 while(true){
					 System.out.print("Do you want to delete another student ? (y/n)");
					 Option = scan.next().charAt(0);
					 
					 if(Option == 'y'||Option =='n'){
						 break;
					 }
					 else{
						 System.out.print("Invalid Option.");
					 }
				 }
			 }
		 }
					 	
		 clearConsole();			 		 
	 }
     
    public static void printStudentDetails(){           //to print student details(7)
		
		char Option = 'y';
		while(Option == 'y'){
			System.out.println("------------------------------------------------------------------------------------\n|                                 PRINT STUDENT DETAILS                            |\n------------------------------------------------------------------------------------\n");
			
			int IDNumber = -1; 
			
			System.out.print("\nEnter Student ID : ");
			String ID = scan.next();
			
			for(int i=0; i<StudentID.length; i++){
				if(ID .equals (StudentID[i][0])){
					IDNumber = i;
				}
			}
			
			if(IDNumber == -1){
				System.out.print("Invalid Student ID.");
				
				while(true){
					System.out.print("Do you want to search again ? (y\n)");
					Option = scan.next().charAt(0);
					
					if(Option == 'y' || Option == 'n'){
						break;
					}
					else{
						System.out.print("Invalid Option.");
					}
				}
			}
			else{
				System.out.println("Student Name : "+ StudentID[IDNumber][1]);
				
				if(marks[IDNumber][0] ==0 && marks[IDNumber][1]==0){
					System.out.println("\nMarks yet to be added.");
				}
				else{
					System.out.println("+------------------------------+----------------+");
					System.out.println("|Programming Fundamnetal Marks |              "+marks[IDNumber][0]+"|");
					System.out.println("|Database Management System    |              "+marks[IDNumber][1]+"|");
					
					int[] Total= total();
					System.out.println("|Total Marks                   |             "+Total[IDNumber]+"|");
					
					double[] Average=average();
					System.out.println("|Avg. Marks                    |            "+Average[IDNumber]+"|");
					
					String Rank=rankPosition(IDNumber);
					System.out.println("|Rank                          |"+(rankPosition(IDNumber))+"|");
					
					System.out.println("+------------------------------+----------------+");
					}
				while(true){
					System.out.print("Do you want to search another student details ? (y/n)");
					Option = scan.next().charAt(0);
					
					if(Option == 'y' || Option == 'n'){
						break;
					}
					else{
						System.out.print("Invalid Option.");
					}
				}
			}
			
			clearConsole();	
		}			
	}
	  
     public static void printStudentRanks(){                 //to print student ranks(8)
		System.out.println("------------------------------------------------------------------------------------\n|                               PRINT STUDENT'S RANKS                              |\n------------------------------------------------------------------------------------\n");
		System.out.println();
		 
		System.out.println("+--------+-----+------------------+--------------+-------------+");
		System.out.println("|Rank    |ID   |Name              |Total Marks   |Avg. Marks   |");
		System.out.println("+--------+-----+------------------+--------------+-------------+");
		 
		double[] Descending =avgDescending();
		int[] Total =totalDescending();
		String[][] tempStudentID=studentIDDescending();
		 
		for(int i=0; i<Descending.length;i++){
			if(Descending[i]!=0){
			
			System.out.println("|"+(i+1)+"       |"+tempStudentID[i][0]+" |"+tempStudentID[i][1]+"             |           "+Total[i]+"|         "+Descending[i]+"|");
			}
		}
		
		System.out.println("+--------+-----+------------------+--------------+---------------+");
		
		char Option = 'y';
		
		while(true){
			System.out.print("Do you want to go back to main menu?(y/n):");
			Option =scan.next().charAt (0);
			
			if(Option =='y'){
				break;
			}else if(Option =='n'){
				System.out.println();
			}else{
				System.out.print("Invalid Option.");
				}
			}
			
			if(Option =='y'){
			clearConsole();
			}
		
		}
	 public static void bestInPRF(){	                // to get descending order of PRF marks(9)
		
		System.out.println("------------------------------------------------------------------------------------\n|                        BEST IN PROGRAMMING FUNDAMENTALS                          |\n------------------------------------------------------------------------------------\n");
		System.out.println();
		
		System.out.println("+-----+------------------+--------------+-------------+");
		System.out.println("|ID   |Name              |PRF Marks     |DBMS Marks   |");
		System.out.println("+-----+------------------+--------------+-------------+");
		
		int[][] Descending=PRFDescending();
		
		String[][] tempStudentID = studentIDDescending();
		
		for(int i=0; i<Descending.length;i++){
			if(Descending[i][0]!=0 && Descending[i][1]!=0){
				
				System.out.println("|"+tempStudentID[i][0]+" |"+tempStudentID[i][1]+"             |"+Descending[i][0]+"            |"+Descending[i][1]+"           |");
				}
			}
		
		System.out.println("+-----+------------------+--------------+-------------+");
		
		char Option='y';
		while(true){
			System.out.print("Do you want to go back to main menu?(y/n):");
			Option=scan.next().charAt (0);
					
			if(Option =='y'){
				break;
			}else if(Option =='n'){
				System.out.println();
			}else{
				System.out.print("Invalid option.");
				}
			}
		
		if(Option =='y'){
			clearConsole();
			}
		}
	 
	 public static void bestInDMBS(){                             // to get descending order of DBMS marks (10)
		
		System.out.println("------------------------------------------------------------------------------------\n|                         BEST IN DATABASE MANAGEMENT SYSTEM                       |\n------------------------------------------------------------------------------------\n");
		System.out.println();
		
		System.out.println("+-----+------------------+--------------+-------------+");
		System.out.println("|ID   |Name              |DBMS Marks    |PRF Marks    |");
		System.out.println("+-----+------------------+--------------+-------------+");
		
		int[][] Descending= DBMSDescending();
		
		String[][] tempStudentID= studentIDDescending();
		
		for(int i=0; i<Descending.length;i++){
			if(Descending[i][0]!=0 && Descending[i][1]!=0){
				
				System.out.println("|"+tempStudentID[i][0]+" |"+tempStudentID[i][1]+"             |"+Descending[i][1]+"            |"+Descending[i][0]+"           |");
				}
			}
		
		System.out.println("+-----+------------------+--------------+-------------+");
		
		char Option='y';
		while(true){
			System.out.print("Do you want to go back to main menu?(y/n):");
			Option=scan.next().charAt (0);
					
			if(Option =='y'){
				break;
			}else if(Option =='n'){
				System.out.println();
			}else{
				System.out.print("Invalid option.");
				}
			}
		
		if(Option =='y'){
			clearConsole();
			}
		}
		
     public static int[] total(){                            //to get total 
	
		int [] Total= new int [marks.length];
					
			for(int i=0; i<Total.length; i++){
				Total [i] = marks[i][0]+ marks[i][1];
			}
			return Total; 
	 }
	 
	 public static int[] totalDescending(){                //to get descending order of total 
		 
		 int [] Total = total();
		 
		 for(int i=0;i<Total.length-1;i++){
			for(int j=0;j<Total.length-1;j++){
				if(Total[j]<Total[j+1]){
					int temp = Total[j];
					Total[j]=Total[j+1];
					Total[j+1]=temp;
					}
				}
			}
		return Total;
		}
		 
	 public static double[] average(){                        //to get average
		 
		 int [] Total = total();
		 
		 double [] Average = new double[marks.length];
					
			for(int i=0; i<Average.length; i++){
				Average[i] = (double)Total[i]/2;
			}
			return Average;
	 }
	 
	 public static double [] avgDescending(){           // to get descending order of average
	
		double[] Descending= average();
			
			for(int i=0;i<Descending.length-1;i++){
			for(int j=0;j<Descending.length-1;j++){
				if(Descending[j]<Descending[j+1]){
					double temp = Descending[j];
					Descending[j]=Descending[j+1];
					Descending[j+1]=temp;
					}
				}
			}
			
		return Descending;
		}
	 
	 public static String[][] studentIDDescending(){          //to get descending order of student id 
		double[] Descending =avgDescending();
		double[] Average=average();
		String[][] tempStudentID =new String[Descending.length][2];
		
		for (int i = 0; i < Descending.length; i++){
			for(int j = 0; j < Average.length; j++){
				if(Descending[i]==Average[j]){
					tempStudentID[i][0]=StudentID[j][0];
					tempStudentID[i][1]=StudentID[j][1];
					}
					
				}
			}
			return tempStudentID; 
	 }
	 
	 public static String rankPosition(int index){                   //to get id's rank
		double[] Descending =avgDescending();
		double[] Average=average();
		
		int rankNumber=0;		                            
		for (int i = 0; i <Descending .length; i++){
			if(Average[index]==Descending [i]){
				rankNumber=i+1;
				}
			}
		
		String Rank="null";
		if(Descending[Descending.length-1]==Average[index]){
			Rank="         "+rankNumber+"(Last)";
		}else{
			switch (rankNumber){
				case 1:
					Rank="        "+rankNumber+"(First)";
					break;
				case 2:
					Rank="       "+rankNumber+"(Second)";
					break;
				case 3:
					Rank="        "+rankNumber+"(Third)";
					break;
				default :
					Rank="      "+rankNumber+"("+rankNumber+"th)";
				}
			
			}
		return Rank;
		
		}
	 
	 public static int[][] PRFDescending(){	                //to get descending order of PRF marks
		int[][] Descending = new int[marks.length][2];
		
		for(int i=0; i<Descending.length;i++){
			Descending[i][0]=marks[i][0];
			}
		
		for(int i=0;i<Descending.length-1;i++){
			for(int j=0;j<Descending.length-1;j++){
				if(Descending[j][0]<Descending[j+1][0]){
					int temp = Descending[j][0];
					Descending[j][0]=Descending[j+1][0];
					Descending[j+1][0]=temp;
					}
				}
			}
			
		for (int i = 0; i < Descending.length; i++){
			for(int j = 0; j < Descending.length; j++){
				if(Descending[i][0]==marks[j][0]){
					Descending[i][1]=marks[j][1];
					}
					
				}
			}
			
		return Descending;
		}	
		
		public static String[][] studentIDDescendingPRF(){        	//to get SID descending order according to PRF marks
		int[][] Descending= PRFDescending();
		String[][] tempStudentID=new String[Descending.length][2];
			
		for (int i = 0; i < Descending.length; i++){
			for(int j = 0; j < Descending.length; j++){
				if(Descending[i][0]==marks[j][0]){
					tempStudentID[i][0]= StudentID[j][0];
					tempStudentID[i][1]=StudentID[j][1];
					}
					
				}
			}
			return tempStudentID;
		}
		
		
		public static int[][] DBMSDescending(){	             //to get descending order of DBMS marks
		int[][] Descending= new int[marks.length][2];
		
		for(int i=0; i<Descending.length;i++){
			Descending[i][1]=marks[i][1];
			}
		
		for(int i=0;i<Descending.length-1;i++){
			for(int j=0;j<Descending.length-1;j++){
				if(Descending[j][1]<Descending[j+1][1]){
					int temp = Descending[j][1];
					Descending[j][1]=Descending[j+1][1];
					Descending[j+1][1]=temp;
					}
				}
			}
			
		for (int i = 0; i < Descending.length; i++){
			for(int j = 0; j < Descending.length; j++){
				if(Descending[i][1]==marks[j][1]){
					Descending[i][0]=marks[j][0];
					}
					
				}
			}
			
		return Descending;
		}
	 
	 public static String[][] SIDDescendingDBMS(){	           //to get SID descending order according to DBMS marks
		int[][] Descending= DBMSDescending();
		String[][] tempStudentID=new String[Descending.length][2];
			
		for (int i = 0; i < Descending.length; i++){
			for(int j = 0; j < Descending.length; j++){
				if(Descending[i][1]==marks[j][1]){
					tempStudentID[i][0]=StudentID[j][0];
					tempStudentID[i][1]=StudentID[j][1];
					}
					
				}
			}
			return tempStudentID;
		}
	 	
	 public final static void clearConsole() {                    //to clear the screen
		try {
			final String os = System.getProperty("os.name"); 
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}else {
				System.out.print("\033[H\033[2J"); 
				System.out.flush();
			}
		} catch (final Exception e) {
			 e.printStackTrace();
			 // Handle any exceptions.
		}
	 }
	 
	 public static void arraysIncrement(){                           //to increment the array 
		String[][] tempStudentID = new String[StudentID.length+1][2];
		int[][] tempmarks = new int[marks.length+1][2];
		
		for(int i=0; i<StudentID.length; i++){
			for(int j=0; j<StudentID[i].length; j++){
				tempStudentID[i][j] = StudentID[i][j];
				tempmarks[i][j] = marks[i][j];
			}
		}
		
		StudentID = tempStudentID;
		marks = tempmarks;
	}
	
}
