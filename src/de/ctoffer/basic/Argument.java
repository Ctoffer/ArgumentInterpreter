package de.ctoffer.basic;

public interface Argument<T> {
	boolean matches(String[] args, int curPos);
}
