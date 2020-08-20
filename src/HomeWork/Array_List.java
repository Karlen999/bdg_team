package HomeWork;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Array_List {
      public static void main(String[] args) {
          List<Integer> I1 = new ArrayList<>();
          I1.add(0, 1);
          I1.add(1, 2);
          System.out.println(I1);
          List<Integer> I2 = new ArrayList<>();
          I2.add(1);
          I2.add(2);
          I2.add(3);

          I1.addAll(0, I2);
          System.out.println(I1);

          I1.remove(1);
          System.out.println(I1);

          System.out.println(I1.get(0));

          I1.set(3, 15);
          System.out.println(I1);

          List<String> al = new ArrayList<>();
          al.add("Duck1");
          al.add("Duck3");
          al.add(1, "Duck2");
          System.out.println(al);

          al.set(1, "Hippo");
          System.out.println(al);

          al.remove(0);
          al.remove("Duck3");
          System.out.println(al);

          al.add("Cat");
          al.add("Dog");

          //Iterate

          for (int i = 0; i < al.size();i++ ) {
              System.out.print(al.get(i)+ " ");
          }
          System.out.println();

          for (String str : al)
              System.out.print(str + " ");

          System.out.println();

          // List Object

          int n = 5;

          List<Integer> arrlist = new ArrayList<>(n);
          for (int i = 0; i < n; i++) {
              arrlist.add(i);
          }
          System.out.println(arrlist);

          arrlist.remove(0);

          for (Integer integer : arrlist) {
              System.out.print(integer + " ");
          }
      }
}

