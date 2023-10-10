public class ClimbingStairs_70 {

    public static void main(String[] args) {
        System.out.println(climbingStairs2(6));

    }

    public static int climbingStairs2(int n) {
        if (n == 1) {
            return n;
        }
        int step1 = 1;
        int step2 = 2;
        for (int i = 3; i <= n; i++) {
            int temp = step2;
            step2 = step1 + step2;
            step1 = temp;

        }
      return step2;

    }
}

/*
    public static int climbingStairs(int n) {// dynamic programing
        if (n == 1) {
            return n;
        }//Extra arr and cos us O(n) space complexity
        int[] steps = new int[n + 1];// initialing an array for dynamic prog.
        steps[1] = 1;
        steps[2] = 2;
        for (int i = 3; i <= n; i++) { // from num3 we calculate las two steps all a way to the last number
            steps[i] = steps[i - 1] + steps[i - 2]; // we can jump 1 or 2 steps

        }
        return steps[n];

    }
}

You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps.
In how many distinct ways can you climb to the top?
Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

first 2 steps are sam for 3,  we can just add up one more// we combined fist 2 solutions=> stairs[3]=(1+1)+1=3//stairs[3] = 2+1 =3
to reach stars 4 we =>stairs[4] = 3+2 =5; using logic (adding up last two steps) stairs [5] = 5 + 3 =8; stairs[6] = 5 + 8 =13;
stairs = 1,2,3,4,5,6
steps => 1=1, 2=2, 3=3, 4=5, 5=8, 6=13 distinct ways
 */