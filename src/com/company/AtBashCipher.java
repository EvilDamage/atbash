package com.company;

class AtBashCipher implements Cipher {


    @Override
    public String decode(String message) {
        StringBuilder decode = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                int newChar;
                if((int) c >= 65 && (int) c <= 90){
                    newChar = (90 - c) + 'A';
                }
                else{
                    newChar = (122 - c) + 'a';
                }
                decode.append((char) newChar);
            } else {
                decode.append(c);
            }
        }
        return decode.toString();
    }


    @Override
    public String encode(String message) {
        StringBuilder encode = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                int newChar;
                if((int) c >= 65 && (int) c <= 90){
                    newChar = (90 - c) + 'A';
                }
                else{
                    newChar = (122 - c) + 'a';
                }
                encode.append((char) newChar);
            } else {
                encode.append(c);
            }
        }
        return encode.toString();
    }
}
