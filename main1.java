public class main1 {
    static void display() {
        try {
            System.out.println("Inside try block");
            return;
        } finally {
            System.out.println("I am inevitable");
        }
    }

    public static void main(String[] args) {
        display();
    }
}
