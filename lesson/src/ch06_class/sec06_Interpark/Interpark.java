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
	//  translator가 없으면 출력하지 않고
	
	@Override
	public String toString() {
		return "Interpark [rank=" + rank + ", title=" + title + ", author=" + author 
				+ ((translator == null) ? "" : ", translator=" + translator)
				+ ", company=" + company 
				+ ", price=" + String.format("%,d", price) + "]";
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

	
	
	
	
//   @Override
//    public String toString() {
//        StringBuilder result = new StringBuilder();
//        result.append("rank: ").append(rank).append("\n");
//        result.append("title: ").append(title).append("\n");
//        result.append("author: ").append(author).append("\n");
//        
//        if (!translator.isEmpty()) {
//            result.append("translator: ").append(translator).append("\n");
//        }
//
//        if (!company.isEmpty()) {
//            result.append("company: ").append(company).append("\n");
//        }
//
//        result.append("price: ").append(price).append("\n");
//
//        return result.toString();
//    }
//
//	public int getRank() {
//		return rank;
//	}
//
//	public void setRank(int rank) {
//		this.rank = rank;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getAuthor() {
//		return author;
//	}
//
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//
//	public String getTranslator() {
//		return translator;
//	}
//
//	public void setTranslator(String translator) {
//		this.translator = translator;
//	}
//
//	public String getCompany() {
//		return company;
//	}
//
//	public void setCompany(String company) {
//		this.company = company;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
}
