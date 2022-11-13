package BaiTap.service;

import BaiTap.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductService implements IService {
    Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Product> productArrayList = new ArrayList<>();

    static {
        productArrayList.add(new Product(1, "a", 2000));
        productArrayList.add(new Product(5, "d", 5000));
        productArrayList.add(new Product(3, "b", 4000));
        productArrayList.add(new Product(8, "c", 1000));
        productArrayList.add(new Product(2, "e", 3000));

    }

    @Override
    public void display() {
        for (Object s : productArrayList) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {
        System.out.println("nhập id san pham");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("nhap gia sản phẩm");
        int cost = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, cost);
        productArrayList.add(product);
        display();
    }

    @Override
    public void edit() {
        display();
        System.out.println("Chọn sản phẩm cần sửa");
        int edit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (edit == productArrayList.get(i).getId()) {
                System.out.println("Nhap id sản phẩm");
                productArrayList.get(i).setId(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập tên sản phẩm");
                productArrayList.get(i).setName(scanner.nextLine());
                System.out.println("Nhập giá sản phầm");
                productArrayList.get(i).setCost(Integer.parseInt(scanner.nextLine()));
                break;
            }
        }
        display();
    }

    @Override
    public void delete() {

    }

    @Override
    public void searchByName() {

    }

    public boolean delete(Product product) {
        display();
        return productArrayList.remove(product);
    }

    @Override
    public void searchByName(String ten) {
        int count = 0;
        for (Product s : productArrayList) {
            if (s.getName().indexOf(ten) >= 0) {
                System.out.println(s);
            } else {
                count++;
            }
            if (count > 0) {
                System.out.println("Tên bạn tim không có");
            }
        }
    }

    @Override
    public void sort() {
        display();
        productArrayList.sort(Comparator.comparing(Product::getCost));
        display();
    }
}
