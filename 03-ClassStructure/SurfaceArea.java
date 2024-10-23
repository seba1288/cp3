public class SurfaceArea {
    static int rectangle(int a, int b){
        return a*b;
    }
    static float circle(int r){
        return (float) (Math.PI * r * r);
    }
    static int triangle(int a, int h){
        return (a*h)/2;
    }
}
