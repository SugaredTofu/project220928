public class example4_4
{
    String title;
    String author;
    public example4_4(String t) // 생성자
    {
        title = t; author = "작자미상";
    }
    public example4_4(String t, String a) // 생성자
    {
        title = t; author = a;
    }
    public static void main(String [] args)
    {
        example4_4 littlePrince = new example4_4("어린왕자", "생텍쥐페리");
        example4_4 loveStory = new example4_4("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}