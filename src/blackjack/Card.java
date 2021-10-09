package blackjack;

public class Card {
    private String pattern; //무늬
    private String denomination; //숫자, 값

    public Card(String pattern, String denomination) {
        super();//직속 부모를 가르킨다.
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {//private라 메소드 이용 게터 세터,생성자 이용
        return this.pattern;
    }
    public String getDenomination() {
        return this.denomination;
    }

    public int getPoint() {
        //denomination값이 "A" > 1
        // "2" > 2
        // "3" > 3
        // ...
        // "10" > 10
        // "J", "Q", "K" > 10
        switch(denomination) {
            case "A":
                return 1;
            case "J": case "Q": case "K" :
                return 10;
            default: //"2"~"10" > 문자열 정수형으로 parsing (파싱)
                return Integer.parseInt(denomination);
                //String.valueOf()문자열 인트 문자열 ~
        }
    }
    @Override
    public String toString() {
        return String.format("%s - %s", this.pattern, this.denomination);
    }
}