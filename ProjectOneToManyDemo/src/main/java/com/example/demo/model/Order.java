package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Order {

@Id
@GeneratedValue
private int id;
private int totalprice;
private boolean status;
private String address;
private String shipdate;
@ManyToOne(cascade = CascadeType.ALL)
Customer customer;
public Customer getCustomer() {
return customer;
}
public void setCustomer(Customer customer) {
this.customer = customer;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public int getTotalprice() {
return totalprice;
}
public void setTotalprice(int totalprice) {
this.totalprice = totalprice;
}
public boolean isStatus() {
return status;
}
public void setStatus(boolean status) {
this.status = status;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public String getShipdate() {
return shipdate;
}
public void setShipdate(String shipdate) {
this.shipdate = shipdate;
}
public Order(int id, int totalprice, boolean status, String address, String shipdate)
{
super();
this.id = id;
this.totalprice = totalprice;
this.status = status;
this.address = address;
this.shipdate = shipdate;
}
public Order() {
super();
// TODO Auto-generated constructor stub
}
@Override
public String toString() {
return "Order [id=" + id + ", totalprice=" + totalprice + ", status=" + status + ", address=" + address
+ ", shipdate=" + shipdate + "]";
}

}
