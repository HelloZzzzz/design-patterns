package com.lzb.structure.bridge;

/**
 * @Author : LZB
 * @Description :
 */
public class Rectangle implements Shape {
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(color.getColor() + "的" + "矩形");
    }
}
