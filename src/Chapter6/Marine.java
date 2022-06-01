package Chapter6;
/* 연습문제 6-7
다음은 컴퓨터 게임의 Marine을 클래스로 정의한 것이다. 이 클래스의 멤버중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
(단, 모든 병사의 공격력과 방어력은 같아야 한다.)
 */
public class Marine {
    int x = 0, y = 0; // Marine의 위치좌표
    int hp = 60;      // 현재 체력
    static int weapon = 6;   // 공격력
    static int armor = 0;    // 방어력

    void weaponUp() {
        weapon++;
    }

    void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
