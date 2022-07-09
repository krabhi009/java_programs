package abhi.leetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FullCapacityOfRocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullCapacityOfRocks fc = new FullCapacityOfRocks();
		int[] cap = {2,3,4,5};
	    int[] rock = {1,2,4,4};
	    //Arrays.sort(cap);
	    //System.out.println(Arrays.toString(cap));
	    
		fc.maximumBags(cap, rock, 2);
	}
	
	public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int numOfFullBag=0;
        int rocksNeeded[] = new int[capacity.length];
        for(int i=0;i<capacity.length;i++){
            rocksNeeded[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(rocksNeeded);
        for(int i=0;i<rocksNeeded.length;i++){
            if(rocksNeeded[i] <= additionalRocks ){
                additionalRocks -= rocksNeeded[i];
                numOfFullBag++;
            }else{
                break;
            }
        }
        return numOfFullBag;
    }

}
