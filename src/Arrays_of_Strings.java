public class Arrays_of_Strings {
    public static void main(String[] args)
    {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "Bye";
        strings[2] = "Java";


        for (String string:strings)
        {
            System.out.println(string);
        }

        int[] numbers1 = {1,2,3};
        int sum = 0;
        for (int x:numbers1)
        {
            sum = sum + x;
        }
        System.out.println(sum);

        int value = 0;
        String s = null;

        System.out.println(s);

    }
}
