package com.gurwinder;

public class ExampleMain {
    public static void main(String[] args)
    {
     int a[]= new int[5];

        int y[]={10,20,30,40,50};

     a[0]=10;
     a[1]=20;
     a[2]=30;
     a[3]=40;
     a[4]=50;

     for (int i=0;i<a.length;i++){
         System.out.println("a[] : "+a[i]);
     }
        for (int i=0;i<y.length;i++){
            System.out.println("y[] : "+y[i]);
        }

        ExampleMain exampleMain= new ExampleMain();
        int s=exampleMain.arrayAddition(a);
        System.out.println("TotalSum of array is "+s);
    }

    public int arrayAddition(int a[]) {

        int sum = 0;
        for (int x : a)
        {
            sum= sum+ x;
        }
            return sum;
    }
}
