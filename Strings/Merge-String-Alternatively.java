class Solution {
    public String mergeAlternately(String w1, String w2) {
        String s="";
        int i=0,a=w1.length(),b=w2.length(),max=0;
        if(a<b){max=b; }
        else max=a;
        while(i<max){
            if(i<a){
                s+=w1.charAt(i);
            }
            if(i<b){
                s+=w2.charAt(i);
            }
            i++;
       }
        return s;
    }
}