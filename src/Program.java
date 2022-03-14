public class Program {
    public static int areaOrPerimeter (int l, int w) {
        if (l == w)
        {
            return l*4;
        }
        else
            return 2 * l + 2 * w;
    }




    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(5, 12));
        System.out.println(areaOrPerimeter(8, 3));
        System.out.println(areaOrPerimeter(11, 11));
        System.out.println(areaOrPerimeter(4, 19));
        System.out.println(areaOrPerimeter(30, 30));
    }
}