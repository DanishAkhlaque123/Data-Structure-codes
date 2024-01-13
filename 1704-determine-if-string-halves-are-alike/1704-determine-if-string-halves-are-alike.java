class Solution {

    public boolean halvesAreAlike(String s) {
        int case1=0;
        int case2=0;
        int len = s.length();
        String firstPart = s.substring(0, len / 2);
        String secondPart = s.substring(len / 2);
        System.out.println(len);
        for (int i = 0; i < firstPart.length(); i++) {
            char ch = firstPart.charAt(i);
            char ch1 = secondPart.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                case1++;
            }  
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                case1++;
            }
            if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
                case2++;
            }  
            if (ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U') {
                case2++;
            }
        }

        return case1==case2;
    }
}
