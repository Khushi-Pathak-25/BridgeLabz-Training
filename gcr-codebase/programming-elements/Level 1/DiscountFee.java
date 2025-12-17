class DiscountFee {
    public static void main(String[] args) {
    //Creating variable fee and discountPercent
    int fee=125000,  discountPercent=10;
    
    //Calculate discount and final fee
    double discount= (fee * discountPercent) / 100;
    double finalFee = fee - discount;

    System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+finalFee);
    }
}