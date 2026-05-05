class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> result=new ArrayList<>();
        List<Integer>current= new ArrayList<>();
        backtrack(nums,0,target,current,result);
        return result;

    }
    public static void backtrack(int[] nums,int index,int target,List<Integer> current,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            backtrack(nums,i,target-nums[i],current,result);
            current.remove(current.size()-1);

        }
    }
}
