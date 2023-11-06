package org.example;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CriptografiaTest {

    @Test
    void criptografia() {
        Criptografia cripta = new Criptografia();
        List<Character> codigo = new ArrayList<>();
        assertEquals("dwdfdu#i#gluhlwr", cripta.Criptografar("", 3, codigo, "atacar f direito"));
    }

    @Test
    void descriptografia() {
        Criptografia cripta = new Criptografia();
        List<Character> codigo = new ArrayList<>();
        assertEquals("atacar f direito", cripta.Descriptografar("", 3, codigo, "dwdfdu#i#gluhlwr"));
    }

}