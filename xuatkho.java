package quanlyvattu;

    import java.util.Scanner;
import java.util.ArrayList;

public class xuatkho extends khovattuxaydung {
    protected String maPhieuXuat, ngayXuat;
    private double soLuongXuat;
    private int thanhTien;


public xuatkho(String tenVatTu, String maVatTu, String maPhieuXuat, double soLuongXuat, String ngayXuat, int thanhTien){
    super(tenVatTu, maVatTu);
    this.maPhieuXuat = maPhieuXuat;
    this.ngayXuat = ngayXuat;
    this.soLuongXuat = soLuongXuat;
    this.thanhTien = thanhTien;
}

public String getMaPhieuXuat() {
    return maPhieuXuat;
}

public void setMaPhieuXuat(String maPhieuXuat) {
    this.maPhieuXuat = maPhieuXuat;
}
public String getNgayXuat() {
    return ngayXuat;
}

public void setNgayXuat(String ngayXuat) {
    this.ngayXuat = ngayXuat;
}

public double getSoLuongXuat() {
    return soLuongXuat;
}

public void setSoLuongXuat(double soLuongXuat) {
    this.soLuongXuat = soLuongXuat;
}
public int getThanhTien() {
    return thanhTien;
}

public void setThanhTien(int thanhTien) {
    this.thanhTien = thanhTien;
}
public static ArrayList<xuatkho> nhapDSXuatKho() {
    try (Scanner sc = new Scanner(System.in)) {
     ArrayList<xuatkho> list = new ArrayList<>();

        System.out.print("Nhap so luong xuat kho: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin vat tu can xuat thu: " + (i+1));
            System.out.println("Ten vat tu: ");
            String tenVatTu = sc.next();
            System.out.println("Ma vat tu: ");
            String maVatTu = sc.next();
            System.out.println("Ma phieu xuat: ");
            String maPhieuXuat = sc.next();
            System.out.println("So luong xuat: "); 
            double soLuongXuat = sc.nextInt();
            System.out.println("Ngay xuat: ");
            String ngayXuat = sc.next();
            System.out.println("Thanh tien: ");
            int thanhTien = sc.nextInt();

         System.out.println("Ten vat tu: " + tenVatTu);
        System.out.println("Ma vat tu: " + maVatTu);
        System.out.println("Ma Phieu Xuat: " + maPhieuXuat);
        System.out.println("So luong xuat: " + soLuongXuat);
        System.out.println("Ngay xuat: " + ngayXuat);
        System.out.println("Thanh tien: " + thanhTien);
        xuatkho xk = new xuatkho(tenVatTu, maVatTu, maPhieuXuat, soLuongXuat, ngayXuat, thanhTien);
        list.add(xk); 
        } 
                return list;
}
}
// Phương thức hiển thị danh sách vật tư
public static void hienThiDSXuatKho(ArrayList<xuatkho> list) {
    System.out.printf("%-20s%-15s%-10s%-15s%-15s%-20s%-20s\n", "Tên vật tư", "Mã vật tư", "Mã phiếu xuất", "Ngày Xuất","Số Lượng Nhập");
    for (xuatkho xk : list) {
        System.out.printf("%-20s%-15s%-10s%-15d%-15.2f%-20s%-20s\n", xk.getTenVatTu(), xk.getMaVatTu(), xk.getMaPhieuXuat(), xk.getNgayXuat(), xk.getSoLuongXuat());
    }
}
// Phương thức xóa vật tư
public static void xoaMaPhieuXuat(ArrayList<xuatkho> list, String maPhieuXuat) {
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).getMaPhieuXuat().equals(maPhieuXuat)) {
            list.remove(i);
            System.out.println("Đa xoa ma phieu xuat " + maPhieuXuat);
            return;
        }
    }
    System.out.println("Khong tim thay ma phieu xuat" + maPhieuXuat + " de xoa.");
}

// Phương thức sửa thông tin mã phiếu xuất


public static void suamaPhieuXuat(ArrayList<xuatkho> list, String maPhieuXuat) {
    for (xuatkho xk : list) {
        if (xk.getMaPhieuXuat().equals(maPhieuXuat)) {
            try (Scanner sc = new Scanner(System.in)) {
                
                System.out.print("Nhap ma phieu xuat moi: ");
               
                 xk.setMaPhieuXuat(maPhieuXuat);

            }       
            System.out.println("Đa sua thong tin ma phieu xuat" + maPhieuXuat);
            return;
          
    }
    System.out.println("Khong tim thay vat tu co ma " + maPhieuXuat + " de sua.");
}
}
// Phương thức xóa maphieuXuat
public static void xoamaPhieuXuat(ArrayList<xuatkho> list, String maPhieuXuat) {
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).getMaPhieuXuat().equals(maPhieuXuat)) {
            list.remove(i);
            System.out.println("Đa xoa ma phieu xuat " + maPhieuXuat);
            return;
        }
    }
    System.out.println("Khong tim thay ma phieu xuat" + maPhieuXuat + " de xoa.");
}
// Phương thức thêm mã phiếu xuất
public static void themMaPhieuXuat(ArrayList<xuatkho> list) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Ten vat tu: ");
        String tenVatTu = sc.next();
        System.out.print("Ma vat tu: ");
        String maVatTu = sc.next();
        System.out.print("So luong xuat: ");
        double soLuongXuat = sc.nextDouble();
        System.out.print("Thanh tien: ");
        int thanhTien = sc.nextInt();
        System.out.print("Ma phieu xuat: ");
        String maPhieuXuat = sc.next();
        System.out.print("Ngay Xuat: ");
        String ngayXuat = sc.next();

        xuatkho xk = new xuatkho(tenVatTu, maVatTu, maPhieuXuat, soLuongXuat, ngayXuat, thanhTien);
        list.add(xk);
    }

    System.out.println("Đa them vat tu vao danh sach.");
}
}

