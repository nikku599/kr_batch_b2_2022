/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package day.junit.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
    
        Assertions.assertEquals(true, classUnderTest.someLibraryMethod());
    }
}