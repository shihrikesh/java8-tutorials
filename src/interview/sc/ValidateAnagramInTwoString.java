package interview.sc;

public class ValidateAnagramInTwoString {

    // anagram .

    // apple, elapp

    // sap. aps


    public boolean validateAnagram(String str1, String str2) {


        int a= 'a';
        int[] count1 = new int[26];

        if(str1.length()!=str2.length()) return false;
        for(int i=0;i<str1.length();i++){

            count1[str1.charAt(i)-'a']++;
            count1[str2.charAt(i)-'a']--;
        }

        for (int count : count1) {
            if (count != 0)
                return false;
        }

        return true;

    }
}
