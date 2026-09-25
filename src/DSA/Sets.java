package DSA;
import java.util.*;

public class Sets {
    public static void main(String[] args) {
        HashSet<Integer> nums1 = new HashSet<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(3);
        nums1.add(30);
        nums1.add(300);
        nums1.add(322);
        nums1.add(3131);
        nums1.add(3343);
        nums1.add(31);

        System.out.println(nums1);


        LinkedHashSet<Integer> nums2 = new LinkedHashSet<>();
        nums2.add(32);
        nums2.add(23);
        nums2.add(22);
        nums2.add(23);
        nums2.add(43);

        System.out.println(nums2);


        TreeSet<Integer> nums3 = new TreeSet<>();
        nums3.add(12);
        nums3.add(13);
        nums3.add(11);
        nums3.add(12);

        System.out.println(nums3);

        TreeSet<Integer> nums = new TreeSet<>(Collections.reverseOrder());
        nums.add(12);
        nums.add(123);
        nums.add(1233);
        nums.add(1);
        nums.add(1234);
        nums.add(12345);

        System.out.println(nums);

    }
}
