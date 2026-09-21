package prac;

public class Main {
    static void main(String[] args) {

//        Payment payment;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Which payment Method you want to use rzp or stripe : ");
//
//        String method = scanner.nextLine();
//
//        scanner.close();
//
//        if(method.equals("rzp")){
//            payment = new RzpPaymentService();
//        }
//
//        else if(method.equals("stripe")){
//            payment = new StripePaymentService();
//        }
//
//        else{
//            System.out.println("no payment method chosen");
//            return;
//        }
//
//        payment.pay();


        Employee e1 = new FullTimeEmp("nikhil",1,50);


        e1.showSal();

        Employee e2 = new Intern("n1",100,50);

        e2.showSal();

    }
}
