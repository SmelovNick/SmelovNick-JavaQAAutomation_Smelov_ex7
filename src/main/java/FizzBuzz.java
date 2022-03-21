public class FizzBuzz {
    public static void main(String[] args)
    {
        fizzBuzz(100);
    }

    private static void fizzBuzz(int num)
    {
            if (((num % 3) == 0) && ((num % 5) == 0))
                System.out.println("FizzBuzz");
            else if ((num % 3) == 0)
                System.out.println("Fizz");
            else if ((num % 5) == 0)
                System.out.println("Buzz");
    }
}
