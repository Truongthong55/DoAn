package quanlyvattu;
import java.util.Scanner;
import java.util.ArrayList;
public class baocaotonkho extends khovattuxaydung {

    private double soLuongTon;
    private String  ngayNhap,maPhieuNhap;
   

public baocaotonkho(double soLuongTon,String maVatTu,String maPhieuNhap, String tenVatTu, String ngayNhap){
    super(tenVatTu, maVatTu);
    this.soLuongTon = soLuongTon;
    this.maVatTu = maVatTu;
    this.maPhieuNhap = maPhieuNhap;
    this.tenVatTu = tenVatTu;
    this.ngayNhap = ngayNhap;
}
public double getSoLuongTon(){
    return soLuongTon;
}
public void setSoLuongTon(double soLuongTon){
    this.soLuongTon = soLuongTon;
}
public String getMaPhieuNhap(){
    return maPhieuNhap;
}
public void setMaPhieuNhap(String maPhieuNhap){
    this.maPhieuNhap = maPhieuNhap;
}

public String getNgayNhap(){
    return ngayNhap;
}
public void setNgayNhap(String ngayNhap){
    this.ngayNhap = ngayNhap;
}

public static ArrayList<baocaotonkho> nhapDSTonKho() {
    try (Scanner sc = new Scanner(System.in)) {
     ArrayList<baocaotonkho> list = new ArrayList<>();
     System.out.print("Nhap danh sach ton kho: ");

     System.out.println("So luong ton: ");
     double soLuongTon  = sc.nextDouble();
     System.out.println("Ten vat tu: ");
     String tenVatTu = sc.next();
     System.out.println("Ma vat tu: ");
     String maVatTu = sc.next();
     System.out.println("Ngay nhap: ");
     String ngayNhap = sc.next();
     System.out.println("Ma phieu nhap: ");
     String maPhieuNhap = sc.next();

        System.out.println("So luong ton: " + soLuongTon);
        System.out.println("Ten vat tu:  " + tenVatTu);
        System.out.println("Ma vat tu: " + maVatTu);
        System.out.println("Ngay Nhap: " + ngayNhap);
        System.out.println("Ma Phieu Nhap: " + maPhieuNhap);

        baocaotonkho tonkho = new baocaotonkho(soLuongTon, maVatTu, maPhieuNhap, tenVatTu, ngayNhap);
                list.add(tonkho);  
                return list;


    }
}

     // Phương thức hiển thị danh sách tồn kho
     public static void hienThiDSTonKho(ArrayList<baocaotonkho> list) {
        System.out.printf("%-20s%-15s%-10s%-15s%-15s%-20s%-20s\n", "Số lượng tồn", "Tên vật tư","Ngày nhập", "Mã phiếu nhập","Mã vật tư");
        for (baocaotonkho tonkho : list) {
            System.out.printf("%-20s%-15s%-10s%-15d%-15.2f%-20s%-20s\n",tonkho.getSoLuongTon(), tonkho.getMaVatTu(), tonkho.getNgayNhap(), tonkho.getMaPhieuNhap());
        }
    }
     // Phương thức xóa vật tư tồn kho

    public static void xoaVatTuTonKho(ArrayList<baocaotonkho> list, String maVatTu) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaVatTu().equals(maVatTu)) {
                list.remove(i);
                System.out.println("Đa xoa vat tu ton " + maVatTu);
                return;
            }
        }
        System.out.println("Khong tim thay vat tu ton kho" + maVatTu + " de xoa.");
    }
    // Phương thức sửa thông tin vật tư
    public static void suaDSTonKho(ArrayList<baocaotonkho> list, String maVatTu) {
        for (baocaotonkho tk : list) {
            if (tk.getMaVatTu().equals(maVatTu)) {
                try (Scanner sc = new Scanner(System.in)) {
                    System.out.print("Nhap ten vat tu moi: ");
                    String tenVatTu = sc.next();
                    tk.setTenVatTu(tenVatTu);

                    System.out.print("Nhap ma vat tu moi: ");
                    String maVatTuMoi = sc.next();
                    tk.setMaVatTu(maVatTuMoi);

                
                    System.out.print("Nhap so luong ton moi: ");
                    int soLuongTon = sc.nextInt();
                    tk.setSoLuongTon(soLuongTon);

                   

                    
                }

                System.out.println("Đa sua thong tin vat tu co ma" + maVatTu);
                return;
            }   
        }
        System.out.println("Khong tim thay vat tu co ma " + maVatTu + " de sua.");
    }
}


