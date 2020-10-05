package jo_bc_gugu1;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		while(true) {

            int s = sc.nextInt();
            int e = sc.nextInt();
			if (2 <= s && s <= 9 && 2 <= e && e <= 9) {
		    	if (s >= e) {
		    		for (int num = 1; num < 10; num++) {
		    			for (int i = s; i >= e; i--) {
		    				System.out.printf("%d * %d = %2d   ", i, num, i * num);
		    			}
		    			System.out.print('\n');
		    		}
		    		break;
		    	} else {
		    		for (int num = 1; num < 10; num++) {
		    			for (int i = s; i <= e; i++) {
		    				System.out.printf("%d * %d = %2d   ", i, num, i * num);
		    			}
		    			System.out.print('\n');
		    		}
		    		break;
		    	}
		    } else {
		    	System.out.println("INPUT ERROR!");
		    }
		}
        sc.close();
    }
}
