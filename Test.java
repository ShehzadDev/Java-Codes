package Test;

import Calculator.Opr;
import java.util.Scanner;

class Test
{
	public static void main(String args[])
	{
		double x,y;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first Number : ");
		x=input.nextDouble();
		System.out.println("Enter first Number : ");
		y=input.nextDouble();
		Opr obj=new Opr(x,y);

		double opt;
		System.out.println("Enter your Choice (1-4): \n1)Additon\n2)Subtraction\n3)Multiplication\n4)Division");
		opt=input.nextDouble();

		if(opt==1)
		{
			System.out.println("The Solution is "+obj.add());
		}
		else if(opt==2)
		{
			System.out.println("The Solution is "+obj.sub());
		}
		else if(opt==3)
		{
			System.out.println("The Solution is "+obj.mul());
		}
		else if(opt==4)
		{
			System.out.println("The Solution is "+obj.div());
		}
	}
}