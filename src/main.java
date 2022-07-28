public class main {

    //Patika.dev egitim kampi proje odevidir.

    // f(1) = 1
    // f(2) = 1
    // f(3) = f(2) + f(1) = 2
    // f(n) = f(n-1) + f(n-2)



    static int fib(int n){
        if(n==1 || n==2){
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {

        System.out.println(fib(6));

    }
}
