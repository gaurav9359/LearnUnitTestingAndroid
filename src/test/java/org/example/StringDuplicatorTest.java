package org.example;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringDuplicatorTest {

    StringDuplicator SUT;

    @Before
    public void setUp() {
        SUT = new StringDuplicator();
    }

    //Test for empty string
    @Test
    public void stringDuplicate_emptyString_emtpyReturned(){
        String result=this.SUT.duplicate("");
        Assert.assertThat(result, Is.is(""));

    }

    //Test for one character String
    @Test
    public void stringDuplicate_oneCharacter_twoCharacterReturned(){
        String result=this.SUT.duplicate("a");
        Assert.assertThat(result, Is.is("aa"));

    }

    //Test for longString
    @Test
    public void stringDuplicate_longString_duplicateConcatinationReturned(){
        String result=this.SUT.duplicate("apojaodfo");
        Assert.assertThat(result, Is.is("apojaodfoapojaodfo"));

    }
}