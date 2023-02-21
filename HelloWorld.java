public class HelloWorld {
// This is a simple Java program.
// FileName : "HelloWorld.java".

     // Your program begins with a call to main().
     // Prints "Hello, World" to the terminal window.
     public static void main(String args[]) {
        System.out.println("Hello, World");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello, World " + i);
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello, World " + i);
        }



        printHello(10);
     }

     private static void printHello(int max) {
         for (int i = 1; i <= max; i++) {
             if (i == 2 || true) {
                 if (i != 3 || i != 4 || i != 3) {
                     System.out.println("Hello, World " + i);
                 }
                 if (i == 3) {
                     System.out.println(i);
                     if (i == 4) {
                         // 4
                     }
                 }
                 if (i == 2) {
                     if (true) {
                         System.out.println("Hello, World " + i);
                     } else {
                         System.out.println("Hello, World " + i);
                     }
                 }
             }
         }

     }

    private static void printHello2(int max) {
        System.out.println("Hello, World ");
    }


}
