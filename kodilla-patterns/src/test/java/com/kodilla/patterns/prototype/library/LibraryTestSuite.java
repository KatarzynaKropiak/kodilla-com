package com.kodilla.patterns.prototype.library;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //given
        Library library = new Library("National");
        Book book1 = new Book("Fan", "Danny Rhodes", LocalDate.parse("1990-02-02"));
        Book book2 = new Book("1984", "George Orwell", LocalDate.parse("1948-02-02"));
        Book book3 = new Book("Idiot", "Fyodor Dostoevsky", LocalDate.parse("1850-02-02"));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Academic");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Public");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}

