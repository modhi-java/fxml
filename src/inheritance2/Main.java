package inheritance2;

public class Main {


    public static void main(String[] args) {

        // الذي لا يأخذ باراميترات B باستخدام كونستركتور الكلاس B هنا قمنا بإنشاء كائن من الكلاس
        B b1 = new B();
        System.out.println("Here the constructor generate these values for the object b1:");
        System.out.println("x: " + b1.x);
        System.out.println("y: " + b1.y);

        System.out.println();

        // الذي يأخذ 2 باراميتر B باستخدام كونستركتور الكلاس B هنا قمنا بإنشاء كائن من الكلاس
        B b2 = new B(47, 13);
        System.out.println("Here the constructor generate these values for the object b2:");
        System.out.println("x: " + b2.x);
        System.out.println("y: " + b2.y);

    }
    }
