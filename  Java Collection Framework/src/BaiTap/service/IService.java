package BaiTap.service;

public interface IService {
    void display();
    void add();
    void edit();
    void delete();
    void searchByName();

    void searchByName(String ten);

    void sort();
}
