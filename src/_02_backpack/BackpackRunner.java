package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		Pencil pencil = new Pencil();
		Ruler ruler = new Ruler();
		Backpack my = new Backpack();
		Textbook book = new Textbook();
		
		my.packAndCheck();
		my.putInBackpack(pencil);
		my.putInBackpack(ruler);
		my.putInBackpack(pencil);
		my.putInBackpack(book);
		my.packAndCheck();
		
		
		
	}
}
