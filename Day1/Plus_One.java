class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        if(digits[digits.length-1]!=9)
        {
            digits[digits.length-1]+=1;
            return digits;
        }
        else{
            
            for(int i=digits.length-1;i>=0;i--){
                if(digits[i]==9){
                    digits[i]=0;
                    carry=1;
                }
                else{
                    digits[i]+=1;
                    carry = 0;
                    break;
                }
            }
        }
        int res[] = new int[digits.length+1];
        if(carry==1){
            
            res[0]=1;
            for(int i=1;i<digits.length+1;i++){
                res[i] = digits[i-1];
            }
        }
        else{
            return digits;
        }
        return res;
    }
}
