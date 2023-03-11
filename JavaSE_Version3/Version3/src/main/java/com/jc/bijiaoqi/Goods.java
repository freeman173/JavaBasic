package com.jc.bijiaoqi;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Goods implements Comparable{
    private String name;
    private double price;


    /*
        实现比较接口并定制化比较对象大小
    */
    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods goods=(Goods) o;//向下转型
            if (this.getPrice()>goods.getPrice()){
                return 1;
            }else if (this.getPrice()<goods.getPrice())return -1;
            else return 0;
        }
        throw new RuntimeException("传入数据类型不一致");//运行时异常可以不处理。
    }
}