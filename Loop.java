
public class Loop {
	public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; 
            }
            System.out.println(i);
        }


        

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }



        int num = 0;
        while (num < 20) {
            num++;
            if (num % 2 == 0) {
                continue;
            }
            if (num > 15) {
                break; 
            }
            System.out.println(num);
        }
		
		
	
		int x = 0;
		do {
			x++;
			if (x % 2 == 0) {
				continue;
			}
			if (x > 17) {
				break;
			}
			System.out.println(x);
			
		} while (x <= 20);
		
	}
}