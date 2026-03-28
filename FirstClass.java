import java.util.*;
// class FirstClass{
        /*int age = 12;
        if(age >= 18){
            System.out.println("you are adult");
        }
        else{
            System.out.println("not adult");

        }*/


        /*int a = 3;
        int b = 4;
        if(a >= b){
            System.out.println("a is largest of 2");

        }
        else{
            System.out.println("b is largest of 2");
        }*/


        /*Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("even number");


        }
        else{
            System.out.println("odd number");
        } */


        /*int age = 18;

        if(age >= 18){
            System.out.println("you are adult");


        }
        else if(age >= 13 && age < 18){
            System.out.println("you are teen");

        }

        else{
            System.out.println("you are not adult");
        }*/



        /*Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if(income < 500000){
            tax = 0;

        }
        else if(income >= 500000 && income < 1000000){
            tax = (int) (income * 0.2);
        }

        else{
            tax = (int) (income * 0.3);
        }

        System.out.println("your tax is :" + tax);
         */
        


        /*int a = 40 , b = 8 , c = 20;
        if(a >= b && a >= c){
            System.out.println("a is largest of 3");
        }

        else if(b>= c){
            System.out.println("b is largest of 3");

        }

        else{
            System.out.println("c is largest of 3");
        } */


        // TERNERY OPERATOR //

        /*int number = 4;
        String type = (number % 2 ) == 0 ? "even" : "odd";
        System.out.println(type); */



        /*int marks = 67;
        String reportcard = marks >= 33 ? "pass" : "fail";
        System.out.println(reportcard); */


        // SWITCH STATEMANT //


        /*int number = 1;
        switch(number){
            case 1: System.out.println("samosaa");
            break;
            case 2: System.out.println("kachori");
            break;
            case 3: System.out.println("pakodi");
            break;


            default : System.out.println("we lealize we are dreaming");

        } */


        // CALCULATAR //

        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);

        switch(operator){ 
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;

            default : System.out.println("wrong operator");

        } */


        //LOOPS //

        /*int counter = 0;
        while(counter < 100 ){
            System.out.println("hello world");
            counter++;


        }
        System.out.println("print hello world * 100"); */



        /*int counter = 0;
        while(counter < 201){
            System.out.println("i love you mamta");
        } */



        /*int counter = 1;
        while(counter <= 10){
            System.out.println(counter);
            counter++;
        } */






         /*Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;

        while(counter <= range){
            System.out.println(counter);
            counter++;
        }
        System.out.println(); */




        /*Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= counter){
            sum += i;
            i++;

        }
        System.out.println(sum); */




    
        /*for(int i = 1; i <=101; i++){
            System.out.println("mamta");
        } */


        /*for(int line = 1; line <= 4; line++){
            System.out.println("* * * *");
        } */




        /*int n = 18776;
        while(n > 0){
            int lastdigit = n%10;
            System.out.println(lastdigit + " ");
            n = n/10;


        }
        System.out.println(); */



        /*int n = 10899;
        int rev = 0;

        while(n > 0){
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n/10;

        }
        System.out.println(rev); */


        // DO WHILE LOOP//

        
        /*int counter = 1;
        do{
            System.out.println("i love mamta");
            counter++;
        }while(counter <= 10); */


        //BREAK STATEMANT //

        /*for(int i = 1; i <= 5;  i++){
            if (i == 3){
            break;

            }

            System.out.println(i);


        }
        System.out.println("i am out of the loop"); */

        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);*/


        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.println(product);*/

        /*int age = 22;
        if(age >= 18){
            System.out.print("adult");

        }
        else{
            System.out.print("sexy");
        }*/



        /*int a = 22;
        int b = 33;
        if(a>b){
            System.out.println("a is largest of 2");
        }
        else{
            System.out.println("b is largest of 2");
        }*/


        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }*/


        /*Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if(income<500000){
            tax = 0;
        }
        else if(income >= 500000 && income<1000000){
            tax = (int)(income*0.2);
        }

        else{
            tax =(int)(income*0.3);
        }

        System.out.println("your tax is " + tax);*/

        //  int a = 7;
        //  int b = 6;
        //  int sum = a+b;
        //  System.out.println(sum);

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(n);

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

        // Scanner sc = new Scanner (System.in);
        // int r = sc.nextInt();
        // float area = 3.14f * r * r;
        // System.out.print(area);

        // int a = 4;
        // int b = a++;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(a);

        // int a = 4;
        // int b = ++a;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(a);

        // int a = 10;
        // int b  = 10;
        // System.out.println(a == b);

        // int age= 18;
        // if(age >= 18){
        //     System.out.println("tum bde ho gye hoooooo");
        // }
        // else{
        //     System.out.println("tumse na ho payega ");
        // }

        // int a = 4;
        // int b = 45;
        // if(a > b ){
        //     System.out.println("a bda hai bhaisab ");
        // }
        // else{
        //     System.out.println("b bda hai bete a se ");
        // }

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // if(a%2 == 0 ){
        //     System.out.print(a + " is even number");
        // }else{
        //     System.out.print(a + " is odd number");
        // }

        // int a = 19 ;
        // if(a > 18 ){
        //     System.out.println("a bda ho gya haui bhaisab ");
        // }
        // else if(a > 13){
        //     System.out.println("a bchqa hai ");
        // }
        // else{
        //     System.out.println("huuuuu");
        // }

        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax;
        // if(income < 500000){
        //     tax = 0;
        // }
        // else if(income >= 500000 && income <= 1000000){
        //     tax = (int)(income*0.2);
        // }
        // else{
        //     tax = (int)(income*0.3);
        // }
        // System.out.println("your tax is = " + tax);

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // if(a >= b && a >= c){
        //     System.out.println("a is largest of 3");
        // }
        // else if(b >= c){
        //     System.out.println("b is largest of 3");
        // }
        // else{
        //     System.out.println("c is largest of 3");
        // }

        // int marks = 45;
        // String reportcard = marks >= 33 ? "pass" : "fail";
        // System.out.println(reportcard);

        // int number = 0;
        // switch(number){
        //     case 1: System.out.println("samosa");
        //     break;
        //     case 2: System.out.println("chatni");
        //     break;
        //     default:System.out.println("kuch nhi bhag ja bhai");
        // }

        //CALCULATER
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // char operator = sc.next().charAt(0);

        // switch(operator){
        //     case '+': System.out.println(a+b);
        //     break;
        //     case '-': System.out.println(a-b);
        //     break;
        //     case '*': System.out.println(a*b);
        //     break;
        //     case '/': System.out.println(a/b);
        //     break;
        //     case '%': System.out.println(a%b);
        //     break;
        //     default: System.out.println("bhagggggggg jaaaaaaaa");
        // }

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // if(num >= 1){
        //     System.out.println(num + "is positive");
        // }
        // else if(num < 0){
        //     System.out.println(num + "is nagative");
        // }
        // else{
        //     System.out.println("num is zero");
        // }

        // int year = 1600;
        // if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        //     System.out.println("leap year");
        // }else{
        //     System.out.println("nhi hai");
        // }

        // int counter = 0;
        // while( counter < 100 ){
        //     System.out.println("i love you momo" + counter);
        //     counter++;
        // }

        // int i = 1;
        // while(i < 11){
        //     System.out.println(i);
        //     i++;
        // }

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int i = 1;
        // while(i <= n){
        //     System.out.println(i);
        //     i++;
        // }
        // System.out.println();

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int sum = 0;
        // int i = 1;
        // while(i <= n){
        //     sum = sum + i;
        //     i++;
        // }
        // System.out.println(sum);

        // for(int i = 1; i<100; i++){
        //     System.out.println("i love you momo");
        // }

        // for(int line = 1; line <=4; line++){
        //     System.out.println("****");
        // }

        // int n = 109999;
        // int rev = 0;
        // while(n > 0){
        //     int lastd = n%10;
        //     rev = (rev*10) + lastd;
        //     n  = n/10;
        // }
        // System.out.println(rev);

        // int i = 1;
        // do{
        //     System.out.println("momo");
        //     i++;
        // }while(i <=10);


        // for(int i=1; i <=5; i++){
        //     if(i == 3){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("out the loop");

        // Scanner sc = new Scanner(System.in);
        // do {
        //     int n = sc.nextInt();
        //     if(n%10 == 0){
        //         break;
        //     }
        //     System.out.println(n);
        // }while(true);

        // for(int i = 1; i <= 10 ; i++){
        //     if(i == 7){
        //         continue;
        //     };
        //     System.out.println(i);
        // };

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // if( n == 2){
        //      System.out.println("n is prime");

        // }else{
        //     boolean isprime = true;
        //      for(int i = 2; i <= n-1; i++ ){
        //         if(n%i == 0){
        //             isprime = false;
        //         }
        //      }
        //    if(isprime == true){
        //         System.out.println("n is prime number");
        //     }else{
        //        System.out.println("n is not prime");
        //     }
        //  }

        // for(int i = 1; i <= 4; i++ ){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 4; i >=1; i--){
        //     for(int j = 1; j <=i; j++){
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i <= 4; i++ ){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // char ch = 'A';

        // for(int i = 1; i <=4; i ++){
        //     for(int j= 1; j <= i; j++){
        //         System.out.print(ch);
        //         ch++;

        //     }
        //     System.out.println();
        // }


        // public static int calculateSum(int num1, int num2){
        //     int sum = num1 + num2;
        //     return sum;
        // }

        // public static void main (String args[]){
        //     Scanner sc = new Scanner(System.in);
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
        //     int result = calculateSum(a,b);
        //     System.out.println(result);

        // }

        // public static int boss(int num1, int num2, int num3){
        //     int sum = num1 + num2 + num3;
        //     return sum;
        // }

        // public static void main(String args[]){
        //     Scanner sc = new Scanner(System.in);
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
        //     int c = sc.nextInt();
        //     int finalBoss = boss(a,b,c);
        //     System.out.println(finalBoss);
        // }

        // public static void swap(int a, int b){
        //     int temp = a;
        //     a = b;
        //     b = temp;
        //     System.out.println("a = " + a);
        //     System.out.println("b = " + b );
        // }

        // public static void main(String args[]){
        //     int a = 23;
        //     int b = 24;
        //     swap(a,b);
        // }

        // public static int multi(int a, int b){
        //     int product =  a * b;
        //     return product;

        // }

        // public static void main(String args[]){
        //     int a = 3;
        //     int b = 4;
        //     int prod = multi(a,b);
        //     System.out.println(prod);

        // }

    // public static int factorial(int x){
    //     int f = 1;
    //     for(int i = 1; i <= x; i++){
    //         f = f * i;
    //     }
    //     return f;
    // }

    // public  static void main(String args[]){
    //     System.out.println(factorial(3));

    // }


// public static int factorial(int x){
//          int f = 1;
//     for(int i = 1; i <= x; i++){
//               f = f * i;
//    }
//    return f;

//   }

// public static void main(String args[]){
// int binomialCoficiant = factorial(5) / ( factorial(2 )* factorial (5 - 3));
// System.out.println(binomialCoficiant);
// }


// public static boolean isPrime(int n){
//     boolean isPrime = true;
//     for(int i = 2; i<= n-1; i++){
//         if(n%i == 0){
//             isPrime = false;
//             break;
//         }
//     }
//     return isPrime;
// }

// public static void main(String args[]){
//    System.out.println(isPrime(11));
// }



// public static boolean isPrime(int n){
//     for(int i = 2; i <= Math.sqrt(n); i++){
//         if(n % i == 0){
//            return false;
//         }
//     }

//     return true;
// }

// public static void main(String args[]){
//     System.out.println(isPrime(73));
// }



// public static boolean isPrime(int n){
//     for(int i = 2; i <= Math.sqrt(n); i++){
//         if(n % i == 0){
//            return false;
//         }
//     }

//     return true;
// }

// public static void primeInRange(int n){
//     for(int i = 1; i<= n; i++){
//         if(isPrime(i)){
//             System.out.println(i + " ");
//         }
      
//     }
//     System.out.println(); 
// }

// public static void main(String args[]){

//    primeInRange(20);
// }



        




        

        










        
        



    
        




                                                                                                                                                                                                                                




       






         































































public class FirstClass {

    // 🔹 Variables (Class + Object concept)
    int a = 10, b = 5;

    // 🔹 Constructor
    FirstClass() {
        System.out.println("Constructor Called!");
    }

    // 🔹 Operators Demo
    void operatorsDemo() {
        System.out.println("Operators Demo:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }

    // 🔹 Complex Arithmetic
    void complexAdd() {
        int r1 = 2, i1 = 3;
        int r2 = 4, i2 = 5;

        int real = r1 + r2;
        int imag = i1 + i2;

        System.out.println("Complex Addition: " + real + " + " + imag + "i");
    }

    // 🔹 Matrix Addition (Loop)
    void matrixAdd() {
        int a[][] = {{1,2},{3,4}};
        int b[][] = {{5,6},{7,8}};
        int c[][] = new int[2][2];

        System.out.println("Matrix Addition:");

        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 🔹 Control + Iteration
    void controlDemo(int num) {

        // if-else
        if(num > 0)
            System.out.println("Positive Number");
        else
            System.out.println("Negative Number");

        // switch
        switch(num) {
            case 0:
                System.out.println("Zero");
                break;
            default:
                System.out.println("Not Zero");
        }

        // loop
        System.out.print("Loop: ");
        for(int i=1; i<=5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 🔹 Recursion (Tower of Hanoi)
    void hanoi(int n, char source, char destination, char auxiliary) {
        if(n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        hanoi(n-1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        hanoi(n-1, auxiliary, destination, source);
    }

    // 🔹 Main Method
    public static void main(String[] args) {

        // Object Creation
        FirstClass obj = new FirstClass();

        // Operators
        obj.operatorsDemo();

        // Complex
        obj.complexAdd();

        // Matrix
        obj.matrixAdd();

        // Control + Loop
        obj.controlDemo(5);

        // Tower of Hanoi
        System.out.println("Tower of Hanoi:");
        obj.hanoi(3, 'A', 'C', 'B');
    }
}
































































        
    // }
