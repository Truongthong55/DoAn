package quanlyvattu;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class thongtinvattu extends khovattuxaydung {
    private String mau;
    private int soLuong,thanhTien;
    private String maPhieuXuat;
    private String maPhieuNhap;

    public thongtinvattu(String tenVatTu, String maVatTu, String mau, int soLuong, int thanhTien, String maPhieuXuat, String maPhieuNhap) {
       super(tenVatTu, maVatTu);
        this.mau = mau;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.maPhieuXuat = maPhieuXuat;
        this.maPhieuNhap = maPhieuNhap;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getMaPhieuXuat() {
        return maPhieuXuat;
    }

    public void setMaPhieuXuat(String maPhieuXuat) {
        this.maPhieuXuat = maPhieuXuat;
    }

    public String getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(String maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }
public static ArrayList<thongtinvattu> nhapDSVatTu() {
    try (Scanner sc = new Scanner(System.in)) {
     ArrayList<thongtinvattu> list = new ArrayList<>();

        System.out.print("Nhap so luong vat tu: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin vat tu thu: " + (i+1));
            System.out.println("Ten vat tu: ");
            String tenVatTu = sc.next();
            System.out.println("Ma vat tu: ");
            String maVatTu = sc.next();
            System.out.println("Mau: ");
            String mau = sc.next();
            System.out.println("So luong: ");
            int soLuong = sc.nextInt();
            System.out.println("Thanh tien: ");
            int thanhTien = sc.nextInt();
            System.out.println("Ma phieu xuat: ");
            String maPhieuXuat = sc.next();
            System.out.println("Ma phieu nhap: ");
            String maPhieuNhap = sc.next();
          
       
    
            thongtinvattu vattu = new thongtinvattu(tenVatTu, maVatTu, mau, soLuong, thanhTien, maPhieuXuat, maPhieuNhap);
                list.add(vattu); 

                System.out.println("Ten Vat Tu : " + tenVatTu);

                System.out.println("Ma Vat Tu :   " + maVatTu);
        
                System.out.println("Mau : " + mau);
        
                System.out.println("So Luong : " + soLuong);
        
                System.out.println("Thanh Tien =  "   + thanhTien);
        
                System.out.println("Ma Phieu Xuat : "   + maPhieuXuat);
        
                System.out.println("Ma Phieu Nhap : "   + maPhieuNhap);             
            }
        
           
            return list;
        
            
    }
    }
     // Phương thức hiển thị danh sách vật tư
     public static void hienThiDSVatTu(ArrayList<thongtinvattu> list) {
        System.out.printf("%-20s%-15s%-10s%-15s%-15s%-20s%-20s\n", "Ten vat tu", "Ma vat tu", "Mau", "So luong", "Thanh tien", "Ma phieu xuat", "Ma phieu nhap");
        for (thongtinvattu vattu : list) {
            System.out.printf("%-20s%-15s%-10s%-15d%-15.2f%-20s%-20s\n", vattu.getTenVatTu(), vattu.getMaVatTu(), vattu.getMau(), vattu.getSoLuong(), vattu.getThanhTien(), vattu.getMaPhieuXuat(), vattu.getMaPhieuNhap());
        }
    }
 // Phương thức xóa vật tư
    public static void xoaVatTu(ArrayList<thongtinvattu> list, String maVatTu) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaVatTu().equals(maVatTu)) {
                list.remove(i);
                System.out.println("Đa xoa vat tu co ma = " +  maVatTu);
                return;
            }
        }
        System.out.println("Khong tim thay vat tu co ma = " +  maVatTu + " de xoa.");
    }
 // Phương thức sửa thông tin vật tư
 public static void suaVatTu(ArrayList<thongtinvattu> list, String maVatTu) {
    for (thongtinvattu vattu : list) {
        if (vattu.getMaVatTu().equals(maVatTu)) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Nhap ten vat tu moi: ");
                String tenVatTu = sc.next();
                vattu.setTenVatTu(tenVatTu);

                System.out.print("Nhap ma vat tu moi: ");
                String maVatTuMoi = sc.next();
                vattu.setMaVatTu(maVatTuMoi);

                System.out.print("Nhap mau moi: ");
                String mau = sc.next();
                vattu.setMau(mau);

                System.out.print("Nhap so luong moi: ");
                int soLuong = sc.nextInt();
                vattu.setSoLuong(soLuong);

                System.out.print("Nhap thanh tien moi: ");
                int thanhTien = sc.nextInt();
                vattu.setThanhTien(thanhTien);
                System.out.print("Nhap ma phieu xuat moi: ");
                String maPhieuXuat = sc.next();
                vattu.setMaPhieuXuat(maPhieuXuat);

                System.out.print("Nhap ma phieu nhap moi: ");
                String maPhieuNhap = sc.next();
                vattu.setMaPhieuNhap(maPhieuNhap);
            }

            System.out.println("Đa sua thong tin vat tu co ma" + maVatTu);
            return;
        }   
    }
    System.out.println("Khong tim thay vat tu co ma " + maVatTu + " de sua.");
}
 // Phương thức thêm vật tư
    public static void themVatTu(ArrayList<thongtinvattu> list) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ten vat tu: ");
            String tenVatTu = sc.next();
            System.out.print("Ma vat tu: ");
            String maVatTu = sc.next();
            System.out.print("Mau: ");
            String mau = sc.next();
            System.out.print("So luong: ");
            int soLuong = sc.nextInt();
            System.out.print("Thanh tien: ");
            int thanhTien = sc.nextInt();
            System.out.print("Ma phieu xuat: ");
            String maPhieuXuat = sc.next();
            System.out.print("Ma phieu nhap: ");
            String maPhieuNhap = sc.next();

            thongtinvattu vattu = new thongtinvattu(tenVatTu, maVatTu, mau, soLuong, thanhTien, maPhieuXuat, maPhieuNhap);
            list.add(vattu);
        }

        System.out.println("Đa them vat tu vao danh sach.");
    }
    // Phương thức sửa số lượng vật tư
    public static void suaSoLuongVatTu(ArrayList<thongtinvattu> list, String maVatTu, int soLuongMoi) {
        for (thongtinvattu vattu : list) {
            if (vattu.getMaVatTu().equals(maVatTu)) {
                vattu.setSoLuong(soLuongMoi);
                System.out.println("Đa sua so luong vat tu co ma " + maVatTu);
                return;
            }
        }
        System.out.println("Khong tim thay vat tu co ma " + maVatTu + " de sua so luong.");
    }
