package day4.switchexample;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        switch (조건) {
        case 조건과 일치하는지 확인할 값1 : 수행문;
        break;
        case 조건과 일치하는지 확인할 값2 : 수행문;
        break;
        default : 수행문;
        }
        break? 케이스에 일치하는 경우 수행문을 시행하고 switch-case 문을 빠져나가게 함. 하지 않으면 넘어가 다음 케이스의 결과가 나오게 됨
        default? 어떤케이스에도 해당되지 않으면 수행할 명령
        */

        int ranking = 1;
        String medalColor = "Gold";
        // 케이스에 문자열을 지정해도 일치 여부를 확인 가능하다
        switch (medalColor) {
            case "Gold":
                System.out.println("금메달입니다");
                break;
            case "Silver":
                System.out.println("은메달입니다");
                break;
            case "Bronze":
                System.out.println("동메달입니다");
                break;
            default:
                System.out.println("메달이 없습니다");;
        }
        //System.out.println(ranking + "등 메달의 색은 " + medalColor + "입니다.");

    }
}
