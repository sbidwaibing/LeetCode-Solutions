class Solution {
    public List<String> generateParenthesis(int n) 
    {
        List<String> output_arr = new ArrayList();
        backTrack(output_arr, "", 0,0, n);
        return output_arr;
    }
    
    public void backTrack(List<String> output_arr, String current_string, int open, int close, int max)
    {
        if(current_string.length() == max * 2)
        {
            output_arr.add(current_string);
            return;
        }
        
        if(open < max) backTrack(output_arr, current_string + "(", open +1, close, max);
        if(close  < open) backTrack(output_arr, current_string + ")", open, close + 1, max);
    }
}