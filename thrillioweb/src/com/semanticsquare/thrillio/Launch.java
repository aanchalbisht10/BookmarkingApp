package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.managers.BookmarkManager;
import com.semanticsquare.thrillio.managers.UserManager;

public class Launch {
	private static User[] users;
	private static Bookmark[][] bookmarks;

	private static void loadData() {
		System.out.println("1.Loading Data......");
		DataStore.loadData();

		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
	}
	
//  For printing:
//	private static void printUserData() {
//		for (User user : users) {
//			System.out.println(user);
//		}
//	}
//	private static void printBookmarkData() {
//		for (Bookmark[] bookmarkList : bookmarks) {
//			for (Bookmark bookmark : bookmarkList) {
//				System.out.println(bookmark);
//			}
//		}
//	}
	public static void main(String[] args) {
		loadData();
		start();
//		printUserData();
//		printBookmarkData();
//		startBookmarking();	
	}
    private static void start() {
	
    //	System.out.println("2. Bookmarking");
    	for(User user:users) {
    		View.browse(user,bookmarks);
    	}
	
    }
}

