import java.util.*;
public class BMI205{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter weight => ");
        int w = sc.nextInt();
        System.out.print ("Enter Height => ");
        int h = sc.nextInt();
        int b = w/(m*m);
        if b < 18.50 
		{System.out.print("Thin");}
            if b>= 18.50
		{System.out.print ("Normal");}
                 if b>=23
		{System.out.print ("Fat");}
		
	}
}