public class LeapYear {
    public static void main(String[] args) {
    int checkedYear = 2022;
        System.out.println("checkedYear");
        if (checkedYear%4==0){
            System.out.println("Przestępny");
        } else if (checkedYear%100==0) {
            System.out.println("Nie przestępny");
        } else if (checkedYear%400==0) {
            System.out.println("Przestępny");
        } else
            System.out.println("Nie przestępny");
    }
}