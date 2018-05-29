package overloading1;

public class Test {
    public static void main(String[] args) {

        MyMath m = new MyMath();     // لإستدعاء الدوال منه MyMath هنا قمنا بإنشاء كائن من الكلاس

        System.out.println("The max number is: " +m.max(5, 20));           // هنا سيتم إستدعاء الدالة التي تأخذ 2 باراميتر
        System.out.println("The max number is: " +m.max(5, 20, 15));       // هنا سيتم إستدعاء الدالة التي تأخذ 3 باراميترات
        System.out.println("The max number is: " +m.max(5, 20, 15, 30));   // هنا سيتم إستدعاء الدالة التي تأخذ 4 باراميترات

    }
}
