package com.github.zia;

interface Document {
    void open();
}


class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document.");
    }
}

class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document.");
    }
}


abstract class DocumentCreator {
    public abstract Document createDocument();

    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }
}


class PdfCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

class WordCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

class Docs {
    public static void main(String[] args) {
        DocumentCreator pdfCreator = new PdfCreator();
        pdfCreator.openDocument();

        DocumentCreator wordCreator = new WordCreator();
        wordCreator.openDocument();
    }
}
