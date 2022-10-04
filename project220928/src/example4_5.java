public class example4_5
{
    String title;
    String author;
    void show() { System.out.println(title + " " + author); }
    public example4_5()
    {
        this("", "");
        System.out.println("생성자 호출됨");
    }
    public example4_5(String title)
    {
        this(title, "작자미상");
    }
    public example4_5(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    public static void main(String [] args) {
        example4_5 littlePrince = new example4_5("어린왕자", "생텍쥐페리");
        example4_5 loveStory = new example4_5("춘향전");
        example4_5 emptyBook = new example4_5();
        loveStory.show();
    }
}