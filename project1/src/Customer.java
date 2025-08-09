/* 
 * 5. Customer Class
 * It has a 'has a' relationship with DiscountPolicy
 * This class represents a customer with an ID, name, and a DiscountPolicy.
 */

public class Customer {
    private int id;
    private String name;
    private DiscountPolicy discountPolicy;

    public Customer(int id, String name, DiscountPolicy discountPolicy) {
        if (id < 0)
            throw new IllegalArgumentException("Customer id must be non-negative.");
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Customer name must not be null or blank.");
        if (discountPolicy == null)
            throw new IllegalArgumentException("Customer must have a discount policy.");
        this.id = id;
        this.name = name;
        this.discountPolicy = discountPolicy;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public DiscountPolicy getDiscountPolicy() {
        return discountPolicy;
    }

    public void setDiscountPolicy(DiscountPolicy discountPolicy) {
        if (discountPolicy == null)
            throw new IllegalArgumentException("Customer must have a discount policy.");
        this.discountPolicy = discountPolicy;
    }

    @Override
    public String toString() {
        return "Customer{id= " + id + ", name= " + name + ", discountPolicy= " + discountPolicy + "}";
    }
}
