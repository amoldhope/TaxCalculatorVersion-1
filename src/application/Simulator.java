package application;

public class Simulator {

    public static void main(String[] args) {
        int finalPrice=0;
        int amountWithGst=0;
        int gst=0;

        int riceQuantity=2,chairQuanity=4;

        for(int i=0;i<riceQuantity;i++){
            Food f1=new Food();
            amountWithGst+=f1.getPrice()*f1.getGst()/100;
            finalPrice=finalPrice+f1.getPrice();

        }

        for(int i=0;i<chairQuanity;i++){
            Furniture fobj=new Furniture();
            amountWithGst+=fobj.getPrice()*fobj.getGst()/100;
            finalPrice=finalPrice+fobj.getPrice();


        }

        System.out.println("total amount = "+finalPrice);
        System.out.println("GST = "+amountWithGst);
        System.out.println("Total amount include GST= "+ (finalPrice+amountWithGst));



    }
}
