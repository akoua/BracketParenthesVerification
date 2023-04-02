package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void unclosed_bracket_or_parentheses() {
        //given
        //when
        //then
        assertEquals(false, Main.isBalanced("(("));
        assertEquals(false, Main.isBalanced("[["));
        assertEquals(false, Main.isBalanced("[[)"));
        assertEquals(false, Main.isBalanced("([][]("));
        assertEquals(false, Main.isBalanced("(()()[]]"));
        assertEquals(false, Main.isBalanced("([((([(([]))])))))])"));
        assertEquals(false, Main.isBalanced("[](()()[[]])[][[([])"));
    }

    @Test
    void closed_bracket_or_parentheses() {
        //given
        //when
        //then
        assertEquals(true, Main.isBalanced("([][]())"));
        assertEquals(true, Main.isBalanced("[[]]"));
        assertEquals(true, Main.isBalanced("[()]"));
        assertEquals(true, Main.isBalanced("([(([[(([]))]]))])"));
        assertEquals(true, Main.isBalanced("[](()()[[]])()[]([])"));
    }
}