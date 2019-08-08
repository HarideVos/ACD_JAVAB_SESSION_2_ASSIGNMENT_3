import java.util.Scanner;

public class AsteriXPattern {
	
	public static void main(String[] args)
	{
		int num= 6;
	    drawAsterix(num);

	}

	private static void drawAsterix(int num) {

	int startCur = 0; 
	int endCur = num-1; 
	for (int i = 0; i < num; i++) 
	{ 
	for (int j = 0; j < num; j++) 
	{ 
	if (startCur == endCur && j == i) 
	System.out.print('*'); 
	else if (startCur == j || endCur == j) 
	System.out.print('*'); 
	else 
	System.out.print(' '); 
	} 
	startCur++; 
	endCur--; 
	System.out.println(); 

	} 

	}
	
}