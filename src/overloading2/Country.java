package overloading2;

public class Country {

    public String name;
    public double area;
    public long population;

    // الكونستركتور الأول لا يأخذ باراميترات
    public Country() {

    }

    // الكونستركتور الثاني يتيح لك تحديد إسم البلد مباشرةً عند إنشاء الكائن
    public Country(String n) {
        name = n;
    }

    // الكونستركتور الثالث يتيح لك تحديد إسم البلد و مساحته مباشرةً عند إنشاء الكائن
    public Country(String n, double a) {
        name = n;
        area = a;
    }

    // الكونستركتور الرابع يتيح لك تحديد إسم البلد و مساحته و عدد السكان مباشرةً عند إنشاء الكائن
    public Country(String n, double a, long p) {
        name = n;
        area = a;
        population = p;
    }

    // هذه الدالة تعرض جميع المعلومات التي تم إدخالها في الكائن
    public void printInfo() {
        System.out.println("name: " + name);
        System.out.println("area: " + area);
        System.out.println("population: " + population);
    }
}
