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
        ʵ�ֱȽϽӿڲ����ƻ��Ƚ϶����С
    */
    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods goods=(Goods) o;//����ת��
            if (this.getPrice()>goods.getPrice()){
                return 1;
            }else if (this.getPrice()<goods.getPrice())return -1;
            else return 0;
        }
        throw new RuntimeException("�����������Ͳ�һ��");//����ʱ�쳣���Բ�����
    }
}