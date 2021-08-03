package com.ict;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryRestCtr {
	
	@Autowired
	InventoryService iService;
	
	@RequestMapping(method=RequestMethod.POST, value="/createInventory")
	public void createInventory(@RequestBody Inventory inv) {
		iService.createInventory(inv);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/getInventory/{id}")
	public Inventory getInventory(@PathVariable Integer id) {
        Inventory Inv = iService.getInventory(id);
        return Inv;
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/getInventories")
	public ArrayList<Inventory> getInventories() {
        ArrayList<Inventory> InvList = iService.getInventories();
        return InvList;
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/getMintQuantity/{id}")
	public Integer getMintQuantity(@PathVariable Integer id) {
        Integer Mint = iService.getMintQuantity(id);
        return Mint;
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/getChocolateQuantity/{id}")
	public Integer getChocolateQuantity(@PathVariable Integer id) {
        Integer Chocolate = iService.getChocolateQuantity(id);
        return Chocolate;
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/getStrawberryQuantity/{id}")
	public Integer getStrawberryQuantity(@PathVariable Integer id) {
        Integer Strawberry = iService.getStrawberryQuantity(id);
        return Strawberry;
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/getPistachioQuantity/{id}")
	public Integer getPistachioQuantity(@PathVariable Integer id) {
        Integer Pistachio = iService.getPistachioQuantity(id);
        return Pistachio;
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/getSnackBarsQuantity/{id}")
	public Integer getSnackBarsQuantity(@PathVariable Integer id) {
        Integer SnackBars = iService.getSnackBarsQuantity(id);
        return SnackBars;
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/buySnackBars/{id}")
	public void buySnackBars(@PathVariable Integer id) {
		iService.buySnackBars(id);
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/buyIceCream/{flavor}/{id}")
	public void buyIceCream(@PathVariable Integer id, @PathVariable String flavor) {
		iService.buyIceCream(id, flavor);
    }
	
	
	@RequestMapping(method=RequestMethod.GET,value="/buyShavedIce/{flavor}/{id}")
	public void buyShavedIce(@PathVariable Integer id, @PathVariable String flavor) {
		iService.buyShavedIce(id, flavor);
    }
}
