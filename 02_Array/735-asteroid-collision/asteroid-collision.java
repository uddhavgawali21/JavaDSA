// class Solution {
//     public int[] asteroidCollision(int[] asteroids) {
//         Stack<Integer> st = new Stack<>();

//         for(int i : asteroids){
//             while(!st.isEmpty() && st.peek()>0 && i<0 && st.peek()< -i){
//                     st.pop();
                    
//                 }

//             if(!st.isEmpty() && st.peek()>0 && i<0){
                
//                 if(Math.abs(st.peek())==Math.abs(i)){
//                     st.pop();
//                 }
//             }
//             else{
//                 st.push(i);
//             }
//         }
//         int[] arr = new int[st.size()];

//         for(int i = arr.length-1; i>=0 ; i--){
//             arr[i] = st.pop();
//         }
//         return arr;
//     }
// }


class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {

                if (stack.peek() < -asteroid) {
                    stack.pop();
                }
                else if (stack.peek() == -asteroid) {
                    stack.pop();
                    asteroid = 0;
                    break;
                }
                else {
                    asteroid = 0;
                    break;
                }
            }

            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }

        int[] ans = new int[stack.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}