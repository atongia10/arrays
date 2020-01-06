import com.lesson.arrays.MergeTwoSortedArrays;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestMergeTwoSortedArrays {

    @Test
    public void testMergeTwoSortedArraysMethod() {
        int [] arr1 = {1, 3, 4, 5};
        int [] arr2 = {2, 6, 7, 8};
        int [] result = {1,2,3,4,5,6,7,8};
        MergeTwoSortedArrays tester = new MergeTwoSortedArrays();
        assertEquals(8, tester.mergeArrays(arr1,arr2).length);
        assertArrayEquals(result, tester.mergeArrays(arr1,arr2));
    }

    @Test
    public void compareMergeTwoSortedArraysMethod() {
        int [] arr1 = {1, 3, 4, 5};
        int [] arr2 = {2, 6, 7, 8};
        int [] result = {1,2,3,4,5,6,7,8};
        MergeTwoSortedArrays tester = new MergeTwoSortedArrays();
        assertArrayEquals(result, tester.mergeArrays(arr1,arr2));
    }

    @Test
    public void compareMergeTwoSortedArraysMethod1() {
        int [] arr1 = {1, 3, 4, 5, 5};
        int [] arr2 = {2, 6, 7, 8};
        int [] result = {1,2,3,4,5,5,6,7,8};
        MergeTwoSortedArrays tester = new MergeTwoSortedArrays();
        assertArrayEquals(result, tester.mergeArrays(arr1,arr2));
        System.out.println(result);
    }
}
