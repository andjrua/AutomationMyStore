package com.automationpractice.mystore.utils;

import static com.automationpractice.mystore.userinterfaces.MyStoreSearhPage.*;

import net.serenitybdd.screenplay.targets.Target;

public enum SortBy {

	LOWEST_PRICE(PRICEASC),
	HIGHEST_PRICE(PRICEDESC),
	NAME_A_TO_Z(NAMEASC),
	NAME_Z_TO_A(NAMEDESC),
	IN_STOCK(INSTOCK),
	LOWEST_REFERENCE(LOWREF),
	HIESTS_REFERENCE(HIGHREF);
	
	private Target sortBy;
	
	private SortBy(Target sortBy) {
		this.sortBy = sortBy;
	}
	
	public Target getTarget() {
		return sortBy;
	}
}
