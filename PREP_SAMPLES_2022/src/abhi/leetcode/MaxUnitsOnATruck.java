package abhi.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class MaxUnitsOnATruck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
		int truckSize = 10;
		
		int units = new MaxUnitsOnATruck().getMaxUnit(boxTypes, truckSize);
		System.out.println("max units is: "+units);
	}
	
	int getMaxUnit(int boxTypes[][], int truckSize) {
		Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
		int assignedBoxes=0,assignedUnits=0;
		for(int i=0;i<boxTypes.length;i++) {
			int boxValue = boxTypes[i][0];
			if(assignedBoxes < truckSize) {
				if(boxValue < truckSize-assignedBoxes) {
					assignedUnits += boxTypes[i][0] * boxTypes[i][1];
					assignedBoxes +=boxValue;
				}else {
					assignedUnits += (truckSize-assignedBoxes)*boxTypes[i][1];
					assignedBoxes += (truckSize-assignedBoxes);
				}
			}else {
				break;
			}
		}
		return assignedUnits;
	}
	
	

}
