package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


public class AppTest
{

    @Test
    void testPushAndPop() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
    }

}
