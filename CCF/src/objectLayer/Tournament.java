package objectLayer;

import java.sql.Date;

public class Tournament {
	private int id = 0;
	private String EmbedCode;
	private String name;
	private Date date;
	private int entryFee;
	private String firstPrize;
	private String secondPrize;
	private String thirdPrize;
	private String type;
	
	
	public Tournament(int id,  String name, Date date, String type , int enteryFee, String firstPrize, String secondPrize, String thirdPrize ) {
		this.id = id;
		
		this.date = date;
		this.name = name;
		this.entryFee = entryFee;
		this.firstPrize = firstPrize;
		this.secondPrize = secondPrize;
		this.thirdPrize = thirdPrize;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public String getEmbedCode() {
		return EmbedCode;
	}

	public void setEmbedCode(String embedCode) {
		EmbedCode = embedCode;
	}
	
	public void setEntryFee(int e){
		entryFee = e;
		
	}
	public void setFirstPrize(String e){
		firstPrize = e;
		
	}
	public void setSecondPrize(String e){
		secondPrize = e;
		
	}
	public void setThirdPrize(String e){
		thirdPrize= e;
		
	}
	
	public int getEntrefee(String e){
	
		return entryFee;
	}
	
	public String getFirstPrizee(String e){
		
		return firstPrize;
	}
	
	public String getSecondPrize(String e){
		
		return secondPrize;
	}

	public String getThirdPrize(String e){
	
	return thirdPrize;
}
	
	public String getType(){
		
		return type;
	}
	
	public void setType(String g){
		this.type = g;
	}
	
	
}
