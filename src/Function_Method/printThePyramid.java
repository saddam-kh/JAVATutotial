package Function_Method;

public class printThePyramid {
    public static void main(String[] args) {
        printFristPattern ();
//        printSecondPattern ();
//        printThirdPattern ();

    }
    public static void printFristPattern () {

//        System.out.println("*");
//        System.out.println("* *");
//        System.out.println("* * *");
//        System.out.println("* * * *");
//        System.out.println("* * * * *");

        int row = 0;
        while(row<10){
            System.out.print("*");

            int i =0;
            while (i < row){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
        }



    }
    public static void printSecondPattern (){

        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");

    }
    public static void printThirdPattern (){
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");

    }
}
