package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("AuthorA", "Book1", 2000, "0001"));
        books.add(new Book("AuthorB", "Book2", 2002, "0002"));
        books.add(new Book("AuthorC", "Book3", 1998, "0003"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        Assertions.assertEquals(2000, median);


    }
}
