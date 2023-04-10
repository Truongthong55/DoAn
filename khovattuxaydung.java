package quanlyvattu;
import java.util.Scanner;
import java.util.ArrayList;
public class khovattuxaydung {
    private static ArrayList<khovattuxaydung> list;
    protected String tenVatTu, maVatTu;

public khovattuxaydung(String tenVatTu, String maVatTu){
    this.tenVatTu = tenVatTu;
    this.maVatTu = maVatTu;   
}
public String getTenVatTu(){
    return tenVatTu;
}
public void setTenVatTu(String tenVatTu){
    this.tenVatTu = tenVatTu;   
}
public String getMaVatTu(){
    return maVatTu;
}
public void setMaVatTu(String maVatTu){
    this.maVatTu = maVatTu;
}

@Override
public String toString(){
return"khovattuxaydung{" +"ten=" + tenVatTu + ",ma=" + maVatTu +"}";
}
// nhập tên mã
public static ArrayList<khovattuxaydung> nhapTenKhoVatTu() {
    try (Scanner sc = new Scanner(System.in)) {
     ArrayList<khovattuxaydung> list = new ArrayList<>();
            System.out.println("Ten vat tu: ");
            String tenVatTu = sc.nextLine();
            System.out.println("Ma vat tu: ");
            String maVatTu = sc.nextLine();
        
            
        System.out.println("Ten Vat Tu:  " + tenVatTu);
        System.out.println("Ma Vat Tu:   " + maVatTu);
        

            khovattuxaydung kho = new khovattuxaydung(tenVatTu, maVatTu);
                list.add(kho);              
            }
           
            return list;
            
    }
// Hiển thị
public static void hienThiDSVatTuXayDung(ArrayList<khovattuxaydung> list) {
    System.out.printf("%-20s%-15s%-10s%-15s%-15s%-20s%-20s\n", "Tên vật tư", "Mã vật tư");
    for (khovattuxaydung kho : list) {
        System.out.printf("%-20s%-15s%-10s%-15d%-15.2f%-20s%-20s\n", kho.getTenVatTu(), kho.getMaVatTu());
    }
}
// Phương thức sửa thông tin vật tư
public static void suaVatTu(ArrayList<khovattuxaydung> list, String maVatTu, String tenVatTu){
    for (khovattuxaydung kho : list) {
        if (kho.getMaVatTu().equals(maVatTu)) {
            try (Scanner sc = new Scanner(System.in)) {

                System.out.print("Nhap ma vat tu moi: ");
                String maVatTuMoi = sc.next();
                kho.setMaVatTu(maVatTuMoi);             
            }
            if (kho.getTenVatTu().equals(tenVatTu)) {
                try (Scanner sc = new Scanner(System.in)) {
    
                    System.out.print("Nhap ten vat tu moi: ");
                    String tenVatTuMoi = sc.next();
                    kho.setTenVatTu(tenVatTuMoi);             
                }
            System.out.println("Đa sua thong tin vat tu co ma" + maVatTu);
            return;
        }   
    }
    System.out.println("Khong tim thay vat tu co ma " + maVatTu + " de sua.");
}
}
// Phương thức xóa vật tư
public static void xoaKhoVatTu(ArrayList<khovattuxaydung> list, String maVatTu, String tenVatTu) {
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).getMaVatTu().equals(maVatTu)) {
            list.remove(i);
            System.out.println("Đa xoa kho vat tu " + maVatTu);
            return;
        }
    }
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).getTenVatTu().equals(tenVatTu)) {
            list.remove(i);
            System.out.println("Đa xoa kho vat tu " + maVatTu);
            return;
        }
    }
}
 // Phương thức thêm vật tư
 public static void themKhoVatTu(ArrayList<khovattuxaydung> list) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Ten vat tu: ");
        String tenVatTu = sc.next();
        System.out.print("Ma vat tu: ");
        String maVatTu = sc.next();
       

        khovattuxaydung kho = new khovattuxaydung(tenVatTu, maVatTu);
        list.add(kho);
    }

    System.out.println("Đa them vat tu vao danh sach.");
}
// Phương thức tìm kiếm vật tư theo mã và tên
public static void timKiem(ArrayList<khovattuxaydung> list, String maVatTu, String tenVatTu) {
    for (khovattuxaydung kho : list) {
        if (kho.getMaVatTu().equals(maVatTu)) {
            System.out.println("Thong tin vat tu co ma " + maVatTu + ":");
            System.out.println(kho.toString());
            return;
        }
    }
    System.out.println("Khong tim thay vat tu co ma " + maVatTu + ".");
    for (khovattuxaydung kho : list) {
        if (kho.getTenVatTu().equals(tenVatTu)) {
            System.out.println("Thong tin vat tu co ma " + tenVatTu + ":");
            System.out.println(kho.toString());
            return;
        }
    }
 }
}


