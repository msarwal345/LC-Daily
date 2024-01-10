class Solution {
    private int gcd (int a,int b){
        return b==0 ? a : gcd(b,a%b); 
    }
    public String gcdOfStrings(String s1, String s2) {
        if(!((s1+s2).equals(s2+s1))) return "";
        if(s1.equals(s2)) return s1;
        int g=gcd(s1.length(),s2.length());
        return s1.substring(0,g);
    }
}