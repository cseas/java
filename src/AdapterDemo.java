// Demonstrate an adapter
// Created by Abhijeet Singh
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
    <applet code="AdapterDemo" width=300 height=100>
    </applet>
 */

public class AdapterDemo extends Applet {
    public void init() {
        addMouseListener(new MyMouseAdapter(this));
    }
}

class MyMouseAdapter extends MouseAdapter {
    AdapterDemo adapterDemo;

    public MyMouseAdapter(AdapterDemo adapterDemo) {
        this.adapterDemo = adapterDemo;
    }

    // Handle mouse clicked

    @Override
    public void mouseClicked(MouseEvent e) {
        adapterDemo.showStatus("Mouse clicked");
    }
}
