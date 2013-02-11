package aplicacao;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class FramePosition {
    
    static public void setPosicao(JFrame j) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = j.getSize().width;
        int h = j.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;
        j.setLocation(x, y);
    }
}
