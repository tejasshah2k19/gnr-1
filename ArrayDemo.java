import java.util.Scanner;

public class ArrayDemo {
    void intro() {
        // int x[10];
        int j[];// no size is valid
        j = new int[10];
        int size = 3;// user->scan
        // size
        int p[] = new int[5]; // we must has to use new keyword
        int myArray[] = new int[size];
        // 10 size -> index -> 0 , end size-1
        p[0] = 10;
        p[1] = 20;
        p[2] = 30;
        //
        // System.out.println(p[0]);
        // System.out.println(p[1]);
        Scanner scr = new Scanner(System.in);
        for (int i = 0; i < p.length; i++) {
            System.out.println("Enter value");
            // p[i] = i * 10;
            p[i] = scr.nextInt();
        }

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }

    }

    void shift(int shiftCount) {
        int a[] = { 10, 20, 30, 40, 50 };

        

        for (int x = 1; x <= shiftCount; x++) {
            int tmp = a[0];
            for (int i = 0; i < a.length - 1; i++)
                a[i] = a[i + 1];

            a[a.length - 1] = tmp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        new ArrayDemo().shift(2);
    }
}

// 1 int x;

// 15 int x[] ;

// java ->

// 5 -> 10 22 30 40 50 ->

// 1) sum of all the elements in an array: 150
// 2) find out the max num from array : 50
// 3)
// you must have to perform below on even index only [0 is even***]
// if x index elements is divisbly by 3 then add
// 3 in x+1 index
// if x index elements is divisble by 5 then add
// 5 in x+1 index
// if not by 3 or 5 then x+1 elements will flip with negative the value

// e.g 10 13 14 16 18
// 0 2 4 {10}
// 10 18 14 16 18 {14}
// 10 18 14 -16 18


