package Inheritance;

public class B extends A {                             // A يرث من الكلاس B هنا قلنا أن الكلاس

    public int x = 20;                                 // مع وضع قيمة مختلفة له A هنا قمنا بتعريف نفس المتغير الموجود في الكلاس

    public void printBoth() {                          // عند استدعاء هذه الدالة سيتم عرض الأشياء التالية
        System.out.println("x in B contain: " +x);             // B الموجودة في الكلاس x هنا سيتم عرض قيمة الـ
        System.out.println("x in B contain: " +this.x);        // B الموجودة في الكلاس x هنا سيتم عرض قيمة الـ
        System.out.println("x in A contain: " +super.x);       // A الموجودة في الكلاس x هنا سيتم عرض قيمة الـ
    }

}