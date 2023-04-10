package quanlyvattu;
import java.util.Scanner;
import java.util.ArrayList;
public class bienbanKiemKho extends khovattuxaydung {
    private double soLuongXuat, soLuongTon;
    private String maPhieuXuat,maPhieuNhap;
public bienbanKiemKho(String tenVatTu, String maVatTu, String maPhieuNhap, String maPhieuXuat, double soLuongXuat, double soLuongTon){
    super(tenVatTu, maVatTu);
    this.maPhieuNhap = maPhieuNhap;
    this.maPhieuXuat = maPhieuXuat;
    this.soLuongXuat = soLuongXuat;
    this.soLuongTon = soLuongTon;
}
public String getMaPhieuXuat(){
    return maPhieuXuat;
}
public void setMaPhieuXuat(String maPhieuXuat) {
    this.maPhieuXuat = maPhieuXuat;
}
public String getMaPhieuNhap(){
    return maPhieuNhap;
}
public void setMaPhieuNhap(String maPhieuNhap){
    this.maPhieuNhap = maPhieuNhap;
}
public double getSoLuongXuat() {
    return soLuongXuat;
}

public void setSoLuongXuat(double soLuongXuat) {
    this.soLuongXuat = soLuongXuat;
}
public double getSoLuongTon(){
    return soLuongTon;
}
public void setSoLuongTon(double soLuongTon){
    this.soLuongTon = soLuongTon;
}
// NHAP DANH SACH PHIEU NHAP
public static ArrayList<bienbanKiemKho> nhapDSPhieuNhap() {
    try (Scanner sc = new Scanner(System.in)) {
     ArrayList<bienbanKiemKho> list = new ArrayList<>();

        System.out.print("Nhap so luong phieu nhap: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin phieu nhap thu: " + (i+1));
            System.out.println("Ten vat tu: ");
            String tenVatTu = sc.next();
            System.out.println("Ma vat tu: ");
            String maVatTu = sc.next();
            System.out.println("Ngay nhap: ");
            String ngayNhap = sc.next();
            System.out.println("Ma phieu nhap: ");
            String maPhieuNhap = sc.next();
            System.out.println("So luong nhap: ");
            double soLuongNhap = sc.nextDouble();
            System.out.println("Thanh tien: ");
            double thanhTien = sc.nextDouble();

        System.out.println("Ten Vat Tu: " + tenVatTu);
        System.out.println("Ma Vat Tu =  " + maVatTu);
        System.out.println("Ngay nhap: " + ngayNhap);
        System.out.println("Ma Phieu Nhap: " + maPhieuNhap);
        System.out.println("So luong nhap =  " + soLuongNhap);
        System.out.println("Thanh Tien =  " + thanhTien);
        

            bienbanKiemKho kiemkho = new bienbanKiemKho(tenVatTu, maVatTu, maPhieuNhap, ngayNhap, soLuongNhap, thanhTien);
                list.add(kiemkho);              
            }
           
            return list;
            
    }
    }
    // NHAP DANH SACH PHIEU XUAT
