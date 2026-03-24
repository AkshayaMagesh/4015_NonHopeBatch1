package Day_3;

class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        String input = Integer.toString(Math.abs(x));
        StringBuffer num = new StringBuffer(input);
        input = num.reverse().toString();
        try {
            int result = Integer.parseInt(input);
            return (isNegative)? -result: result;
        }
        catch(NumberFormatException e){
            return 0;
        }
    }
}
