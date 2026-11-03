public class ReverseInteger {
    public static void main(String[] args) {
        int number = 12345;
        if (args.length > 0) {
            number = Integer.parseInt(args[0]);
        }

        int reversed = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;       
            reversed = reversed * 10 + digit; 
            temp /= 10;                  
        }

        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversed);
    }
}
