//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //task1
      System.out.println("Завдання 1");
      for (int i=500; i<=650; i=i+10){
          System.out.println(i);
      }
      int n=500;
      while (n<=650){
          System.out.println(n + " ");
          n=n+10;
      }
      int m=500;
      do{
          System.out.println(m);
          m=m+10;
      } while (m<=650);


      //task2
        System.out.println("ЗАВДАННЯ 2");
        for(int a=2; a<5000; a=2*a-1){
            System.out.println(a);
        }

        //task3
        System.out.println("Завдання 3");
        int k=10;
        for (int i=1; i<=k; i++){
            if (k % i==0) {
                System.out.println(i);
            }
        }

        //task4
        System.out.println("Завдання 4");
        int f=1;
        for (int s=1; s<=10; s++) {
            f = f * s;
        }
        System.out.println(10 + "!= " + f);
        int z=1;
        int i=1;
        while (i<=10){
            z=z*i;
            i++;
        }
        System.out.println("10!= " + z);

        //task5
        System.out.println("Завдання 5");
        int p=0;
        for (int g=0; g<24; g++) {
            for (int h = 0; h < 60; h++) {
                if (g / 10  == h % 10 && g % 10 == h / 10 ) {
                    p++;
                }
            }
        }
        System.out.println(p);
    }
}