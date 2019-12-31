public class NumberTheory {
    public static int gcdRecursive(int a, int b){
        if (b==0){
            if (a < 0)
                return -a;
            else
                return a;
        }
        else {
            return gcdRecursive(b, a % b);
        }
    }
    
    public static int gcdLoop(int a, int b) {
        int test = 0;
        while (b != 0) {
            test = a % b;
            a = b;
            b = test;
        }
        if (a < 0)
            return -a;
        else
            return a;
    }
    
    public static void main(String[] args){
        // this main method isn't really for anything but testing the functions
        // Starts with a quick array of numbers to test normal combinations, negatives, and zero
        int[] testNumbers = {12, 4, 12, 5, -16, 14, 0}; 
        for(int i = 1; i < testNumbers.length; i++)
            System.out.println(gcdRecursive(testNumbers[i-1], testNumbers[i]));
        for(int i = 1; i < testNumbers.length; i++)
            System.out.println(gcdLoop(testNumbers[i-1], testNumbers[i]));   
            
    }
}
    