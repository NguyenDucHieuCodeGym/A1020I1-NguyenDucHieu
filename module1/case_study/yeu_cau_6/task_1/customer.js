class Customer {
    constructor(ten, cmnd, ngaySinh, email, diaChi, loaiKhachHang, giamGia, soLuongDiKem, soNgayThue, loaiDichVu, loaiPhongThue) {
        this.ten = ten;
        this.cmnd = cmnd;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.diaChi = diaChi;
        this.loaiKhachHang = loaiKhachHang;
        this.giamGia = giamGia;
        this.soLuongDiKem = soLuongDiKem;
        this.soNgayThue = soNgayThue;
        this.loaiDichVu = loaiDichVu;
        this.loaiPhongThue = loaiPhongThue;
    }

    getTen() {
        return this.ten;
    }

    getCMND() {
        return this.cmnd;
    }

    getNgaySinh() {
        return this.ngaySinh;
    }

    getEmail() {
        return this.email;
    }

    getDiaChi() {
        return this.diaChi;
    }

    getLoaiKhachHang() {
        return this.loaiKhachHang;
    }

    getGiamGia() {
        return this.giamGia;
    }

    getSoLuongDiKem() {
        return this.soLuongDiKem;
    }

    getSoNgayThue() {
        return this.soNgayThue;
    }

    getLoaiDichVu() {
        return this.loaiDichVu;
    }

    getLoaiPhongThue() {
        return this.loaiPhongThue;
    }

    setTen(ten) {
        this.ten = ten;
    }

    setCMND(cmnd) {
        this.cmnd = cmnd;
    }

    setNgaySinh(ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    setEmail(email) {
        this.email = email;
    }

    setDiaChi(diaChi) {
        this.diaChi = diaChi;
    }

    setLoaiKhachHang(loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    setGiamGia(giamGia) {
        this.giamGia = giamGia;
    }

    setSoLuongDiKem(soLuongDiKem) {
        this.soLuongDiKem = soLuongDiKem;
    }

    setSoNgayThue(soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    setLoaiDichVu(loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    setLoaiPhongThue(loaiPhongThue) {
        this.loaiPhongThue = loaiPhongThue;
    }

    soTienPhaiTra() {
        let money = 0;
        if (this.getLoaiDichVu() === "Villa") {
            money = 500;
        } else if (this.getLoaiDichVu() === "House") {
            money = 300;
        } else if (this.getLoaiDichVu() === "Room") {
            money = 200;
        }
        return this.getSoNgayThue() * money * (1 - this.getGiamGia() / 100);
    }
}