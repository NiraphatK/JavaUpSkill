/* 
 * 6. Invoice Class
 * This class represents an invoice, linking a customer to a total amount.
 * Relationship 'has a' (must have Customer class)
 */
public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        if (id < 0)
            throw new IllegalArgumentException("Customer id must be non-negative.");

        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null.");
        }

        if (amount < 0)
            throw new IllegalArgumentException("Amount must be non-negative.");

        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null.");
        }
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount < 0)
            throw new IllegalArgumentException("Amount must be non-negative.");
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    // public int getCustomerDiscount() {
    // return customer.getDiscount();
    // }

    // Core bussiness logic: apply the customer's discount policy.
    public double getAmountAfterDiscount() {
        return customer.getDiscountPolicy().applyDiscount(amount);
    }

    @Override
    public String toString() {
        return "Invoice{id= " + id +
                ", customerId= " + getCustomerId() +
                ", customerName= " + getCustomerName() +
                ", originalAmount= " + String.format("%.2f", amount) +
                ", discountAmount= " + String.format("%.2f", getAmountAfterDiscount()) +
                "}";
    }

}
