public class Arrays {
    public static void main(String[] args)
    {
        int number = 10; // primitive type
        int[] numbers = new int[5];
        for(int i=0; i<numbers.length; i++)
        {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }
        System.out.println(numbers[0]);

        int[] numbers1 = {1,2,3};
        for(int i = 0; i < numbers1.length; i++)
        {
            System.out.println((numbers1[i]));
        }
    }
}
