package dossier;

import java.util.List;

public class Order {

    private String owner;
    private String target;
    private List<String> cocktails;

	public void declareOwner(String string) {
        this.owner=string;
	}

    public void declareTarget(String string) {
        this.target=string;
    }

    public List<String> getCocktails() {
        return cocktails;
    }
    
}
