package com.kirthika;

import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int [] e){
        this.elements=e;
    }

    public int computeDifference(){
        maximumDifference=0;
        for(int i=0;i<elements.length;i++){
            for(int j=0;j<elements.length;j++){
                int diff=(Math.abs(elements[i]-elements[j]));
                maximumDifference=(diff>maximumDifference)?diff:maximumDifference;
            }
        }
        return maximumDifference;
    }
}

    public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
