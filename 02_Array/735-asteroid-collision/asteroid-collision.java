class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int i : asteroids){
            while(!st.isEmpty() && st.peek()>0 && i<0 && st.peek()< -i){
                    st.pop();
                    
                }

            if(!st.isEmpty() && st.peek()>0 && i<0){
                
                if(Math.abs(st.peek())==Math.abs(i)){
                    st.pop();
                }
            }
            else{
                st.push(i);
            }
        }
        int[] arr = new int[st.size()];

        for(int i = arr.length-1; i>=0 ; i--){
            arr[i] = st.pop();
        }
        return arr;
    }
}