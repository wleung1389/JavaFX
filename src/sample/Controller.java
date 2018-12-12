package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import javax.swing.*;

public class Controller {
    public Label addScore;
    public Label subScore;
    private int score;

    public void addScore(ActionEvent actionEvent) {
        score++;
        addScore.setText("Score : " + score);
    }
    public void subtractScore(ActionEvent actionEvent)
    {
        score--;
        subScore.setText("Score : " + score);
    }
}
