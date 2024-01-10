class Solution {
    public int finalValueAfterOperations(String[] o) {
        int X=0;
        for(String i: o){
            if(i.equals("X++") || i.equals("++X")){
                X++;
            }
            else X--;
        }
        return X;
    }
}