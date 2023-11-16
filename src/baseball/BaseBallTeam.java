package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;

    //引数なし
    public BaseBallTeam() {

    }

    //引数あり
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getwin() {
        return win;
    }

    public void setwin(int win) {
        this.win = win;
    }

    public int getlose() {
        return lose;
    }

    public void setlose(int lose) {
        this.lose = lose;
    }

    public int getdraw() {
        return draw;
    }

    public void setdraw(int draw) {
        this.draw = draw;
    }

    //勝率のメソッド

    public double getRate() {
        return (double) this.win / (this.win + this.lose);
    }

        //reportのメソッド

        public void report() {
            System.out.println(this.name + "の2022年の成績は" + this.win + "勝" + this.lose + "敗" + this.draw + "分、勝率は" + getRate() + "です");

        }


    }

