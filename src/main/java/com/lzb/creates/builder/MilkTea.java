package com.lzb.creates.builder;

/**
 * @Author : LZB
 * @Description : 建构者模式：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 */
public class MilkTea {
    private final String type;
    private final String size;
    private final boolean pearl;
    private final boolean ice;

    private MilkTea(MilkTeaBuilder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.pearl = builder.pearl;
        this.ice = builder.ice;
    }

    @Override
    public String toString() {
        return "MilkTea{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", pearl=" + pearl +
                ", ice=" + ice +
                '}';
    }

    public static class MilkTeaBuilder {
        private String type;
        private String size;
        private boolean pearl;
        private boolean ice;

        public MilkTeaBuilder(String type) {
            this.type = type;
        }


        public MilkTeaBuilder size(String size) {
            this.size = size;
            return this;
        }

        public MilkTeaBuilder pearl(boolean pearl) {
            this.pearl = pearl;
            return this;
        }

        public MilkTeaBuilder ice(boolean ice) {
            this.ice = ice;
            return this;
        }

        public MilkTea build() {
            return new MilkTea(this);
        }

        public String getType() {
            return type;
        }

        public String getSize() {
            return size;
        }

        public boolean isPearl() {
            return pearl;
        }

        public boolean isIce() {
            return ice;
        }
    }


}
