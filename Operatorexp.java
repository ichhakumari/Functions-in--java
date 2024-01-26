public class Operatorexp {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c = 20;
        int d = 0;

        // b = a++; // post increment - 1st use/assign value then update menas b=10 then
        // a=11
        // System.out.println(a);
        // System.out.println(b);

        // decrement
        b = --a; // pre increment / decrement - update first then assign
        d = ++c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
