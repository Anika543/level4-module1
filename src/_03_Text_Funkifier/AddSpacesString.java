package _03_Text_Funkifier;

public class AddSpacesString implements TextFunkifier{

	String unfunkifiedText; 
	
	public AddSpacesString(String unfunkifiedText) {
		this.unfunkifiedText = unfunkifiedText; 
	}
	
	
	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder(unfunkifiedText);
		for(int i = 0; i<unfunkifiedText.length()*2-1; i++) {
			
		}
		
		
		return null;
	}
	
	

}
