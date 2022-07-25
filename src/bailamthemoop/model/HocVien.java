package bailamthemoop.model;

public class HocVien extends CodeGym {
    private String lop;
    private double diemSo;

    public HocVien() {
    }

    public HocVien(int ma, String ten, String ngaySinh, String gioiTinh, String lop, double diemSo) {
        super(ma, ten, ngaySinh, gioiTinh);
        this.lop = lop;
        this.diemSo = diemSo;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(double diemSo) {
        this.diemSo = diemSo;
    }

    @Override
    public String toString() {
        return "HocVien{" + super.toString()+
                "lop='" + lop + '\'' +
                ", diemSo=" + diemSo +
                '}';
    }
}
