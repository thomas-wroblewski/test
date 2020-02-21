package com.ftd.interviews.exercises.uniqueWords;

import org.junit.Assert;
import org.junit.Test;

/**
 * Given any two arbitrary phrases, return a String of space separated words satisfying
 * the following requirements:
 * <p>
 * -- Only include words that are in one phrase but not the other, checking both phrases.
 * -- Do not have duplicates in the result.
 * -- A word consists of any number of alphabetic characters and/or numbers.
 * -- A word is always separated by at least a space
 * <p>
 * -- develop with the possibility of enhancements
 */
public class UniqueWords implements IUniqueWords {

    /*
     * Write additional test cases as needed!
     */

    @Test
    public void sortedByLengthThenByNatural() {
        String phrase1 = "bbbb ee, dup1 ez z dup2";
        String phrase2 = "d ey dup2, aaa cc ey dup1";
        String expectedResults = "bbbb aaa cc ee ey ez d z";
        Assert.assertEquals("This should be equal to each other",
                            expectedResults,
                            new UniqueWords().process(phrase1, phrase2));
    }
}
