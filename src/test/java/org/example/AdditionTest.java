package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class AdditionTest {
        Addition oreno;

        @Before
        public void setUp(){
            oreno= new Addition();
        }

        @Test
        public void test1(){
            boolean result= oreno.isPositive(2);
            Assert.assertThat(result,is(true));
        }
        @Test
        public void test2(){
            boolean result= oreno.isPositive(0);
            Assert.assertThat(result,is(false));
        }
        @Test
        public void test3(){
            boolean result= oreno.isPositive(2);
            Assert.assertThat(result,is(true));
        }
        @Test
        public void test4(){
            boolean result= oreno.isPositive(-1);
            Assert.assertThat(result,is(false));
        }

    

}