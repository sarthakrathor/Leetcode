class MedianFinder {
    private List<Integer> nums;
    public MedianFinder() {
        nums = new ArrayList<>();
    }
    
    public void addNum(int num) {
        // int index = Collections.binarySearch(nums, num);
        // if (index < 0) {
        //     index = -(index + 1);
        // }
        // nums.add(index, num);
        if (nums.isEmpty()) {
        nums.add(num);
        return;
        }

        int insertIndex = 0;
        while (insertIndex < nums.size() && nums.get(insertIndex) < num) {
            insertIndex++;
        }

        nums.add(insertIndex, num);
    }
    
    public double findMedian() {
        int n = nums.size();
        if (n % 2 == 1) {
            return nums.get(n / 2);
        } else {
            return (nums.get(n / 2 - 1) + nums.get(n / 2)) / 2.0; 
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */