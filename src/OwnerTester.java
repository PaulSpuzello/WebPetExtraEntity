import java.util.ArrayList;
import java.util.List;

import controller.OwnerHelper;
import model.ListDetails;
import model.ListPet;
import model.owner;

public class OwnerTester {
	public static void main(String[] args) {

		
		ListDetailsHelper ldh = new ListDetailsHelper();
		
		ListPet sarge = new ListPet("German Shephard", "Sarge", "Jack");
		ListPet goldie = new ListPet("Golden Retriever", "Goldie", "Mollie");
		
		List<ListPet> jefferysPets = new ArrayList<ListPet>();
		jefferysPets.add(sarge);
		
		List<ListPet> molliesPets = new ArrayList<ListPet>();
		molliesPets.add(goldie);

		
		List<ListDetails> allOwners = ldh.getLists();
		for(ListDetails a: allOwners) {
			System.out.println(a.toString());
		}
	}
}
