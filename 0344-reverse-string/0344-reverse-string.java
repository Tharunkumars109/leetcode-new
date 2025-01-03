class Solution {
    public void reverseString(char[] s) {
       int n=s.length;
        int j=n-1,i=0;
        while(i<=j)
        {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
            i++;
        }
    }
}