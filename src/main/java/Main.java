public class Main {
    public static void main(String[] args) {
        int wysokosc = 6;

        
        for (int i = 1; i <= wysokosc; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        for (int i = 1; i <= wysokosc; i++) {
            
            for (int j = 1; j <= wysokosc - i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
    }
}
}