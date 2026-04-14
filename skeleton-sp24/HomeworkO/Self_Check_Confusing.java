public class Self_Check_Confusing {
    public static void method1() {
        System.out.println("I am method 1.");
    }
    public static void method2() {
        method1();
        System.out.println("I am method 2.");
    }
    public static void main(String[] args){
        method2();
        method1();
    }
}



/*
As we can see here, we need to figure out how the terminal run this code
The frist answer: I am method1.
                  I am method2.
                  I am method1.
 */
