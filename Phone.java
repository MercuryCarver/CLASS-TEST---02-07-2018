import java.util.Scanner;
public class Phone {
	public static void main(String[] args) {
	TEST info= new TEST("IphoneX", "Apple", 2018);
	System.out.println("The brand of this phone is " + info.brand + '\n' + "The name of it is: " + info.name + " which was released in the year of " + info.year);
	TEST second = new TEST("Galaxy 9", "Samsung", 2018);
	System.out.println("The brand of this lovely phone is none other but " + second.brand + '\n' + "The name of it is the " + second.name + " which was released in the year of " + second.year);
	TEST third = new TEST("Google Pixel 2", "Google", 2017);
	System.out.println("This last phone was made by " + third.brand + "." + '\n' + "This revolutionary phone is the " + third.name + " which was released in " + third.year);
	Scanner option = new Scanner(System.in);
	System.out.println("Which one would you like to choose? Pick one - three");
	int choose = option.nextInt();{
	if(choose == 1)
	{System.out.println("Your price will be $1000");}
	else if (choose == 2)
	{System.out.println("Your price will be $900");
	}else if (choose == 3)
	{System.out.println("Your price will be $850");
	}
	}
	}
	
	
	}
	

