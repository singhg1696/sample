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


        //Loop to display reverse array

        int z[]=exampleMain.reverseArray(y);
        System.out.println(z);
        exampleMain.handleString();

    }

    public int arrayAddition(int a[]) {

        int sum = 0;
        for (int x : a)
        {
            sum= sum+ x;
        }
            return sum;
    }

    public int[] reverseArray(int[] arr){

        int rev[]=new  int[arr.length];
        int rev_index= arr.length-1;
        for (int i=0;i<arr.length;i++)
        {
            rev[rev_index--]=arr[i];     //for each loop
        }
       return rev;

    }

    public void handleString()
    {
      String s1= "Gurwinder Singh";
      char Result=s1.charAt(5);
      boolean Contains= s1.contains("in");
      boolean endsWith = s1.endsWith("gh");
      String replaceWith=s1.replace("Gurwinder Singh","Guri");
      int length=s1.length();
      int index=s1.indexOf("S");
      String uppercase=s1.toUpperCase();

        System.out.println("Result is  :"+Result);
        System.out.println("Contains :"+ Contains);
        System.out.println("Ends with :"+endsWith);
        System.out.println("Replaced Chracter: "+replaceWith);
        System.out.println("Length is : "+length);
        System.out.println("Index : "+index);
        System.out.println("Upper case: "+ uppercase);

    }
}
