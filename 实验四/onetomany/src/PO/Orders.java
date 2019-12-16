
package PO;

import java.io.Serializable;


public class Orders implements Serializable {
    private Integer id;
    private String orderno;//订单号
    private Double money;//所需资金
    private Customer customer;//关联另外一个PO
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getOrderno() {
        return orderno;
    }
    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }
    public Double getMoney() {
        return money;
    }
    public void setMoney(Double money) {
        this.money = money;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


}
