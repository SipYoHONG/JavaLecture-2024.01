package ch06_class.sec06_Interpark;

public class Interpark {
	private int rank;
	private	String title;
	private String author;
	private String translator;
	private String company;
	private int price;
	
	public Interpark () { }

	public Interpark(int rank, String title, String author, String translator, String company, int price) {
		this.rank = rank;
        this.title = title;
        this.author = author;
        this.translator = translator;
        this.company = company;
        this.price = price;
        
    }

   @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("순위: ").append(rank).append("\n");
        result.append("제목: ").append(title).append("\n");
        result.append("저자: ").append(author).append("\n");
        
        // 번역자 정보가 비어 있지 않은 경우에만 출력
        if (!translator.isEmpty()) {
            result.append("번역자: ").append(translator).append("\n");
        }

        // 출판사 정보가 비어 있지 않은 경우에만 출력
        if (!company.isEmpty()) {
            result.append("출판사: ").append(company).append("\n");
        }

        result.append("가격: ").append(price).append("\n");

        return result.toString();
    }

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTranslator() {
		return translator;
	}

	public void setTranslator(String translator) {
		this.translator = translator;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
