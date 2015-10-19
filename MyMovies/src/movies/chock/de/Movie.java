package movies.chock.de;

import java.util.Date;

/**
 * @author cbrueggemann
 * @version 0.1
 * @see Class Movie
 */
public class Movie {

	String id;
	String name;
	Date datum;
	
	/*
	 * @param id
	 * @param name
	 * @param datum
	 */
	public Movie (String id, String name, Date datum) {
		this.id=id;
		this.name=name;
		this.datum=datum;
	}
	
	/*
	 * @return the id
	 */
	public String getId(String id) {
		return this.id;
	}
	
	/* 
	 * @param id
	 */
	public void setId(String id) {
		this.id=id;
	}
	
	/*
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
	
	/*
	 * @param the name
	 */
	public void setName(String name) {
		this.name=name;
	}
	
	/*
	 * @return the datum
	 */
	public Date getDatum() {
		return datum;
	}
	
	/*
	 * @param the datum
	 */
	public void setDatum(Date datum) {
		this.datum=datum;
	}
	
	/*
	 * @Override
	 */
	public String toString() {
		return "Movie [id="+id+", name="+name+", datum="+datum+"] ";
	}
}
