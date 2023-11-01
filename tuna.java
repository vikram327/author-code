package simple;

public class tuna {
	private String girlName;
	
	public tuna(String name) {
		girlName=name;
	}
  //  public void setName(String name) {
    	
  //  	girlName=name;
  //  }
      public String getName(){
    	return girlName;
    	  }
    public void  Display() {
    	System.out.printf("your first gf was %s",getName());
    }
}
