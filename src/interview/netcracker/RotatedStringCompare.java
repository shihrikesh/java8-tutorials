package interview.netcracker;

public class RotatedStringCompare {

    public static void main(String[] args) {

        /* - To check if one string is a rotation of another,
                "Netcracker" 10
        "ckernetcra" - true -
        "crackrenet" - false*/

        String s1 = "netcracker";
        String s2 = "ckernetcra";
        String checkString = s1+s1;
        StringBuilder sb = new StringBuilder(checkString);
        System.out.println(sb.indexOf(s2)!=-1);
        System.out.println(sb.indexOf(s2));
    }
}
