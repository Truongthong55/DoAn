 package quanlyvattu;

    import java.util.Scanner;
    import java.util.ArrayList;
    
    public class Main {
        static Scanner sc = new Scanner(System.in);


        public static void main(String[] args) {
            ArrayList<thongtinvattu> list = new ArrayList<thongtinvattu>();
          
int choice;
            System.out.println("===== Quan ly vat tu =====");
            System.out.println("1. Nhap danh sach vat tu");
            System.out.println("2. Nhap danh sach ton kho");
            System.out.println("3. Nhap ten kho vat tu");
            System.out.println("4. Nhap danh sach nhap kho");
            System.out.println("5. Nhap danh sach xuat kho");
            System.out.println("5. Nhap danh sach phieu xuat");
            System.out.println("6. Xoa ma vat tu");
            System.out.println("7. Sua ma vat tu");
            System.out.println("8. Them vat tu");
            System.out.println("9. Nhap ma vat tu can sua so luong");
            System.out.println("10. Sap tang theo ma vat tu");
            System.out.println("11. Sap giam theo ma vat tu");
            System.out.println("12. Ma vat tu can tim kiem");
            System.out.println("13. Hien thi danh sach vat tu");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Chon chuc nang: "); 


             choice = sc.nextInt();
   
    switch(choice){
        case 1:
        thongtinvattu.nhapDSVatTu();
        break;
    case 2:
        baocaotonkho.nhapDSTonKho();
        break;
    case 3:
        khovattuxaydung.nhapTenKhoVatTu();
        break;
    case 4:
        nhapkho.nhapDSNhapKho();
        break;
   case 5:
        xuatkho.nhapDSXuatKho();
        break;

    case 6:
        System.out.print("Nhap ma vat tu can xoa : ");
        String maVatTuXoa = sc.next();
        thongtinvattu.xoaVatTu(list, maVatTuXoa);     
        break;
    case 7:
        System.out.print("Nhap ma vat tu can sua: ");
        String maVatTuSua = sc.next();
        thongtinvattu.suaVatTu(list, maVatTuSua);
        break;
    case 8:
        thongtinvattu.themVatTu(list);
         break;
    case 9:
        System.out.print("Nhap ma vat tu can sua so luong: ");
        String maVatTuSuaSL = sc.next();
        thongtinvattu.suaSoLuongVatTu(list, maVatTuSuaSL, choice);
        break;
    case 10:
        thongtinvattu.sapXepTang(list);
        break;
    case 11:
        thongtinvattu.sapXepGiam(list);
        break;
    case 12:
        System.out.print("Nhap ma vat tu can tim kiem: ");
        String maVatTuTimKiem = sc.next();
        thongtinvattu.timKiem(list, maVatTuTimKiem);
        break;
    case 13:
        thongtinvattu.hienThiDSVatTu(list);
        break;
    case 0:
        System.out.println("Chuong trinh ket thuc.");
        System.exit(0);
        break; 
    default:
        System.out.println("Chuc nang khong hop le. Vui long chon lai.");
        break;
        
    } 
            
            }
    }
