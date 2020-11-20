package com.lzb.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : LZB
 * @Description :
 */
public class Restaurant {
    // 准备当天的食物
    private List<Food> prepareFoods() {
        List<Food> foods = new ArrayList<>();
        foods.add(new Lobster());
        foods.add(new Watermelon());
        foods.add(new Steak());
        foods.add(new Banana());
        return foods;
    }

    // 欢迎顾客来访
    public void welcome(Visitor visitor) {
        // 获取当天的食物
        List<Food> foods = prepareFoods();
        // 将食物依次提供给顾客选择
        for (Food food : foods) {
            // 由于单分派机制，此处无法编译通过
            // visitor.chooseFood(food);
            // 由于重写方法是动态分派的，所以这里会调用具体子类的 accept 方法，
            food.accept(visitor);
        }
    }
}
