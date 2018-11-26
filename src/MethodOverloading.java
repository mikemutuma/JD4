public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println(average(67.0,57.0,23.9));
        System.out.println(average(54,7,8));

    }

    public static double average(double a, double b, double c){
        double answer = (a+b+c)/3.0;
        return answer;
    }

    public static Integer average(int a, int b, int c){
        int answer = (a+b+c)/3;
        return answer;
    }

}
