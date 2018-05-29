package inheritance2;

public class A {

    public int x;
    public int y;

    // عند استدعائه y و x يحتوي على كونستركتور يسمح بتمرير قيم أولية للمتغيرات A الكلاس
    // لأنه لا يوجد كونستركتور لا يحتوي على باراميترات Subclass هنا يجب استدعاء هذا الكونستركتور في أي
    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }


}
