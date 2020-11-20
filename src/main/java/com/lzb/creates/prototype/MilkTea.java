package com.lzb.creates.prototype;

/**
 * @Author : LZB
 * @Description :原型模式：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 */
public class MilkTea implements Cloneable {

    private String type;
    private String size;
    private boolean ice;


    protected MilkTea clone() throws CloneNotSupportedException {
        return (MilkTea) super.clone();
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isIce() {
        return ice;
    }

    public void setIce(boolean ice) {
        this.ice = ice;
    }

    public MilkTea(String type, String size, boolean ice) {
        this.type = type;
        this.size = size;
        this.ice = ice;
    }

    public MilkTea() {
    }

    @Override
    public String toString() {
        return "MilkTea{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", ice=" + ice +
                '}';
    }
}
