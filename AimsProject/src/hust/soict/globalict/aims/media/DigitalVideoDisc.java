package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;
	
	public DigitalVideoDisc(String title) {
		super(title);
		setTitle(title);
		nbDigitalVideoDiscs++;
	    setId(nbDigitalVideoDiscs);
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
		setTitle(title);
		setCategory(category);
		setCost(cost);
		nbDigitalVideoDiscs++;
	    setId(nbDigitalVideoDiscs);
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, cost);
		setTitle(title);
		setCategory(category);
		this.director = director;
		setCost(cost);
		nbDigitalVideoDiscs++;
	    setId(nbDigitalVideoDiscs);
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost, length, director);
		setTitle(title);
		setCategory(category);
		this.director = director;
		this.length = length;
		setCost(cost);
		nbDigitalVideoDiscs++;
	    setId(nbDigitalVideoDiscs);
	}
	
	@Override
	public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + director + " - " + length + ": " + getCost();
    }
	
	public boolean isMatch(String title) {
        return getTitle().equalsIgnoreCase(title);
    }
	
	public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("DVD length: " + getLength());
    }
}
