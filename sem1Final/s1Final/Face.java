package s1Final;

import java.awt.Color;

public abstract class Face {
    protected Color faceColor;
    protected Color eyeColor;
    protected Color mouthColor;
    protected int faceSize;
    protected int eyeSize;
    protected int mouthStartArc;
    protected int mouthEndArc;

    public Color getFaceColor() {
	return faceColor;
    }

    public void setFaceColor(Color faceColor) {
	this.faceColor = faceColor;
    }

    public Color getEyeColor() {
	return eyeColor;
    }

    public void setEyeColor(Color eyeColor) {
	this.eyeColor = eyeColor;
    }

    public Color getMouthColor() {
	return mouthColor;
    }

    public void setMouthColor(Color mouthColor) {
	this.mouthColor = mouthColor;
    }

    public int getFaceSize() {
	return faceSize;
    }

    public void setFaceSize(int faceSize) {
	this.faceSize = faceSize;
    }

    public int getEyeSize() {
	return eyeSize;
    }

    public void setEyeSize(int eyeSize) {
	this.eyeSize = eyeSize;
    }

    public int getMouthStartArc() {
	return mouthStartArc;
    }

    public void setMouthStartArc(int mouthStartArc) {
	this.mouthStartArc = mouthStartArc;
    }

    public int getMouthEndArc() {
	return mouthEndArc;
    }

    public void setMouthEndArc(int mouthEndArc) {
	this.mouthEndArc = mouthEndArc;
    }

    public abstract String makeNoise();
}
