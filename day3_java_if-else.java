public class hackerrankifelse {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (!(num % 2 == 0)) {
            System.out.println("Weird");
        } else if (num % 2 == 0 && (num >= 2 && num <= 5)) {
            System.out.println("Not Weird");
        } else if (num % 2 == 0 && (num >= 6 && num <= 20)) {
            System.out.println("Weird");
        } else if (num % 2 == 0 && num > 20) {
            System.out.println("Not Weird");
        }
        scan.close();

    }
}
