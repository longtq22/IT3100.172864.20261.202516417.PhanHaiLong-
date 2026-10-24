public class DigitalVideoDisc {
    // 1. Các thuộc tính riêng tư (Private attributes)
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // 2. Các phương thức khởi tạo (Constructors - Nạp chồng)
    
    // Constructor 1: Tạo DVD theo tiêu đề
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }

    // Constructor 2: Tạo DVD theo thể loại, tiêu đề và giá tiền
    public DigitalVideoDisc(String category, String title, float cost) {
        super();
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    // Constructor 3: Tạo DVD theo đạo diễn, thể loại, tiêu đề và giá tiền
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    // Constructor 4: Tạo DVD theo đầy đủ thuộc tính
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // 3. Các phương thức truy xuất (Getters)
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }
}