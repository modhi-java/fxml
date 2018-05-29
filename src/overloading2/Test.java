package overloading2;

public class Test {
    public static void main(String[] args) {

        // هنا كل كائن يمثل بلد ,Country هنا قمنا بإنشاء 4 كائنات من الكلاس
        Country c1 = new Country();                             // c1 هنا سيتم إستدعاء الكونستركور الأول, لن يتم تحديد أي معلومة حول البلد الذي يمثله الكائن
        Country c2 = new Country("KSA");                        // c2 هنا سيتم إستدعاء الكونستركور الثاني, أي سيتم تحديد إسم البلد الذي يمثله الكائن
        Country c3 = new Country("Turkey", 780580);             // c3 هنا سيتم إستدعاء الكونستركور الثالث, أي سيتم تحديد إسم و مساحة البلد الذي يمثله الكائن
        Country c4 = new Country("Lebanon", 10452, 4467000);    // c4 هنا سيتم إستدعاء الكونستركور الربع, أي سيتم تحديد إسم و مساحة و عدد سكان البلد الذي يمثله الكائن

        // لعرض خصائص جميع الكائنات printInfo() هنا قمنا باستدعاء الدالة
        c1.printInfo();
        c2.printInfo();
        c3.printInfo();
        c4.printInfo();

    }

}
