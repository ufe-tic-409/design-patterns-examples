package io.gawish.state;

public class DuckingPlayerState extends PlayerState {
    public void onEnter(Player player) {
        player.setCurrentImg(PlayerImg.DUCKING);
    }

    @Override
    public PlayerState handleInput(String input, Player player) {
        if (input.compareTo("w") == 0) {
            return new StandingPlayerState();
        }
        return new DuckingPlayerState();
    }
}
