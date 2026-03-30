package day4.switchexample;

    public class SwitchCase02 {
        public static void main(String[] args) {
            /*
            break가 없어도 switch-case 기본 동작과 목적에 부합하게 간결하게
            switch 표현식의 화살표 문법
            케이스 내의 실행문을 실행한 뒤 바로 문을 빠져나간다

            switch-case 문 자체를 변수에 대입하도록 쓰는 방법
            한줄의 실행문이 되기 때문에 세미콜론이 필요함
             */


            String medalColor = "Gold";
            String message = switch (medalColor) {
                case "Gold" -> "금메달입니다";
                case "Silver" -> "은메달입니다";
                case "Bronze" -> "동메달입니다";
                default -> "메달이 없습니다";
            };
            System.out.println(message);
        }
    }



    /*

        String medalColor = "Gold";
        String message = switch (medalColor) {
            case "Gold" -> "금메달입니다";
            case "Silver" -> "은메달입니다";
            case "Bronze" -> "동메달입니다";
            default -> {
                if ("blank" == medalColor) {
                    yield "없는 메달입니다";
                } else {
                    yield "알 수 없습니다";
                    //yield : switch-case 안에 복잡한 제어문이 더 들어가는 경우에 수행 결과를 반환하기 위하여 사용
                }
            }
        };
        System.out.println(message);

     */