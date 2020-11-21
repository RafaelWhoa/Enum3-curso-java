package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
    
    private Date moment;
    private OrderStatus status;

    private Client client;
    List<OrderItem> items = new ArrayList<>();


    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return this.items;
    }

    @Override
    public String toString() {
        return "{" +
            " moment='" + getMoment() + "'" +
            ", status='" + getStatus() + "'" +
            ", client='" + getClient() + "'" +
            ", items='" + getItems() + "'" +
            "}";
    }



}
