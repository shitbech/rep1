package cn.itcast.domain;

import java.io.Serializable;

/**
 * @Description: JAVA类作用描述
 * @Author :胡辉
 * @CreatDate: 2019/3/21 19:32
 * @Version : 1.0
 */
public class Account implements Serializable {
        /**
         * 用户实体类
         * */
        private static final long serialVersionUID = 7355810572012650248L;
        private Integer id;
        private String name;
        private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
