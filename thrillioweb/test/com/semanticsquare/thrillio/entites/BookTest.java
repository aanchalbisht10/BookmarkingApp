package com.semanticsquare.thrillio.entites;

import static org.junit.Assert.*;

import org.junit.Test;

import com.semanticsquare.thrillio.constants.BookGenre;
import com.semanticsquare.thrillio.entities.Book;
import com.semanticsquare.thrillio.managers.BookmarkManager;

public class BookTest {

	@Test
	public void testIsKidFriendlyEligible() {
		//Test1:
		Book book= BookmarkManager.getInstance().createBook(4000,"Walden"," ",1854,"Wilder Publications",new String[]{"Henry David Thoreau"},BookGenre.PHILOSOPHY,4.3);
		boolean isKidFriendlyEligible=book.isKidFriendlyEligible();
		
		assertFalse("For Philosophy Genre- isKidFriendlyEligible should return false",isKidFriendlyEligible);
		
		//Test2:
		
		book= BookmarkManager.getInstance().createBook(4000,"Walden"," ",1854,"Wilder Publications",new String[]{"Henry David Thoreau"},BookGenre.SELF_HELP,4.3);
		isKidFriendlyEligible=book.isKidFriendlyEligible();
		
		assertFalse("For Self- help Genre- isKidFriendlyEligible should return false",isKidFriendlyEligible);
		
	}

}
