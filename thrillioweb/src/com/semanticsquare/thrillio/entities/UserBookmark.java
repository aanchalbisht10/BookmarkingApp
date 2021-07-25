package com.semanticsquare.thrillio.entities;

public class UserBookmark {
	private static User user;
	private static Bookmark bookmark;

	public static User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public static Bookmark getBookmark() {
		return bookmark;
	}
	public void setBookmark(Bookmark bookmark) {
		this.bookmark = bookmark;
	}
}

