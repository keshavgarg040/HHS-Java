package reviewPrograms;

public class Recording {
    private String songTitle;
    private String songArtist;
    private int songLength;

    public Recording() {
	this("TTTT", "AAAA", 0000);
    }

    public Recording(String title, String artist, int length) {
	setSongTitle(title);
	setSongArtist(artist);
	setSongLength(length);
    }

    public String getSongTitle() {
	return songTitle;
    }

    public void setSongTitle(String sTitle) {
	songTitle = sTitle;
    }

    public String getSongArtist() {
	return songArtist;
    }

    public void setSongArtist(String sArtist) {
	songArtist = sArtist;
    }

    public int getSongLength() {
	return songLength;
    }

    public void setSongLength(int sLength) {
	songLength = sLength;
    }
}
