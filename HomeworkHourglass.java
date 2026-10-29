import java.util.Scanner;
class HomeworkHourglass
{
    static int NUM_LEVELS;
	public static void main(String[] args) {
	    //Input the level of the hourglass
	    System.out.println("Please input your desired number level of the shape");
	    Scanner scanner=new Scanner(System.in);
		NUM_LEVELS=scanner.nextInt();
		printCap();
		printUpperBody();
		printMiddle();
    	printLowerBody();
		printCap();
	}
	//Prints the top and bottom cap of the hourglass
	public static void printCap(){
	    System.out.print("|");
	    for(int cap=0;cap<2*NUM_LEVELS+2;cap++){
	            System.out.print("\"");
	    }
	    System.out.println("|");
	}
		//Prints the upper body of the hour glass
	public static void printUpperBody(){
	    for (int line=0;line<NUM_LEVELS;line++){
	    //Print the spaces
	    for(int space=-1;space<line;space++){
	        System.out.print(" ");
	    }
	    //Print the edge on the left hand side
	    System.out.print("\\");
	    //Print the components inside
	    for(int colon=0;colon<2*(NUM_LEVELS-line);colon++){
	        System.out.print(":");
	    }
	    //Print the edge on the right hand side
	    System.out.println("/");
	}
	}
		//Prints the cinch of the hour glass
	public static void printMiddle(){
	    for (int space=0;space<NUM_LEVELS+1;space++)
	    System.out.print(" ");
	    System.out.println("||");
	}
		//Prints the lower body of the hour glass
		public static void printLowerBody(){
	    for (int line=0;line<NUM_LEVELS;line++){
	    //Print the spaces
	    for(int space=0;space<NUM_LEVELS-line;space++){
	        System.out.print(" ");
	    }
	    //Print the edge on the left hand side
	    System.out.print("/");
	    //Print the components inside
	    for(int colon=0;colon<2*(line+1);colon++){
	        System.out.print(":");
	    }
	    //Print the edge on the right hand side
	    System.out.println("\\");
	}
	}
}