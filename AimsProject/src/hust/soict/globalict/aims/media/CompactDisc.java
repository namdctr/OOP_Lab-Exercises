package hust.soict.globalict.aims.media;
import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	private String artist;
    private List<Track> tracks;

    public CompactDisc(String title, String category, String director, String artist, int length, float cost) {
        super(title, category, cost, length, director);
        this.artist = artist;
        tracks = new ArrayList<>();
    }

    public CompactDisc(String title, String artist) {
		super(title);
		this.artist = artist;
    }

	public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists in the Compact Disc.");
        } else {
            tracks.add(track);
            System.out.println("Track added to the Compact Disc.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed from the Compact Disc.");
        } else {
            System.out.println("Track does not exist in the Compact Disc.");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    
    public void play() {
        System.out.println("Playing compact disc: " + getTitle());
        System.out.println("Artist: " + artist);
        System.out.println("Total Length: " + getLength());

        System.out.println("Tracks:");
        for (Track track : tracks) {
            track.play();
        }
    }
    
    @Override
    public String toString() {
    	return "CompactDisc - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getArtist() + " - " + getLength() + ": " + getCost();
    }
}
