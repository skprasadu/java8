package com.hcl.predicate;
public class Hosting {

	private int Id;
    private String name;
    private String url;

    public Hosting(int id, String name, String url) {
        Id = id;
        this.name = name;
        this.url = url;
    }
	
	
    @Override
	public String toString() {
		return "Hosting [Id=" + Id + ", name=" + name + ", url=" + url + ", toString()=" + super.toString() + "]";
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	

    
}
