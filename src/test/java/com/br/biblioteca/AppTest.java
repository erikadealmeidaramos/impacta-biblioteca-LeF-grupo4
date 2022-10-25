package com.br.biblioteca;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.br.biblioteca.domain.Book;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldCreateBooksWithoutErrors(){

        var expectedTitle = "Title";
        var expectedEdition = 1;

        var b = new Book("Title", 1);
        assertEquals(b.getTitle(), "Title");
        assertEquals(b.getEdition(), 1);
    }
}
