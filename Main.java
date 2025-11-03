import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IQuanLySach ql = new QuanLySachImpl(100);
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm sách giáo trình");
            System.out.println("2. Thêm sách tiểu thuyết");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1 -> {
                    System.out.print("Mã: "); String ma = sc.nextLine();
                    System.out.print("Tên: "); String ten = sc.nextLine();
                    System.out.print("Tác giả: "); String tg = sc.nextLine();
                    System.out.print("Năm XB: "); int nam = sc.nextInt();
                    System.out.print("SL: "); int sl = sc.nextInt();
                    System.out.print("Giá: "); double gia = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Môn học: "); String mon = sc.nextLine();
                    System.out.print("Cấp độ: "); String cap = sc.nextLine();
                    ql.themSach(new SachGiaoTrinh(ma, ten, tg, nam, sl, gia, mon, cap));
                }
                case 2 -> {
                    System.out.print("Mã: "); String ma = sc.nextLine();
                    System.out.print("Tên: "); String ten = sc.nextLine();
                    System.out.print("Tác giả: "); String tg = sc.nextLine();
                    System.out.print("Năm XB: "); int nam = sc.nextInt();
                    System.out.print("SL: "); int sl = sc.nextInt();
                    System.out.print("Giá: "); double gia = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Thể loại: "); String theLoai = sc.nextLine();
                    System.out.print("Series (true/false): "); boolean series = sc.nextBoolean();
                    ql.themSach(new SachTieuThuyet(ma, ten, tg, nam, sl, gia, theLoai, series));
                }
                case 3 -> ql.hienThiDanhSach();
            }
        } while (chon != 4);

        sc.close();
        System.out.println("Đã thoát chương trình.");
    }
}
