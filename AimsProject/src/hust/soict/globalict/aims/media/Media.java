package hust.soict.globalict.aims.media;
import java.util.Comparator;

public abstract class Media {
	private int id;
    private String title;
    private String category;
    private float cost;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public Media(String title) {
        this.title = title;
    }
    
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    
    public Media(int id, String title, float cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }
    
    public Media(String title, String category) {
		this.title = title;
		this.category = category;
	}

	public static class MediaComparatorByCostTitle implements Comparator<Media> {
        @Override
        public int compare(Media media1, Media media2) {
            int result = media1.getTitle().compareTo(media2.getTitle());
            if (result == 0) {
                result = Float.compare(media2.getCost(), media1.getCost());
            }
            return result;
        }
    }

    public static class MediaComparatorByTitleCost implements Comparator<Media> {
        @Override
        public int compare(Media media1, Media media2) {
            int result = Float.compare(media2.getCost(), media1.getCost());
            if (result == 0) {
                result = media1.getTitle().compareTo(media2.getTitle());
            }
            return result;
        }
    }
    
    public int TitleComparator(Media other) {
        int titleComparison = this.getTitle().compareTo(other.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        }
        // If titles are the same, compare by cost
        return Float.compare(this.getCost(), other.getCost());
    }
    
    public int CostComparator(Media other) {
        int costComparison = Float.compare(this.getCost(), other.getCost());
        if (costComparison != 0) {
            return costComparison;
        }
        // If costs are the same, compare by title
        return this.getTitle().compareTo(other.getTitle());
    }
    
    public boolean isMatch(String keyword) {
        return title.toLowerCase().contains(keyword.toLowerCase());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Media other = (Media) obj;
        return title.equals(other.title);
    }
}
