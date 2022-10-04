public class example4_3
{
    int radius;
    String name;
    public example4_3() // 원의 면적 계산 메소드
    {
        radius = 1; name = "";
    }
    public example4_3(int r, String n)
    {
        radius = r; name = n;
    }
    public double getArea()
    {
        return 3.14*radius*radius;
    }
    public static void main(String[] args)
    {
        example4_3 pizza = new example4_3(10, "자바피자"); // Circle 객체 생성, 반지름 10
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);
        example4_3 donut = new example4_3(); // Circle 객체 생성, 반지름 1
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
