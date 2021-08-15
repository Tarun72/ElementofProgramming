package array;

public class DutchNationFlag extends ElementsOfProgramming {
    @Override
    void onSolution() {
        sortColorsBruteFoce(new int[]{2, 0, 2, 1, 1, 0});
        //sortColors(new int[]{2, 0, 2, 1, 1, 0});
        sortColors(new int[]{1,2,0});
    }

    @Override
    void initDetail() {
        questionNumber = 6.1f;
        leetCodeUrl = "";
        pageNumber = 59;
    }

    public void sortColorsBruteFoce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
    public void sortColors(int[] nums) {
    int left = 0,right = nums.length-1;
    quickSort(nums,left,right);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(" "+nums[i]);
        }
    }

    private void quickSort(int[] nums, int left, int right) {
        if(left < right){
            int partition =  partition(nums,left,right);
            quickSort(nums,left,partition-1);
            quickSort(nums,partition+1,right);
        }
    }

    private int partition(int[] nums, int left, int right) {
        int start = left;
        int end =  right;
        int pivot =  (left+right)/2;
        int pivotElements =  nums[pivot];
        while(start<end){
            while(start<end && nums[start]<pivotElements){
                start++;
            }
            while(nums[end]>pivotElements){
                end--;
            }
            if(start< end){
                // swapping should be done
                int temp =  nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        nums[start] = nums[right];
        nums[right] = pivotElements;
        return end;
    }

    public static void main(String[] args) {
        new DutchNationFlag().onSolution();
    }
}
