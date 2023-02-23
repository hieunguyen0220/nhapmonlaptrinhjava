import java.util.Scanner;

public class usetoantu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); // Khai báo đối tượng scanber
        System.out.println("Enter width: ");
        width = scanner.nextFloat(); // Nhập chiều rộng

        System.out.print("Enter height: ");
        height = scanner.nextFloat(); //Nhập chiều dài

        // Tính diện tích hcn và hiển thị ra màn hình
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
