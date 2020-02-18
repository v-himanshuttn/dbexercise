public class Ques9enum {

    public  enum House {
        A(20000), B(40000), C(300000);

        private int price;

         House(int price) {
            this.price = price;
        }

        public static void getPrice() {
            for (House h : House.values()) {
                System.out.println(h + " " + h.price);
            }
        }
    }

        public static void main(String[] args) {
            //by method
            System.out.println("House and their prices");
            House.getPrice();

        }
    }


