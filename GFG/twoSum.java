/*public class twoSum {
    public int[] TwoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
    
}*/


// Two pointer 

/* public class twoSum {
    public static void main(String[] args) {
        int [] arr={4,2,17,1,9};
        int target=5;
        int n=arr.length;
        int ans []=solve(arr,target);
        
        System.out.println(ans[0]+ " "+ans[1]);
    }
    private static int[] solve(int [] arr,int target){
        int n=arr.length;        int i=0;
        int j=n-1;

        while(i<j){
            if((arr[i]+arr[j]==target)){
                return new int[]{i,j};
            }else if((arr[i]+arr[j]<target)){
                i++;
            }else{
                j--;
            }     
        }
        return new int[]{-1,-1};
    }
}*/


// Hashmap

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int [] arr={4,2,17,1,9};
        int target=5;
        int n=arr.length;
        int ans []=solve(arr,target);
        
        System.out.println(ans[0]+ " "+ans[1]);
    }
    private static int[] solve(int [] arr,int target)
    {
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<arr.length;i++)
    {
        int comp=target-arr[i];
        if(map.containsKey(comp))
        {
            return new int[]{map.get(comp),i};
        }
        map.put(arr[i],i);
    }
    return new int[]{-1,-1};
    }
}
