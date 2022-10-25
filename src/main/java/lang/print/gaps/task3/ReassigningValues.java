package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first;
        int second;
        int third;
        first = 1;
        second = 10;
        third = 100;
        System.out.println(first + "\n" + second + "\n" + third);
        int linkToFirst = 15;
        first = linkToFirst;
        int linkToSecond = 6;
        second = linkToSecond;
        int linkToThird = 4;
        third = linkToThird;
        System.out.println(first + "\n" + second + "\n" + third);

        

    }
}
