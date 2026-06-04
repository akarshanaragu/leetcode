// Last updated: 6/4/2026, 10:33:01 AM
class MedianFinder {

    PriorityQueue<Integer> left = new PriorityQueue<>((a, b) -> b - a);
    PriorityQueue<Integer> right = new PriorityQueue<>();

    public void addNum(int num) {
        left.offer(num);
        right.offer(left.poll());
        if (left.size() < right.size())
            left.offer(right.poll());
    }

    public double findMedian() {
        if (left.size() > right.size())
            return left.peek();
        return (left.peek() + right.peek()) / 2.0;
    }

}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */