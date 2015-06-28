//Abstract Factory HUD

interface Button { 
	void wither(); 
}

interface Label { 
	void wither(); 
}

interface HUDFactory { 
	Button createButton(); 
	Label createLabel(); 
}

//Concrete Factory
Class LinFactory implements HUDFactory { 
	public Button createButton() { 
		return new LinButton(); 
	}  
		public Label createLabel() { 
			return new LinLabel(); 
	} 
}

//Concrete ITEM

Class LinLabel implements Label { 
	public void wither() { 
		System.out.println("Linux Label"); 
	}
}

Class LinButton implements Button {
	public void wither() { 
		System.out.println("Linux Button"); 
	}
}

//App

class App {
	public App(HUDFactory factory) {
		Button button = factory.createButton();
		Label label = factory.createLabel();
		button.wither();
		label.wither();
	}
}

public class AppRun {
	public static void main(String[] args) {
		new Application(createOsF());
	}

	public static HUDFactory createOsF() {
		String osname = System.getProperty("os.name").toLowerCase();
		if(osname != null && osname.contains("linux"))
			return new LinFactory();
		else
			System.out.println("No such OS known");
	}
}
