import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortTest {

    private Student[] iDNumber;
    private SortingStudentsByGPA[] GPASort;

    @Before
    public void setUp() {
        iDNumber = new Student[5];
        GPASort = new SortingStudentsByGPA[5];
        for (int i = 0; i < iDNumber.length; i++) {
            iDNumber[i] = new Student("Student" + i, (int) (Math.random() * 15 + 1), (int) (Math.random() * 200 + 1));
            GPASort[i] = new SortingStudentsByGPA("Student" + i, (int) (Math.random() * 15 + 1), (int) (Math.random() * 200 + 1));
        }
    }

    @Test
    public void insertionSortTest() {
        Student[] iDNumberTest;
        iDNumberTest = iDNumber;
        insertionSort(iDNumber);
        Arrays.sort(iDNumberTest);
        for (int i = 0; i < iDNumberTest.length; i++) {
            assertSame(iDNumberTest[i], iDNumber[i]);
        }
    }

    @Test
    public void quickSortByGPATest() {
        SortingStudentsByGPA[] GPASortTest;
        GPASortTest = GPASort;
        quickSort(GPASort, 0, GPASort.length - 1);
        Arrays.sort(GPASortTest);
        for (int i = 0; i < GPASort.length; i++) {
            assertSame(GPASortTest[i], GPASort[i]);
        }
    }

    @Test //сортировка слиянием по iD
    public void mergeSortTest() {
        Student[] iDNumberTest;
        iDNumberTest = iDNumber;
        iDNumber = mergeSort(iDNumber);
        Arrays.sort(iDNumberTest);
        for (int i = 0; i < iDNumberTest.length; i++) {
            assertEquals(0, iDNumber[i].compareTo(iDNumberTest[i])); //тут сравниваем конкретно
            // методом compareTo т.к. при сортировке слиянием даже объекты с одинаковым iD могут обменяться местами
        }
    }

    private static void insertionSort(Student[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            Student key = arr[i];
            int j = i - 1;

            while (j > -1 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void quickSort(SortingStudentsByGPA[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        SortingStudentsByGPA support = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i].compareTo(support) < 0) {
                i++;
            }

            if (i <= j) {
                SortingStudentsByGPA temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static Student[] mergeSort(Student[] array1) {
        Student[] buffer1 = Arrays.copyOf(array1, array1.length);
        Student[] buffer2 = new Student[array1.length];
        return mergesortInner(buffer1, buffer2, 0, array1.length);
    }

    public static Student[] mergesortInner(Student[] buffer1, Student[] buffer2,
                                           int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        Student[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        Student[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        Student[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = (sorted1[index1].compareTo(sorted2[index2]) < 0) ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}