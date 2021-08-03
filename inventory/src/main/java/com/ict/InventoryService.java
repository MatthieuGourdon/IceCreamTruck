package com.ict;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class InventoryService {
	
	private final InventoryRepository iRepository;
	
	public InventoryService(InventoryRepository iRepository) {
		this.iRepository = iRepository;
	}
	
	public void createInventory(Inventory inv) {
		Inventory createdInventory = iRepository.save(inv);
		System.out.println(createdInventory);
	}
	
	/*
	 * Looking in the repository if the designated inventory exist, if yes : return inventory, else : return null
	 */
	public Inventory getInventory(Integer id) {
		Optional<Inventory> iOpt = iRepository.findById(id);
		if (iOpt.isPresent()) {
			return iOpt.get();
		} 
		else {
			return null;
		}
	}
	
	
	/*
	 * Here I check everything there is in the repository and I return it as an array of different inventories
	 * I chose an array because if the business works, I will have more than one truck and so more than one inventory
	 */
	public ArrayList<Inventory> getInventories() {
		ArrayList<Inventory> ListInventory = new ArrayList<Inventory>();
		Iterable<Inventory> allInventory = iRepository.findAll();
		Iterator<Inventory> iterator = allInventory.iterator();
		while(iterator.hasNext()) {
		    Inventory it = iterator.next();
		    ListInventory.add(it);
		}
		return ListInventory;
	}
	
//getter if needed for the quantity of each element in the designated inventory

	public Integer getMintQuantity(Integer id) {
		return getInventory(id).getMintQuantity();
	}

	public Integer getChocolateQuantity(Integer id) {
		return getInventory(id).getChocolateQuantity();
	}

	public Integer getStrawberryQuantity(Integer id) {
		return getInventory(id).getStrawberryQuantity();
	}

	public Integer getPistachioQuantity(Integer id) {
		return getInventory(id).getPistachioQuantity();
	}

	public Integer getSnackBarsQuantity(Integer id) {
		return getInventory(id).getSnackBarsQuantity();
	}

//Updating the quantity of snack bars left
	
	public void buySnackBars(Integer id) {
		Inventory Inv = getInventory(id);
		Inv.setSnackBarsQuantity(Inv.getSnackBarsQuantity() - 1);
		iRepository.save(Inv);
	}
	
//One ice cream cost 3 units of the designated flavor

	public void buyIceCream(Integer id, String flavor) {
		Inventory Inv = getInventory(id);
		if (flavor.equals("m")) {
			Inv.setMintQuantity(Inv.getMintQuantity() - 3);
		}
		else if (flavor.equals("c")) {
			Inv.setChocolateQuantity(Inv.getChocolateQuantity() - 3);
		}
		else if (flavor.equals("s")) {
			Inv.setStrawberryQuantity(Inv.getStrawberryQuantity() - 3);
		}
		else if (flavor.equals("p")) {
			Inv.setPistachioQuantity(Inv.getPistachioQuantity() - 3);
		}
		else System.out.println("ERROR : flavor in URL does not exist. Please chose between mint (m), chocolate (c), "
				+ "strawberry (s) and pistachio (p).");
		iRepository.save(Inv);
	}

//One shaved ice cost 2 units of the designated flavor

	public void buyShavedIce(Integer id, String flavour) {
		Inventory Inv = getInventory(id);
		if (flavour.equals("m")) {
			Inv.setMintQuantity(Inv.getMintQuantity() - 2);
		}
		else if (flavour.equals("c")) {
			Inv.setChocolateQuantity(Inv.getChocolateQuantity() - 2);
		}
		else if (flavour.equals("s")) {
			Inv.setStrawberryQuantity(Inv.getStrawberryQuantity() - 2);
		}
		else if (flavour.equals("p")) {
			Inv.setPistachioQuantity(Inv.getPistachioQuantity() - 2);
		}
		else System.out.println("ERROR : flavour in URL does not exist. Please chose between mint (m), chocolate (c), "
				+ "strawberry (s) and pistachio (p).");
		iRepository.save(Inv);
	}
}
	

