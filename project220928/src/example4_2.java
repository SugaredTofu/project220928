import java.util.Scanner;
public class example4_2
{
    int width;
    int height;
    public double getArea()
    {
        return width*height;
    }
    public static void main(String[] args)
    {
        example4_2 rect = new example4_2(); // 객체 생성
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> ");
        rect.width = scanner.nextInt();
        rect.height = scanner.nextInt();
        System.out.println("사각형의 면적은 " + rect.getArea());
        scanner.close();
    }
}
