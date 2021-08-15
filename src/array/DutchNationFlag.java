package array;

public class DutchNationFlag extends ElementsOfProgramming {
    @Override
    void onSolution() {
        sortColorsBruteFoce(new int[]{2, 0, 2, 1, 1, 0});
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
}
