public class RPodejscieTrzecie {
    public static void main(String[] args) {
        int checkedYear = 2022;
        System.out.println("checkedYear");
        if (checkedYear % 4 == 0) {
            System.out.println("Rok " + checkedYear + " jest przestępny");
            if (checkedYear % 100 == 0) {
                System.out.println("Rok " + checkedYear + " jest nieprzestępny");
                if (checkedYear % 400 == 0) {
                    System.out.println("Rok " + checkedYear + " jest przestępny");
                } else
                    System.out.println("Rok " + checkedYear + " jest nieprzestępny");
            } else
                System.out.println("Rok " + checkedYear + " jest przestępny");
        } else
            System.out.println("Rok " + checkedYear + " jest nieprzestępny");
    }
}
