import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    private double x;
    private double y;

    @FXML
    private Pane root;
    private GraphicsContext gc;

    @Override
    public void initialize(URL url, ResourceBundle bundle) {
    }

    @FXML
    protected void addTextAction(ActionEvent event) {
        Text text = new Text(50, 50, "Testing123");

        text.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                x = text.getLayoutX() - event.getSceneX();
                y = text.getLayoutY() - event.getSceneY();
            }
        });

        text.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                text.setLayoutX(event.getSceneX() + x);
                text.setLayoutY(event.getSceneY() + y);
            }
        });

        root.getChildren().add(text);
    }

}
