    package ex_01_Java_Basic;

    import java.util.Scanner;

    public class Lab006_table_using_printf {
        public static void main(String[] args) {
           /* Print the table of 9 by using the printf command
            int a = 10; System.out.printf("You variable is %d",a);
            int table = 9
            9×1 = 9
            9×2 = 18
    …
            9×10 = 90
            table of 9 is
            9*1=9
            .
            .
            .
            .
            .9*10=90

            */
            Scanner scan = new Scanner(System.in);
    //        System.out.println("Enter the number for table: ");
    //        int Table = scan.nextInt();
    //        System.out.println(Table);
    //        System.out.println(Table * 2);
    //        System.out.println(Table * 3);
    //        System.out.println(Table * 4);
    //        System.out.println(Table * 5);
    //        System.out.println(Table * 6);
    //        System.out.println(Table * 7);
    //        System.out.println(Table * 8);
    //        System.out.println(Table * 9);
    //        System.out.println(Table * 10);

    //        System.out.println("Enter the number for table: ");
    //        int Table = scan.nextInt();
    //        System.out.printf("%d%n",Table);
    //        System.out.printf("%d%n",Table * 2);
    //        System.out.printf("%d%n",Table * 3);
    //        System.out.printf("%d%n",Table * 4);
    //        System.out.printf("%d%n",Table * 5);
    //        System.out.printf("%d%n",Table * 6);
    //        System.out.printf("%d%n",Table * 7);
    //        System.out.printf("%d%n",Table * 8);
    //        System.out.printf("%d%n",Table * 9);
    //        System.out.printf("%d%n",Table * 10);

            System.out.println("Enter the number for table: ");
            int Table = scan.nextInt();
            // 9 * 1 = 9
            System.out.printf("%d * 1 = %d%n", Table, Table);
            System.out.printf("%d * 2 = %d%n", Table, Table * 2);
            System.out.printf("%d * 2 = %d%n", Table, Table * 3);
            System.out.printf("%d * 2 = %d%n", Table, Table * 4);
            System.out.printf("%d * 2 = %d%n", Table, Table * 5);
            System.out.printf("%d * 2 = %d%n", Table, Table * 6);
            System.out.printf("%d * 2 = %d%n", Table, Table * 7);
            System.out.printf("%d * 2 = %d%n", Table, Table * 8);
            System.out.printf("%d * 2 = %d%n", Table, Table * 9);
            System.out.printf("%d * 2 = %d%n", Table, Table * 10);
        }
    }
