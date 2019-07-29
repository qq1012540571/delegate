/**
 * @author 黄豪强
 * @create 2019/7/29 9:27
 */
public class PlayerManager implements Player {
    Player player;

    public  PlayerManager(Player player)
    {
            this.player=player;
    }
    public void play() {
        player.play();
    }
}
