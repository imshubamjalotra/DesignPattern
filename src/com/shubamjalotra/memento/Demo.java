package com.shubamjalotra.memento;

public class Demo {
  public static void main (String[] args) {
    var document = new Document();
    var history = new History();

    document.setContent("Hello");
    document.createMemento();
    history.push(document.createMemento());

    document.setFontName("Font 1");
    history.push(document.createMemento());

    document.setFontSize(10);

    System.out.println(document);

    document.restore(history.pop());
    System.out.println(document);

    document.restore(history.pop());
    System.out.println(document);
  }
}
