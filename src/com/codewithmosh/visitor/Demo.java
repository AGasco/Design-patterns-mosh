package com.codewithmosh.visitor;

public class Demo {
    public static void show(){
        var document = new HtmlDocument();
        document.addHtmlNode(new HeadingNode());
        document.addHtmlNode(new AnchorNode());
        document.execute(new HighlightOperation());
        document.execute(new PlainTextOperation());
    }
}
