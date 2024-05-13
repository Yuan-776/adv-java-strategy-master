package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private DiscountStrategy discountStrategy;

    public CustomerOrder(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        setDiscountStrategy(discountType);
    }

    public double getBillAmount() {
        return discountStrategy.applyDiscount(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    private void setDiscountStrategy(char discountType) {
        switch (discountType) {
            case 'S':
            case 's':
                this.discountStrategy = new SaleDiscountStrategy();
                break;
            case 'D':
            case 'd':
                this.discountStrategy = new RegularDiscountStrategy();
                break;
            case 'L':
            case 'l':
                this.discountStrategy = new LiquidationDiscountStrategy();
                break;
            default:
                throw new IllegalArgumentException("Invalid discount type");
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", billAmount=" + billAmount +
                ", discountType=" + discountStrategy.getClass().getSimpleName() +
                '}';
    }
}
