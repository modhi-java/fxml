package overloading1;

public class MyMath {


    // هذه الدالة تعطيها رقمين فترجع لك العدد الأكبر بينهما
    public double max(double a, double b) {
        if (a > b)
            return a;
        else
            return b;
    }

    // هذه الدالة تعطيها ثلاثة أرقام فترجع لك العدد الأكبر بينهم
    // و هي تعتمد على الدالة السابقة لمقارنة أول عددين مع العدد الثالث
    public double max(double a, double b, double c) {
        double s = max(a, b);

        if (s > c)

            return s;
        else
            return c;
    }

    // هذه الدالة تعطيها ثلاثة أرقام فترجع لك العدد الأكبر بينهم
    // و هي تعتمد على الدالتين السابقتين لمقارنة أول ثلاث أعداد مع العدد الرابع
    public double max(double a, double b, double c, double d) {
        double f = max(a, b, c);
        if (f > d)
            return f;
        else
            return d;
    }

}
