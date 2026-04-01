package day_10;

public class TrialAndError {
    public static void main(String[] args) {
        try {
            int i = 10 / 0;
            int[] arr = new int[1];
            arr[10] = 0;
            System.out.println();
        }
        
        catch(ArithmeticException e ) {
            System.out.println("Divide by zero error");
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds ");
        }

        catch(Exception e){
            System.out.println("Unknown error");
        }
    }

}
