package org.example;

import java.util.List;

public class Criptografia {
    public static String Descriptografar(String resultado, int hash, List<Character> codigoReverso, String texto) {
        for (char ch : texto.toCharArray()) {
            codigoReverso.add(ch);
        }
        for (char letra : codigoReverso) {
            char ascii = (char) ((char) letra - hash);
            resultado += ascii;
            resultado.toString();
        }
        return resultado;
    }

    public static String Criptografar(String resultado, int hash, List<Character> codigo, String texto) {
        for (char ch : texto.toCharArray()) {
            codigo.add(ch);
        }

        for (char letra : codigo) {
            char ascii = (char) ((char) letra + hash);
            resultado += ascii;
            resultado.toString();
        }
        return resultado;
    }
}
