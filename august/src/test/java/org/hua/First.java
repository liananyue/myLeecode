package org.hua;

import org.junit.Test;

public class First {
    public String A(){
        return "A";
    }


    @Test
    public void testA(){
        System.out.println(A());
    }
}
