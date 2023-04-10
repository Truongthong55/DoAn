package quanlyvattu;
import java.util.Scanner;
import java.util.ArrayList;
public class nhapkho  extends khovattuxaydung {
    private int thanhTien;
    private double  soLuongNhap;
    private String ngayNhap, maPhieuNhap;

    public nhapkho (String tenVatTu, String maVatTu, String maPhieuNhap, String  ngayNhap,double soLuongNhap, int thanhTien){
        super(tenVatTu, maVatTu);
        this.maPhieuNhap = maPhieuNhap;
        this.soLuongNhap = soLuongNhap;
        this.thanhTien = thanhTien;
    }
    public String getMaPhieuNhap(){
        return maPhieuNhap;
    }
    public void setMaPhieuNhap(String maPhieuNhap){
        this.maPhieuNhap = maPhieuNhap;
    }
    public double getSoLuongNhap(){
        return soLuongNhap;
    }
    public void setSoLuongNhap(double soLuongNhap){
        this.soLuongNhap = soLuongNhap;
    }
    
    public String getNgayNhap(){
        return ngayNhap;
    }
    public void setNgayNhap(String ngayNhap){
        this.ngayNhap = ngayNhap;
    }
    public int getThanhTien() {
        return thanhTien;
    }
    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }
    public static ArrayList<nhapkho> nhapDSNhapKho() {

        
        try (Scanner sc = new Scanner(System.in)) {
         ArrayList<nhapkho> list = new ArrayList<>();
    
            System.out.print("Nhap so luong nhap kho: ");
            int n = sc.nextInt();
    
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap so luong nhap kho thu: " + (i+1));
                System.out.println("Ten vat tu: ");
                String tenVatTu = sc.next();
                System.out.println("Ma vat tu: ");
                String maVatTu = sc.next();
                System.out.println("Ma phieu nhap: ");
                String maPhieuNhap = sc.next();
                System.out.println("Ngay nhap: ");
                String ngayNhap = sc.next();
                System.out.println("So luong nhap: ");
                double soLuongNhap = sc.nextDouble();
                System.out.println("Thanh tien: ");
                int thanhTien = sc.nextInt();

            System.out.println("Ten Vat Tu: " + tenVatTu);
            System.out.println("Ma Vat Tu =  " + maVatTu);
            System.out.println("Ma Phieu Nhap =  " + maPhieuNhap);
            System.out.println("Ngay Nhap =  " + ngayNhap);
            System.out.println("So Luong Nhap =  " + soLuongNhap);
            System.out.println("Thanh Tien =  " + thanhTien);
                nhapkho nk = new nhapkho(tenVatTu, maVatTu, maPhieuNhap,ngayNhap,soLuongNhap,thanhTien);
                    list.add(nk);              
                }
               
                return list;
                
        }
        }
        // Phương thức hiển thị danh sách xuất kho
     public static void hienThiDSNhapKho(ArrayList<nhapkho> list) {
        System.out.printf("%-20s%-15s%-10s%-15s%-15s%-20s%-20s\n", "Tên vật tư", "Mã vật tư", "Mã phiếu nhập", "Ngày nhập","Số lượng nhập","Thành tiền" );
        for (nhapkho nk : list) {
            System.out.printf("%-20s%-15s%-10s%-15d%-15.2f%-20s%-20s\n", nk.getTenVatTu(), nk.getMaVatTu(), nk.getSoLuongNhap(), nk.getThanhTien(), nk.getMaPhieuNhap(), nk.getNgayNhap());
        }
    }

    // PHUONG THUC SUA PHIEU NHAP
    public static void suaMaPhieuNhap(ArrayList<nhapkho> list, String maPhieuNhap) {
        for (nhapkho nk : list) {
            if (nk.getMaPhieuNhap().equals(maPhieuNhap)) {
                try (Scanner sc = new Scanner(System.in)) {
    
                    System.out.print("Nhap ma phieu nhap moi: ");
                    String maPhieuNhapMoi = sc.next();
                    nk.setMaPhieuNhap(maPhieuNhapMoi);
                }
    
                System.out.println("Đa sua ma phieu nhap " + maPhieuNhap);
                return;
            }   
        }
        System.out.println("Khong tim thay vat tu co ma " + maPhieuNhap + " de sua.");
    }
    // Phương thức xóa phiếu nhập
    
    public static void xoaMaPhieuNhap(ArrayList<nhapkho> list, String maPhieuNhap) {
        for (int i = 0; i < list.size(); i++) {
    if (list.get(i).getMaPhieuNhap().equals(maPhieuNhap)) {
                list.remove(i);
                System.out.println("Đa xoa vat tu co ma " + maPhieuNhap);
                return;
            }
        }
        System.out.println("Khong tim thay vat tu co ma" + maPhieuNhap + " de xoa.");
    }
    // SUA VATTU NHAP KHO
    public static void suaVatTuNhapKho(ArrayList<nhapkho> list, String maVatTu) {
        for (nhapkho nk: list) {
            if (nk.getMaVatTu().equals(maVatTu)) {
                try (Scanner sc = new Scanner(System.in)) {
                    System.out.print("Nhap ten vat tu moi: ");
                    String tenVatTu = sc.next();
                    nk.setTenVatTu(tenVatTu);
    
                    System.out.print("Nhap ma vat tu moi: ");
                    String maVatTuMoi = sc.next();
                    nk.setMaVatTu(maVatTuMoi);
    
                    System.out.print("Nhap ngay nhap: ");
                    String ngayNhap = sc.next();
                    nk.setNgayNhap(ngayNhap);
                       
                }
    
                System.out.println("Đa sua thong tin vat tu co ma" + maVatTu);
                return;
            }   
        }
        System.out.println("Khong tim thay vat tu co ma " + maVatTu + " de sua.");
    }
    //XOA VATTU NHAP KHO
    public static void xoaVatTuNhapKho(ArrayList<nhapkho> list, String maVatTu, String tenVatTu, String ngayNhap) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaVatTu().equals(maVatTu)) {
                list.remove(i);
                System.out.println("Đa xoa vat tu co ma " + maVatTu);
                return;
            }
            if (list.get(i).getTenVatTu().equals(tenVatTu)) {
                list.remove(i);
                System.out.println("Đa xoa ten vat tu " + tenVatTu);
                return;
            }
            if (list.get(i).getNgayNhap().equals(ngayNhap)) {
                list.remove(i);
                System.out.println("Đa xoa ngay nhap " + ngayNhap);
                return;
            }
        }
        System.out.println("Khong tim thay vat tu co ma" + maVatTu + " de xoa.");
        System.out.println("Khong tim thay ten vat tu " + tenVatTu + " de xoa.");
        System.out.println("Khong tim thay ngay nhap " + ngayNhap + " de xoa.");
    }
    // Phương thức thêm vat tu nhap kho
    public static void themVatTuNhapKho(ArrayList<nhapkho> list) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ten vat tu: ");
            String tenVatTu = sc.next();
            System.out.print("Ma vat tu: ");
            String maVatTu = sc.next();
            System.out.print("Ngay nhap: ");
            String ngayNhap = sc.next();
            System.out.print("So luong nhap: ");
            double soLuongNhap = sc.nextDouble();          
            System.out.print("Ma phieu nhap: ");
            String maPhieuNhap = sc.next();
            System.out.print("Thanh tien: ");
            int thanhTien = sc.nextInt();
            nhapkho nk = new nhapkho(tenVatTu, maVatTu, maPhieuNhap,ngayNhap,soLuongNhap,thanhTien);
            list.add(nk);
        }

        System.out.println("Đa them vat tu vao danh sach.");
    }
    }
