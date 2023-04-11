package classroom;

public class FIndFirstOccurrenceStr {
    public static void main(String[] args) {
        //int index = strStr("leetcode", "leeto");
        int index = strCollection("hehello", "hello");
        System.out.println(index);

    }

    public static int strCollection(String haystack, String needle){
        int index=-1;


        StringBuilder sb = new StringBuilder(haystack);
        //sb.reverse();
        StringBuffer sf = new StringBuffer(haystack);
        //sf.reverse();
        System.out.println(sb.lastIndexOf(needle));
        System.out.println(sf.lastIndexOf(needle, 0));

        return index;
    }

    public static int strStr(String haystack, String needle) {
        int index = -1;
        if (haystack.length() < needle.length())
            index = -1;
        else {
            int needleLen = needle.length();
            char[] charStr = haystack.toCharArray();

            for (int k = 0; k < haystack.length(); k++) {
                String compString = "";
                for (int i = k; i <  needleLen+k && i<haystack.length(); i++) {
                    compString = compString + charStr[i];
                    System.out.println(compString);
                }
                if (needle.equals(compString)) {
                    index = k;
                    return index;
                }
            }

        }

        return index;
    }
}
