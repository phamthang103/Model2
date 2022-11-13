package BaiTap.controller;

import BaiTap.service.ProductService;

import java.util.Scanner;

public class MainProduct {
    private static ProductService productService = new ProductService();

    public static void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống" +
                    "\n 1.Add" +
                    "\n 2.Edit" +
                    "\n 3.Delete" +
                    "\n 4.Display" +
                    "\n 5.SearchName" +
                    "\n 6.SortCost" +
                    "\n 7. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Chức năng thêm sản phẩm");
                    productService.add();
                    break;
                case 2:
                    System.out.println("Sửa sản phẩm theo Id");
                    productService.edit();
                    break;
                case 3:
                    System.out.println("Xoá sản phẩm theo Id");
                    productService.delete();
                    break;
                case 4:
                    System.out.println("chức năng hiển thị danh sách sản phẩm");
                    productService.display();
                    break;
                case 5:
                    System.out.println("chức năng tìm kiếm sản phẩm theo tên");
                    System.out.println(" nhap ten can tim ");
                    String ten = scanner.nextLine();
                    productService.searchByName(ten);
                    break;
                case 6:
                    System.out.println("Chức năng sắp xếp tăng dần giảm dần theo giá");
                    productService.sort();
                    break;
                default:
                    flag = false;


            }

        } while (flag);

    }
}
