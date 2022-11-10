public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
            if (this.price >= 600 && this.price <= 1000 ) {
                System.out.println("The price is good.");
                if (this.price > 1000) {
                    System.out.println("This notebook is expensive.");
                }
            }
        }
    }

    public void checkWeight() {
        if (this.weight < 500) {
            System.out.println("This notebook is very light.");
            if (this.weight >= 500 && this.weight <= 900 ) {
                System.out.println("This notebook is not very heavy.");
                if (this.weight > 900) {
                    System.out.println("This notebook is very heavy.");
                }
            }
        }
    }

    public void checkPriceAndYear() {
        if (this.price < 600 && this.year <=2016) {
            System.out.println("This notebook is very cheap and very old.");
            if (this.price >= 600 && this.price <=700 && this.year <= 2019 ) {
                System.out.println("This notebook is cheap and old.");
                if (this.price > 700 && this.price <= 1000 && this.year >= 2020) {
                    System.out.println("This notebook is expensive and quite new.");
                } else if (this.price > 1000 || this.year >= 2022) {
                    System.out.println("This notebook is very expensive and brand new.");
                }
            }
        }
    }
}