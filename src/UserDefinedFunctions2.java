public class UserDefinedFunctions2 {

    public static void main(String[] args) {

        System.out.println(gawa(20,45,89));
        System.out.println(gawa(30,21,67));
        System.out.println(ongeza(50,90,40));

    }

    public static double gawa(double a, double b, double c){
        double jibu = (a+b+c)/3.0;
        return jibu;
    }

    public static Integer ongeza (int a, int b, int c){
        int answer = a+b+c;
        return answer;
    }

}
