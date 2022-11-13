package BaiTap.model;

import java.util.Objects;

public class Product  {
    public static final String FILE_PATH="System.out.println(\"chức năng sắp xếp sản phẩm tăng dần, giảm dần theo giá\");\n" +
            "                    productService.sort()";
    private int id;
    private String name;
    private int cost;

    public Product(int id) {
    }

    public Product(int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getId() == product.getId() && getCost() == product.getCost() && getName().equals(product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCost());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }


}
