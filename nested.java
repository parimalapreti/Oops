class DivisibleCheck {
    public static void main(String[] args) {
        int num = 221;

        if (num % 13 == 0 && num % 17 == 0) {
            System.out.println("221 is divisible by both 13 and 17");
        } else {
            System.out.println("221 is not divisible by both 13 and 17");
        }
    }
}