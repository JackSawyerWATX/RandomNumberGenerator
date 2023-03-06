import java.util.Random;

class RandomNumber {
    public static void main(String[] args) {
            Random random = new Random(); 
    int n = random.nextInt((int) Math.pow(10, 10));
    System.out.println(n);
    }
}