import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(" 123", " Thư viện VKU ");

        while (true) {
            System.out.println("1. Thêm sách: ");
            System.out.println("2. Xoá sách");
            System.out.println("3. Tìm sách");
            System.out.println("4. Hiển thị toàn bộ sách");
            System.out.println("5. Thông tin Thư viện");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID sách: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập tiêu đề sách: ");
                    String title = scanner.nextLine();
                    System.out.print("Nhập tên tác giả: ");
                    String author = scanner.nextLine();
                    System.out.print("Nhập thể loại sách: ");
                    String genre = scanner.nextLine();
                    System.out.print("Nhập năm xuất bản: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tình trạng sách: ");
                    String status = scanner.nextLine();
                    library.addBook(new Book(id, title, author, genre, year, status));
                    break;
                case 2:
                    System.out.print("ID sách cần xoá: ");
                    String removeId = scanner.nextLine();
                    library.removeBook(removeId);
                    break;
                case 3:
                    System.out.print("Tiêu đề hoặc tác giả muốn kiếm: ");
                    String query = scanner.nextLine();
                    System.out.println("Kết quả tìm kiếm: " + library.searchBooks(query));
                    break;
                case 4:
                    System.out.println("Tất cả sách: " + library.getAllBooks());
                    break;
                case 5:
                    System.out.println("Thông tin Thư viện: " + library);
                    break;
                case 6:
                    System.out.println("Bye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy thử lại!");
            }
        }
    }
}
