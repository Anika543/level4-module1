package _03_Text_Funkifier;

public class MixedCapsString {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }
    
    public String funkifyText() {
    	StringBuilder builder = new StringBuilder(unfunkifiedText);
    	
    	for(int i = 0; i<builder.length(); i++) {
    		if(i%2 == 0) {
    			char letter = builder.charAt(i); 
    			letter = Character.toLowerCase(letter);  
    	
    			builder.setCharAt(i, letter);
    		}
    		else {
    			char letter = builder.charAt(i); 
    			letter = Character.toUpperCase(letter); 
    			
    			builder.setCharAt(i, letter);
    			
    		}
    	}
    	
    	return builder.toString(); 
    }

}
