package com.codewithmosh.structural.decorator;

public class CompressedCloudStream implements Stream{
    private Stream stream;

    public CompressedCloudStream(Stream stream){
        this.stream = stream;
    }

    public void write(String data) {
        var compressed = compress(data);
        stream.write(compressed);
    }

    private String compress(String data){
        System.out.println("compressing " + data);
        return data.substring(0, 5);
    }
}
