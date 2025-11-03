public class QuanLySachImpl implements IQuanLySach {
    private Sach[] ds;
    private int soLuong;

    public QuanLySachImpl(int kichThuoc) {
        ds = new Sach[kichThuoc];
        soLuong = 0;
    }

    public void themSach(Sach s) {
        if (soLuong < ds.length) ds[soLuong++] = s;
    }

    public Sach timKiemSach(String ma) {
        for (int i = 0; i < soLuong; i++)
            if (ds[i].getMaSach().equalsIgnoreCase(ma))
                return ds[i];
        return null;
    }

    public void xoaSach(String ma) {
        for (int i = 0; i < soLuong; i++)
            if (ds[i].getMaSach().equalsIgnoreCase(ma)) {
                for (int j = i; j < soLuong - 1; j++)
                    ds[j] = ds[j + 1];
                soLuong--;
                break;
            }
    }

    public void hienThiDanhSach() {
        if (soLuong == 0)
            System.out.println("Danh sách trống.");
        else
            for (int i = 0; i < soLuong; i++)
                System.out.println(ds[i]);
    }
}
