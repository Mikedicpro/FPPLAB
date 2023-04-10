package Ass3;

public class MainCustomer {
    public static void main(String[] args) {
        Address billingAddress1=new Address("456 allenford dr","Chicago","IL","89147");
        Address shiipingAddress1= new Address("125 mian st","New York","NY","10001");
        Customer customer1= new Customer("Mik","John","798_45_8989");
        customer1.setBillingAddress(billingAddress1);
        customer1.setBillingAddress(shiipingAddress1);

        Address billingAddress2 = new Address("789 Oak St", "Los Angeles", "CA", "90001");
        Address shippingAddress2 = new Address("321 Pine St", "Chicago", "IL", "60601");
        Customer customer2 = new Customer("Jane", "Smith", "222-22-2222");
        customer2.setBillingAddress(billingAddress2);
        customer2.setShippingAddress(shippingAddress2);

        Address billingAddress3 = new Address("555 Maple St", "Chicago", "IL", "60601");
        Address shippingAddress3 = new Address("444 Birch St", "Miami", "FL", "33101");
        Customer customer3 = new Customer("Bob", "Johnson", "333-45-54544");
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
    }
}
