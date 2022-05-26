// SecretMessage.java
// Cooper Cross
// 11/6/21

package chapter12Practice;

public class SecretMessage {
    private String origMess;
    private String codedMess = new String();
    private int encNum;

    public SecretMessage() {
	origMess = "XXX";
	codedMess = "";
	encNum = 0;
    }

    public SecretMessage(String origMess, int encNum) {
	this.origMess = origMess;
	this.encNum = encNum;
    }

    public String getOrigMess() {
	return origMess;
    }

    public void setOrigMess(String origMess) {
	this.origMess = origMess;
    }

    public int getEncNum() {
	return encNum;
    }

    public void setEncNum(int encNum) {
	this.encNum = encNum;
    }

    public String getCodedMess() {
	return codedMess;
    }

    public void setCodedMess() {
	for (int i = 0; i < origMess.length(); i++) {
	    codedMess += (char) (origMess.charAt(i) + encNum);
	}
    }
}