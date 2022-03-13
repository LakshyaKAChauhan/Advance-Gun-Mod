package net.chauhanDevs.advance_modder.customs;

public class reload {

	public static void reloadMain(){
		if(isGunSelected.isGunSelected()) {
			//setNbtData.nbtBullet = AK_47.magazineSize;
			reloadMessage();
		}
	}

	public static void reloadMessage() {
		System.out.println("Reload Pressed");
	}
	
	
}
