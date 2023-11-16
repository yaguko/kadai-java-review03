package baseball;

public class Review03 {

    public static void main(String[] args) {
        //　各チームの情報
        BaseBallTeam[]team = new BaseBallTeam[6];
        team[0] = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        team[1] = new BaseBallTeam("横浜DeNAbベイスターズ", 73, 68, 2);
        team[2] = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        team[3] = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        team[4] = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        team[5] = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
        for (BaseBallTeam result : team) {
            result.report();
          }
        }
      }
