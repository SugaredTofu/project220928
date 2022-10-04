import java.util.InputMismatchException;
import java.util.Scanner;

class Player
{
    String name; // 게임 참가자의 이름
    String word; // 게임 참가자의 단어

    void getWordFromUser()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print(name + ">>");
        String word = scan.next();

        this.word = word;
    }
    boolean checkSuccess(String lastWord)
    {
        int lastIndex = lastWord.length() - 1; // 마지막 문자에 대한 인덱스
        char lastChar = lastWord.charAt(lastIndex); // 마지막 문자
        char firstChar = word.charAt(0); // 첫번째 문자

        if(lastChar == firstChar) // 성공
            return true;
        else
            return false;
    }
}
public class practice_open_challenge
{
    static Scanner scan = new Scanner(System.in);

    public static void run()
    {
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        int num = scan.nextInt();

        Player[] player = new Player[num]; // 참가자 숫자 만큼의 Player 객체를 배열로 생성

        for(int i=0; i<num; i++)
        {
            System.out.print("참가자의 이름을 입력하세요>>");
            String name = scan.next();
            player[i] = new Player();
            player[i].name = name; // 참가자의 이름
        }

        System.out.println("시작하는 단어는 아버지입니다.");

        String lastWord = "아버지";
        int i = 0;

        while(true)
        {
            player[i].getWordFromUser(); // 참가자의 단어

            if(!(player[i].checkSuccess(lastWord))) // 성공 판별
            {
                System.out.println(player[i].name + "이(가) 졌습니다.");
                break;
            }

            lastWord = player[i].word; // 마지막 단어를 참가자의 단어로 변경

            i++; // 다음 참가자
            if(i == num) // 마지막 참가자 순서 이후 첫번째 참가자로 돌아감
                i = 0;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("끝말잇기 게임을 시작합니다...");

        while(true)
        {
            try
            {
                run(); // 게임 진행

                while(true)
                {
                    System.out.print("게임을 다시 하시겠습니까(네/아니오)>>");
                    String restart = scan.next();

                    if(restart.equals("네"))
                    {
                        System.out.println("끝말잇기 게임을 시작합니다...");
                        break;
                    }
                    else if(restart.equals("아니오"))
                    {
                        System.out.println("끝말잇기 게임을 종료합니다...");
                        System.exit(0); // 시스템 종료
                    }
                    else
                    {
                        System.out.println("잘못된 입력입니다.");
                        continue;
                    }
                }

            }
            catch(InputMismatchException e)
            {
                System.out.println("잘못된 입력입니다.");
                scan.nextLine(); // 입력값 clear
                continue;
            }
        }
    }
}