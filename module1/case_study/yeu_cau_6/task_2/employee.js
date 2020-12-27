class Employee{
    constructor(ten, cmnd, ngaySinh, email, dienThoai, trinhDo, viTri, luong) {
        this.ten = ten;
        this.cmnd = cmnd;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.dienThoai = dienThoai;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
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
    getEmail(){
        return this.email;
    }
    getDienThoai(){
        return this.dienThoai;
    }
    getTrinhDo(){
        return this.trinhDo;
    }
    getViTri(){
        return this.viTri;
    }
    getLuong(){
        if(this.getViTri() === "Manager"){
            this.luong = 500;
        }
        else if (this.getViTri() === "Sale"){
            this.luong = 300;
        }
        else if (this.getViTri() === "Marketing"){
            this.luong = 200;
        }
        return this.luong;
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
    setDienThoai(dienThoai){
        this.dienThoai = dienThoai;
    }
    setTrinhDo(trinhDo){
        this.trinhDo = trinhDo;
    }
    setViTri(viTri){
        this.viTri = viTri;
    }
}