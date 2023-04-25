package strings;

public class StringEquals {
    public static void main(String[] args) {

        String s1 = new String("java");
        String s2 = new String("java");
        System.out.println(s1.equals(s2));

        StringBuilder builder1 = new StringBuilder ("java");
        StringBuilder builder2 = new StringBuilder ("java");
        System.out.println(builder1.equals(builder2));

        StringBuffer buffer1= new StringBuffer ("java");
        StringBuffer buffer2 = new StringBuffer ("java");
        System.out.println(buffer1.equals(buffer2));
    }
}
