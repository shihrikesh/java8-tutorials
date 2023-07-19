package classroom;

public class ReverseInteger {

    public static void main(String[] args) {
        // Reverse integer 123456 without using any inbuilt method.
        Integer integer = 123456;

        String str = String.valueOf(integer);
        StringBuilder sb = new StringBuilder();
        System.out.println(str);
        System.out.println(56%10);
        System.out.println(56/10);

        while (str.length()>1){
            int lastDigit = integer%10;
            sb.append(lastDigit);
            integer = integer - lastDigit;
            str = String.valueOf(integer);
            System.out.println("interger value every "+ str);
        }
        System.out.println(sb.toString());
    }
}
