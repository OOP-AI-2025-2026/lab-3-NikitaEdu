package org.example.task2;

public class Order {

    private long id;
    private String customer;

    public Order(long id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public String formOrderBill(Cart cart) {

        StringBuilder builder = new StringBuilder();
        builder.append("Order number ").append(id).append(" for customer ").append(customer);
        builder.append("\n------------------\n");

        double sum = 0.0;

        for (int i = 0; i < cart.getIndex(); i++) {

            sum += cart.getContents()[i].getPrice();

            builder.append("Item id: ");
            builder.append(cart.getContents()[i].getId());
            builder.append(" name: ");
            builder.append(cart.getContents()[i].getName());
            builder.append(" price: ");
            builder.append(cart.getContents()[i].getPrice());
            builder.append("\n");
        }

        builder.append("------------------\n");
        builder.append("Total sum: ");
        builder.append(sum);


        return builder.toString();
    }
}