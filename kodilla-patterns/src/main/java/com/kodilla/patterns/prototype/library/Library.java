package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Prototype;
import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TasksList;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

    String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }
    @Override
    public String toString() {
        String s = "Library " + name + "\n";
        for (Book books : books) {
            s = s + books.toString() + "\n";
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book bookList : books) {
            Book clonedList = new Book(bookList.getTitle(), bookList.getAuthor(), bookList.getPublicationDate());

            clonedLibrary.getBooks().add(clonedList);
        }
        return clonedLibrary;
    }

}