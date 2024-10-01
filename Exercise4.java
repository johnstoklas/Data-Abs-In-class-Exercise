import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;

public class Exercise4 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            Set<Integer> keySet = map.keySet();
            if(keySet.contains(difference)) {
                return new int[]{map.get(difference), i};
            }
            else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public ArrayList<int[]> findSymPairs(int arr[][]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<int[]> ret = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(map.keySet().contains(arr[i][1])) {
                ret.add(new int[]{arr[i][1], arr[i][0]});
            }
            else {
                map.put(arr[i][0], arr[i][1]);
            }
        }
        return ret;
    }
}
