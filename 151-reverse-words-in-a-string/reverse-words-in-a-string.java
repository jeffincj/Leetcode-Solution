class Solution {
    public String reverseWords(String s) {

        char[] a = s.trim().replaceAll("\\s+", " ").toCharArray();

        // Reverse entire string
        reverse(a, 0, a.length - 1);

        // Reverse each word
        int start = 0;

        for (int i = 0; i <= a.length; i++) {
            if (i == a.length || a[i] == ' ') {
                reverse(a, start, i - 1);
                start = i + 1;
            }
        }

        return new String(a);
    }

    private void reverse(char[] a, int l, int r) {
        while (l < r) {
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}