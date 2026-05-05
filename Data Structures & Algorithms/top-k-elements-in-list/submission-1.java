class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           if(list.contains(nums[i])!=true){
            list.add(nums[i]);
           }
        }
        ArrayList<pair> list1=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==list.get(i)){
                    count++;
                }
            }
            list1.add(new pair(list.get(i),count));
        }
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i).element+" "+list1.get(i).count);
        }
        Comparator comparator=new Comparator<pair>(){
            public int compare(pair p1,pair p2){
                return p1.count-p2.count;
            }
        };
        Collections.sort(list1,comparator);
        int[] result=new int[k];
        int m=0;
        for(int i=list1.size()-1;i>=0;i--){
            if(k>0){
            result[m]=list1.get(i).element;
            m++;
            k--;
            }
            else{
                break;
            }
        }
        return result;
    }
}
class pair{
    int element;
    int count;
    public pair(int element,int count){
        this.element=element;
        this.count=count;
    }
}
