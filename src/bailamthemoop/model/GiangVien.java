package bailamthemoop.model;

public class GiangVien extends CodeGym {
    private String chuyenMon;

    public GiangVien() {
    }

    public GiangVien(int ma, String ten, String ngaySinh, String gioiTinh, String chuyenMon) {
        super(ma, ten, ngaySinh, gioiTinh);
        this.chuyenMon = chuyenMon;
    }

    @Override
    public String toString() {
        return "GiangVien{" + super.toString()+
                "chuyenMon='" + chuyenMon + '\'' +
                '}';
    }
}