// Phương thức sắp xếp tăng dần theo mã vật tư
public static void sapXepTang(ArrayList<thongtinvattu> list) {
    Collections.sort(list, new Comparator<thongtinvattu>() {
        @Override
        public int compare(thongtinvattu o1, thongtinvattu o2) {
            return o1.getMaVatTu().compareTo(o2.getMaVatTu());
        }
    });
    System.out.println("Đa sap xep danh sach tang dan theo ma vat tu.");
}
// Phương thức sắp xếp giảm dần theo mã vật tư
public static void sapXepGiam(ArrayList<thongtinvattu> list) {
Collections.sort(list, new Comparator<thongtinvattu>() {
@Override
public int compare(thongtinvattu o1, thongtinvattu o2) {
return o2.getMaVatTu().compareTo(o1.getMaVatTu());
}
});
System.out.println("Đa sap xep danh sach giam dan theo ma vat tu.");
}
// Phương thức tìm kiếm vật tư theo mã
public static void timKiem(ArrayList<thongtinvattu> list, String maVatTu) {
    for (thongtinvattu vattu : list) {
        if (vattu.getMaVatTu().equals(maVatTu)) {
            System.out.println("Thong tin vat tu co ma " + maVatTu + ":");
            System.out.println(vattu.toString());
            return;
        }
    }
    System.out.println("Khong tim thay vat tu co ma " + maVatTu + ".");
 }
 
}

