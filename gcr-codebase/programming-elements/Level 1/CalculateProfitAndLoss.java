class CalculateProfitAndLoss{
    public static void main(String args[]){
    //cost price and selling price in INR
    double costPrice=129, sellingPrice=191;

    //Calculate Profit
    double profit = sellingPrice - costPrice;
    //Calculate Profit Percentage
    double profitPercentage = profit / costPrice * 100;
    
    System.out.println("The Cost Price is INR "+ costPrice +" and Selling Price is INR "+ sellingPrice  +"\n"+
    "The Profit is INR "+ profit +" and the Profit Percentage is "+ profitPercentage);
    }
}