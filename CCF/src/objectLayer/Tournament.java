package objectLayer;

import java.sql.Date;

public class Tournament {
	private int id = 0;
	private String EmbedCode;
	private String name;
	private String date;
	private String entryFee;
	private String firstPrize;
	private String secondPrize;
	private String thirdPrize;
	private String type;
	
	
	public Tournament(int id,  String name, String date, String type ,  String firstPrize, String secondPrize, String thirdPrize, String entryFee ) {
		this.id = id;
		
		this.date = date;
		this.setName(name);
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
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getEmbedCode() {
		return EmbedCode;
	}

	public void setEmbedCode(String embedCode) {
		EmbedCode = embedCode;
	}
	
	public void setEntryFee(String e){
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
	
	public String getEntrefee(){
	
		return entryFee;
	}
	
	public String getFirstPrizee(){
		
		return firstPrize;
	}
	
	public String getSecondPrize(){
		
		return secondPrize;
	}

	public String getThirdPrize(){
	
	return thirdPrize;
}
	
	public String getType(){
		
		return type;
	}
	
	public void setType(String g){
		this.type = g;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
