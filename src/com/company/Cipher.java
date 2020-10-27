package com.company;

public interface Cipher {
    /** deszyfrowanie wiadomosci*/
    String decode(final String message);

    /** szyfrowanie wiadomosci */
    String encode(final String message);
}
