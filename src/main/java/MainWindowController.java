import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    @FXML
    private Canvas canvas;
    private GraphicsContext gc;

    @Override
    public void initialize(URL url, ResourceBundle bundle) {
        System.out.println("init canvas");
        gc = canvas.getGraphicsContext2D();

    }

    @FXML
    protected void addTextAction(ActionEvent event) {
        drawText("Testing", 50, 50);
    }

    private void drawText(String text, int x, int y) {
        gc.strokeText(text, x, y);
    }
}
