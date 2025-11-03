public class SachGiaoTrinh extends Sach {
    private String monHoc, capDo;

    public SachGiaoTrinh(String ma, String ten, String tacGia, int nam, int sl, double gia, String monHoc, String capDo) {
        super(ma, ten, tacGia, nam, sl, gia);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    public double tinhGiaBan() {
        return giaCoBan + (2025 - namXuatBan) * 5000;
    }

    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách " + tenSach + " đến: " + viTriMoi);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Môn học: %s | Cấp độ: %s | Giá bán: %.0f",
                monHoc, capDo, tinhGiaBan());
    }
}
