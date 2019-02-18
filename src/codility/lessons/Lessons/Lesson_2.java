package codility.lessons.Lessons;

import java.util.Arrays;

public class Lesson_2
{
    public static int OddOccurrencesInArray(int[] A)
    {
        // Complexity O(n*log(n)) due to sorting.
        // Trick: Sorting the array..

        int length = A.length;

        if (length == 1)
        {
            return A[0];
        }

        Arrays.sort(A);

        for (int i = 0; i < length; i = i + 2)
        {
            int first = A[i];
            int second = A[i + 1];

            if (first != second)
            {
                int third = A[i + 2];

                if (first == third)
                {
                    return second;
                }
                else
                {
                    return first;
                }
            }

            if (i + 2 == length - 1) // there is only a single value after this
            {
                return A[i + 2];
            }
        }

        return -1;
    }

    public static int CyclicRotation()
    {
        return -1;
    }
}

// Odd Occurrences In Array problem statement:
/*
        A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

        For example, in array A such that:

        A[0] = 9  A[1] = 3  A[2] = 9
        A[3] = 3  A[4] = 9  A[5] = 7
        A[6] = 9
        the elements at indexes 0 and 2 have value 9,
        the elements at indexes 1 and 3 have value 3,
        the elements at indexes 4 and 6 have value 9,
        the element at index 5 has value 7 and is unpaired.
        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

        For example, given array A such that:

        A[0] = 9  A[1] = 3  A[2] = 9
        A[3] = 3  A[4] = 9  A[5] = 7
        A[6] = 9
        the function should return 7, as explained in the example above.

        Write an efficient algorithm for the following assumptions:

        N is an odd integer within the range [1..1,000,000];
        each element of array A is an integer within the range [1..1,000,000,000];
        all but one of the values in A occur an even number of times.
        Copyright 2009–2019 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
*/

// Cyclic Rotation problem statement:

