package b12_java_collection_framework.bai_tap;

import javafx.scene.SnapshotParameters;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    static ArrayList<Product> list = new ArrayList<>();

    public static void them() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tên: ");
        String ten = sc.nextLine();
        System.out.println("nhập giá: ");
        double gia = Double.parseDouble(sc.nextLine());
        Product product = new Product(id, ten, gia);
        list.add(product);
    }

    public static void sua() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id cần sửa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {

                System.out.println("nhập id mới: ");
                int idMoi = Integer.parseInt(sc.nextLine());

                System.out.println("nhập tên mới: ");
                String tenMoi = sc.nextLine();

                System.out.println("nhập giá mới: ");
                double giaMoi = Double.parseDouble(sc.nextLine());

                list.get(i).setId(idMoi);
                list.get(i).setTen(tenMoi);
                list.get(i).setGia(giaMoi);

            }
        }

    }

    public static void xoa() {
        int d = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập id cần sửa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                d = i;

            }
            list.remove(d);
        }
    }

    public static void hienThi() {
        for (Product product : list) {
            System.out.println(product.toString());
//            System.out.println("---");
//            System.out.println("Id: " + product.getId());
//            System.out.println("Tên sản phẩm: " + product.getTen());
//            System.out.println("Giá tiền: " + product.getGia());
        }
    }

    static void menu() {
        System.out.println(".....Menu.....");
        System.out.println("1.Thêm");
        System.out.println("2.Sửa");
        System.out.println("3.Xóa");
        System.out.println("4.Hiển Thị");
        System.out.println("5.Tìm kiếm");
        System.out.println("6.Sắp Xếp");
        System.out.println("7.Thoát");
    }

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        while (true) {
            System.out.println("Menu : ");
            menu();
            System.out.println("mời chọn : ");
            int chon = Integer.parseInt(scanner1.nextLine());


            switch (chon) {
                case 1:
                    them();
                    break;
                case 2:
                    sua();
                    break;
                case 3:
                    xoa();
                    break;
                case 4:
                    hienThi();
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 0:
                    System.out.println("thoat");
                    System.exit(0);
                    break;
                default:
                    System.out.println("vui long nhap lai");
                    break;
            }

        }

    }
}
