class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int start=0, end=row*col-1;
        while(start<=end) {
            int mid = (end-start)/2+start;
            if(matrix[mid/col][mid%col] == target) return true;
            else if(matrix[mid/col][mid%col] < target) start=mid+1;
            else end=mid-1;
        } return false;
    }
}