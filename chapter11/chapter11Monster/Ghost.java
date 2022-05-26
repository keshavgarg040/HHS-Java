package chapter11Monster;

import java.awt.*;

public class Ghost extends Monster {
    private Color ghostColor;

    public Ghost(String nam, String bP, int ag, Color ghostColor) {
	super(nam, bP, ag);
	setGhostColor(ghostColor);
    }

    public Color getGhostColor() {
	return ghostColor;
    }

    public void setGhostColor(Color ghostColor) {
	this.ghostColor = ghostColor;
    }

    @Override
    public void scaryFactor() {

    }
}
