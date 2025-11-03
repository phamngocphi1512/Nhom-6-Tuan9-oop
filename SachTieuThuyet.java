public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSeries;

    public SachTieuThuyet(String ma, String ten, String tacGia, int nam, int sl, double gia, String theLoai, boolean laSeries) {
        super(ma, ten, tacGia, nam, sl, gia);
        this.theLoai = theLoai;
        this.laSeries = laSeries;
    }

    public double tinhGiaBan() {
        return giaCoBan + (laSeries ? 15000 : 0);
    }

    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách " + tenSach + " đến: " + viTriMoi);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Thể loại: %s | Series: %b | Giá bán: %.0f",
                theLoai, laSeries, tinhGiaBan());
    }
}
