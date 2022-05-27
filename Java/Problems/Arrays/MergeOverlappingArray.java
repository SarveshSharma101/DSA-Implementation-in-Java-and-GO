package Problems.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeOverlappingArray {

    /**
     * Merge Overlapping Intervals
     *
     * Given a list of intervals, merge them to get a list of non-overlapping intervals.
     *
     * intervali = [starti, endi]
     *
     * Example:
     * Intervals: [[1, 2], [2, 3], [1, 4], [5, 6]]
     *
     * [1, 2] and [2, 3] can be merged to form [1, 3].
     * Now, [1, 3] and [1, 4] can be merged to form [1, 4].
     * [1, 4] and [5, 6] have no intersection.
     * Hence above intervals are merged to form:
     * [[1, 4], [5, 6]]
     *
     * Note that the final list should be in ascending order.
     *
     * @param intervals
     * @return
     */

    int[][] mergeIntervals(int[][] intervals) {
        List<int[]> iList = Arrays.stream(intervals).collect(Collectors.toList());
        while (true){
            boolean f = false;
            for (int i=0; i<iList.size(); i++){
                for (int j=i+1; j<iList.size(); j++){
                    if ((iList.get(i)[0] == iList.get(j)[0] || iList.get(i)[0] == iList.get(j)[1]) ||
                            (iList.get(i)[1] == iList.get(j)[0] || iList.get(i)[1] == iList.get(j)[1])) {f = true;}
                    if (f){
                        iList.add(i, new int[]{iList.get(i)[0], iList.get(j)[1]});
                        iList.remove(i+1);
                        iList.remove(j);
                        break;
                    }
                }
                if (f) break;
            }
            if (!f) break;
        }
        int[][]C = new int[iList.size()][intervals[0].length];
        int x=0;
        for (int[] i : iList) {
            if (x < C.length) {
                C[x] = i;
                x++;
            }
        }
        return C;
    }

    public static void main(String[] args) {
        int[][]A = new int[][]{{1, 4}, {6, 7}, {4, 5}};
        int[][]C = new MergeOverlappingArray().mergeIntervals(A);

        for (int i=0; i< C.length; i++){
            for (int j=0; j<C[0].length; j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }

//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//
//        System.out.println(list);
//
//        list.remove(2);
//
//        System.out.println(list);
//
//        list.add(2, 50);
//
//        System.out.println(list);
    }
}
