import java.io.File;
import java.io.IOException;

public class XuLyFile {
    public static void taoThuMuc(String path){
        // Khai bao ra file moi
        File file = new File(path);

        if(!file.exists()) { // exists => kiểm tra đã tồn tại hay chưa?
            // Tạo thư mục
            // file.mkdir(); // make directory
            file.mkdirs(); // tạo nhiều thư mục cùng lúc
        }else{
            System.out.println("Thư mục đã tồn tại!");
        }
    }
    public static void taoTapTin(String path){
        // Khai bao ra file moi
        File file = new File(path);

        if(!file.exists()) { // exists => kiểm tra đã tồn tại hay chưa?
            // Những tình huống lỗi nào có thể xảy ra
            /*
                1. Không quyền tạo tập tin
                2. Đường dẫn (path) không chính xác
                3. Không đủ dung lượng
             */
            try {
                file.createNewFile(); // Tạo ra một tập tin mới;
            }catch (IOException e){
                System.out.println("Gặp lỗi IO Exception!");
                e.printStackTrace();
            }
        }else{
            System.out.println("Tập tin đã tồn tại!");
        }
    }
    public static void xoa(String path)
    {
        File file = new File(path);
        if(file.exists()) {
            file.delete();// xoa (neu la thu muc co noi dung ben trong se khong xoa duoc)
            // file.deleteOnExit(); // xoa neu tap tin co ton tai
        } else
            {
                System.out.println("Thu muc khong ton tai");
            }

    }
    public static void xoaTatCa(String path) {
        File file = new File(path);

        if (file.exists()) {
            // sử dụng đệ quy
            if (file.isDirectory()) { // nếu file là thư mục
                // Xóa nội dung bên trong
                File[] files = file.listFiles(); // Lấy ra danh sách các file con
//                for(int i=0; i<files.length; i++){
//                    File f = files[i];
//                }
                for (File f : files) { // foreach
                    xoaTatCa(f.getAbsolutePath()); // Tiếp tục đệ quy để xóa dựa trên đường dẫn tuyệt đối
                }
            }
        // (ax - bx) = 0 <=> x(a-b) = 0

            // Xõa chính bản thân nó
            if(file.delete()){ // thực hiện hành động xóa và file thành công
                System.out.println("Đã xóa file: " + path);
            }else{
                System.out.println("Không thể xóa file: " + path);
            }
        } else {
            System.out.println("Tập tin/ Thư mục không tồn tại!");
        }
    }

    public static void hienThiCayThuMucChiTiet(String path, int level){
        File file = new File(path);

        for (int i=0; i<level; i++){
            System.out.print("\t");
        }
        if(file.isFile()) { // Kiểm tra file là tập tin
            System.out.println("|__" +file.getName()); // Lấy ra tên file
        }else{
            System.out.println("|__" +file.getName()); // Lấy ra tên file

            // Tiếp tục đệ quy để hiện thị các mục con bên trong
            File[] files = file.listFiles();
            for(File f: files){
                hienThiCayThuMucChiTiet(f.getAbsolutePath(), level+1);
            }
        }
    }
    public static void hienThiCayThucMuc(String path){
        File file = new File(path);
        if(!file.exists()) {
            System.out.println("File không tồn tại");
            return; // Dừng lương hàm
        }
        hienThiCayThuMucChiTiet(path, 0);
    }

    public static void kiemTraThongTin(String path){
        File file = new File(path);
        if(!file.exists()){
            System.out.println("File khong ton tai");
            return; //dung luong ham
        }
        System.out.println("Thong tin chi tiet: ");
        System.out.println("Ten file: "+(file.getName()));
        System.out.println("Loai: "+(file.isFile()?"Tam tin":"Thu muc"));
        System.out.println("File an: "+file.isHidden());
    }

    public static void main(String[] args) {
        // String path = "D:\\Pham Anh Tuan\\LapTrinhMang\\temp";
        // XuLyFile.taoThuMuc(path);

        // String path = "D:\\Pham Anh Tuan\\LapTrinhMang\\dir1\\dir2\\dir3";
        // XuLyFile.taoThuMuc(path);

        // String path = "D:\\temp\\BAITAP.DOCX";
        // XuLyFile.taoTapTin(path);

        //String path = "D:\\Pham Anh Tuan\\LapTrinhMang\\BAITAP.DOCX";
        //XuLyFile.taoTapTin(path);
        //String path = "D:\\Pham Anh Tuan\\LapTrinhMang\\BAITAP.DOCX";
        //XuLyFile.taoTapTin(path);

       // String path = "D:\\Pham Anh Tuan\\LapTrinhMang\\temp";
        //XuLyFile.xoaTatCa(path);
      //  XuLyFile.hienThiCayThucMuc( "D:\\Pham Anh Tuan\\LapTrinhMang\\dir1");
        XuLyFile.kiemTraThongTin("D:\\Pham Anh Tuan\\LapTrinhMang\\");
    }
}