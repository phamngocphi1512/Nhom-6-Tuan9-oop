public abstract class Sach implements IGiaBan, IKiemKe {
    protected String maSach, tenSach, tacGia;
    protected int namXuatBan, soLuong;
    protected double giaCoBan;

    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public abstract double tinhGiaBan();
    public abstract boolean kiemTraTonKho(int soLuongToiThieu);
    public abstract void capNhatViTri(String viTriMoi);

    @Override
    public String toString() {
        return String.format("Mã: %s | Tên: %s | Tác giả: %s | Năm: %d | SL: %d | Giá cơ bản: %.0f",
                maSach, tenSach, tacGia, namXuatBan, soLuong, giaCoBan);
    }
}