public static ArrayList<bienbanKiemKho> nhapDSPhieuXuat() {
    try (Scanner sc = new Scanner(System.in)) {
     ArrayList<bienbanKiemKho> list = new ArrayList<>();

        System.out.print("Nhap so luong phieu xuat: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin phieu xuat thu: " + (i+1));
            System.out.println("Ten vat tu: ");
            String tenVatTu = sc.next();
            System.out.println("Ma vat tu: ");
            String maVatTu = sc.next();
            System.out.println("Ngay Xuat: ");
            String ngayXuat = sc.next();
            System.out.println("Ma phieu xuat: ");
            String maPhieuXuat = sc.next();
            System.out.println("So luong xuat: ");
            double soLuongXuat = sc.nextDouble();
            System.out.println("Thanh tien: ");
            double thanhTien = sc.nextDouble();

        System.out.println("Ten Vat Tu: " + tenVatTu);
        System.out.println("Ma Vat Tu =  " + maVatTu);
        System.out.println("Ngay xuat: " + ngayXuat);
        System.out.println("Ma Phieu Nhap: " + maPhieuXuat);
        System.out.println("So luong nhap =  " + soLuongXuat);
        System.out.println("Thanh Tien =  " + thanhTien);
        

            bienbanKiemKho kiemkho = new bienbanKiemKho(tenVatTu, maVatTu, maPhieuXuat, ngayXuat, soLuongXuat, thanhTien);
                list.add(kiemkho);              
            }
           
            return list;
            
    }
    }
    // SUA PHIEU XUAT
    
    public static void SuaPhieuXuat(ArrayList<bienbanKiemKho> list, String maPhieuXuat) {
        for (bienbanKiemKho kiemkho : list) {
            if (kiemkho.getMaPhieuXuat().equals(maPhieuXuat)) {
                try (Scanner sc = new Scanner(System.in)) {                

                    System.out.print("Nhap ma phieu xuat moi: ");
                    String maPhieuXuatMoi = sc.next();
                    kiemkho.setMaPhieuXuat(maPhieuXuatMoi);
                
                }
    
                System.out.println("Đa sua thong tin phieu xuat co ma" + maPhieuXuat);
                return;
            }   
        }
        System.out.println("Khong tim thay phieu xuat co ma " + maPhieuXuat + " de sua.");
    }
    // SUA PHIEU NHAP
    
    public static void SuaPhieuNhap(ArrayList<bienbanKiemKho> list, String maPhieuNhap) {
        for (bienbanKiemKho kiemkho : list) {
            if (kiemkho.getMaPhieuNhap().equals(maPhieuNhap)) {
                try (Scanner sc = new Scanner(System.in)) {                   

                    System.out.print("Nhap ma phieu nhap moi: ");
                    String maPhieuXuatMoi = sc.next();
                    kiemkho.setMaPhieuXuat(maPhieuXuatMoi);
    
    
                    
                }
    
                System.out.println("Đa sua thong tin phieu nhap co ma" + maPhieuNhap);
                return;
            }   
        }
        System.out.println("Khong tim thay phieu nhap co ma " + maPhieuNhap + " de sua.");
    }
    // Phương thức xóa phiếu xuất
    public static void xoaPhieuXuat(ArrayList<bienbanKiemKho> list, String maPhieuXuat) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaPhieuXuat().equals(maPhieuXuat)) {
                list.remove(i);
                System.out.println("Đa xoa phieu xuat co ma " + maPhieuXuat);
                return;
            }
        }
        System.out.println("Khong tim thay phieu xuat co ma" + maPhieuXuat + " de xoa.");
    }
     // Phương thức xóa phiếu nhập
     public static void xoaPhieuNhap(ArrayList<bienbanKiemKho> list, String maPhieuNhap) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaPhieuNhap().equals(maPhieuNhap)) {
                list.remove(i);
                System.out.println("Đa xoa phieu nhap co ma " + maPhieuNhap);
                return;
            }
        }
        System.out.println("Khong tim thay phieu nhap co ma" + maPhieuNhap + " de xoa.");
    }
    // SƯA TÊN VÂT TU VÀ MÃ VAT TU
    public static void suaVatTu(ArrayList<bienbanKiemKho> list, String maVatTu) {
        for (bienbanKiemKho kiemkho : list) {
            if (kiemkho.getMaVatTu().equals(maVatTu)) {
                try (Scanner sc = new Scanner(System.in)) {
                    System.out.print("Nhap ten vat tu moi: ");
                    String tenVatTu = sc.next();
                    kiemkho.setTenVatTu(tenVatTu);
    
                    System.out.print("Nhap ma vat tu moi: ");
                    String maVatTuMoi = sc.next();
                    kiemkho.setMaVatTu(maVatTuMoi);
                   
                }
    
                System.out.println("Đa sua thong tin vat tu co ma" + maVatTu);
                return;
            }   
        }
        System.out.println("Khong tim thay vat tu co ma " + maVatTu + " de sua.");
    }
}




