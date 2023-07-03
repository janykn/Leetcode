// i gave up here(Solved the output part, but could not satisfy the Custom Judge Condition)

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]==val){ count++;  }
        }
       return (l-count);
    }
}//nums =[3,2,2,3], val = 3, Output = [3,2], Expected = [2,2]


//Idea i found in submissions
 if(nums[i]!=val){ nums[index] = nums[i]; index++; 

//1st Submitted Solution(Time: Beats 100%, Storage:Beats 26%)
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int index = 0;
        int l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]!=val){ nums[index] = nums[i]; index++;  }
            else if(nums[i]==val){count++;}
        }
       return (l-count);
    }
}
//2nd Submitted Solution(Time: Beats 100%, Storage:Beats 74%) Removed count,l variables to improve space complexity. This is also the best solution i found in submissions. I used his idea however
class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){ nums[index] = nums[i]; index++;  }
        }
       return (index);
    }
}


