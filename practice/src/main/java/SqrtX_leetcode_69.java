public class SqrtX_leetcode_69 {

    public static void main(String[] args) {

        System.out.println(mySqrt(25));


    }

    public static int  mySqrt(int x){
        long left =0, right = (x /2)+1;
        while (left<right){
            long mid = left + (right -left )/2 +1;
            long square = mid*mid;
            if(square == x){
                return (int) mid;
            }else if(square <x){
                left = mid;
            }else{
                right = mid -1;
            }
        }
        return (int) left;
    }





}
/*
The square root of 'x' is the range of 'a -> (x/2) + 1'
Since, our range is sorted in Ascending order
-we can implement binary search approach to find the target value
For each of the 'mid' value
-we will calculate the 'square' of 'mid'
-square  = mid * mid
if 'square' is equal to 'x'
-Then 'mid' is the target value
if 'square' is less than  'x'
Then, 'square' may or may not to be the largest square that is less than 'x'
-So, we will need to search rightward with 'mid' inclusive
if, square  is grater than 'x'
Then we need to search leftward from 'mid' -1

ANSWER:

Create two variables
-left, the current left boundary, initially 0
-right, the current right boundary, initially '(x/2) + 1
-while 'left' is less than 'right'
-calculate 'mid'
-mid = left + (right-left)/2 +1
The +1 just picks the upper mid-value
-[1,2], we will pick 2 instead 1
Calculate 'square'
-square = mid = mid
if, 'square' is equal to 'x'
return 'mid'
else if 'square' is less than 'x'
-left -mid
else
right = mid -1
Return (int) left;=> which 'left -left' will be the largest square that is less than 'x'








 */