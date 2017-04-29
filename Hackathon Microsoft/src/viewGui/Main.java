package viewGui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.AccessoireBureau;
import model.Bureau;

public class Main {

	private static final String FILENAME = "D:\\Workspace_Java\\Hackathon Microsoft\\src\\viewGui\\listeObjets.txt";
	public static ArrayList<AccessoireBureau> maListeObjets = new ArrayList<AccessoireBureau>();
	
	
	public static void main(String arg[]) {
		/**
		 * Chargement des objets.
		 */
		Bureau monBureau = new Bureau(200.0, 150.0);
		AccessoireBureau monAccessoire;
		String parts[];		

		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				parts = sCurrentLine.split(";");
				monAccessoire = new AccessoireBureau(parts[0], Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
				maListeObjets.add(monAccessoire);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		/** AccessoireBureau monAccessoire = new AccessoireBureau("Billy", 20.0, 30.0);
		AccessoireBureau monAccessoire2 = new AccessoireBureau("Billy2", 20.0, 30.0); **/
		
		/** maListeObjets.add(monAccessoire);
		maListeObjets.add(monAccessoire2); **/
		
		mainGui maGui = new mainGui();
	}
}
