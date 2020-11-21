package entities;

public class OrderItem {
    
    private Integer quantity;
    private Double price;

    private Product product;


    public OrderItem() {
    }


    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "{" +
            " quantity='" + getQuantity() + "'" +
            ", price='" + getPrice() + "'" +
            ", product='" + getProduct() + "'" +
            "}";
    }

}
