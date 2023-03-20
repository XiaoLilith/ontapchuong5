mport java.util.Scanner;
public class UML{
    public class ChuyenXe{
        private String maChuyenXe;
        private String hoTenTaiXe;
        private String soXe;
        private Float doanhThu;

        public ChuyenXe(){
            super();
        }
        public ChuyenXe(String maChuyenXe,String hoTenTaiXe,String soXe,Float doanhThu){
            super();
            this.maChuyenXe=maChuyenXe;
            this.hoTenTaiXe=hoTenTaiXe;
            this.soXe=soXe;
            this.doanhThu=doanhThu;
        }
        public String getmaChuyenXe(){
            return maChuyenXe;
        }
        public void setmaChuyenXe(String maChuyenXe){
            this.maChuyenXe=maChuyenXe;
        }
        public String gethoTenTaiXe(){
            return hoTenTaiXe;
        }
        public void sethoTenTaiXe(String hoTenTaiXe){
            this.hoTenTaiXe=hoTenTaiXe;
        }
        public String getsoXe(){
            return soXe;
        }
        public void setsoXe(String soXe){
            this.soXe=soXe;
        }
        public Float getdoanhThu(){
            return doanhThu;
        }
        public void setdoanhThu(Float doanhThu){
            this.doanhThu=doanhThu;
        }
        public String toString(){
            return maChuyenXe +","+ hoTenTaiXe +","+ soXe +","+ doanhThu;
        }
    }
    public class ChuyenXeNoiThanh extends ChuyenXe{
        public void tongdoanhThu(){
            System.out.println("Tong doanh thu cua chuyen noi thanh la: ");
        }
        private String soTuyen;
        private Float soKmDiDuoc;

        public ChuyenXeNoiThanh(String maChuyenXe,String hoTenTaiXe,String soXe,Float doanhThu,String soTuyen,Float soKmDiDuoc){
            super(maChuyenXe,hoTenTaiXe,soXe,doanhThu);
            this.soTuyen=soTuyen;
            this.soKmDiDuoc=soKmDiDuoc;
        }
        public String getsoTuyen(){
            return soTuyen;
        }
        public void setsoTuyen(String soTuyen){
            this.soTuyen=soTuyen;
        }
        public Float getsoKmDiDuoc(){
            return soKmDiDuoc;
        }
        public void setsoKmDiDuoc(Float soKmDiDuoc){
            this.soKmDiDuoc=soKmDiDuoc;
        }
    }
    public class ChuyenXeNgoaiThanh extends ChuyenXe{
        public void tongdoanhThu(){
            System.out.println("Tong doanh thu cua chuyen ngoai thanh la: ");
        }
        private String noiDen;
        private int soNgayDiDuoc;

        public ChuyenXeNgoaiThanh(String maChuyenXe,String hoTenTaiXe,String soXe,Float doanhThu,String noiDen,int soNgayDiDuoc){
            super(maChuyenXe,hoTenTaiXe,soXe,doanhThu);
            this.noiDen=noiDen;
            this.soNgayDiDuoc=soNgayDiDuoc;
        }
        public String getnoiDen(){
            return noiDen;
        }
        public void setnoiDen(String noiDen){
            this.noiDen=noiDen;
        }
        public int getsoNgayDiDuoc(){
            return soNgayDiDuoc;
        }
        public void setsoNgayDiDuoc(int soNgayDiDuoc){
            this.soNgayDiDuoc=soNgayDiDuoc;
        }
    }