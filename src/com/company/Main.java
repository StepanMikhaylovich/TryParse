package com.company;

import com.company.belarusbank.parser;

public class Main {

    public static void main(String[] args) {
        parser.parseBelarusBank("Минск");
        parser.parseBelarusBank("Гомель");
        parser.parseBelarusBank("Гродно");
        parser.parseBelarusBank("Брест");
        parser.parseBelarusBank("Могилев");
    }
}
