package jpabook.jpashop.controller;

import com.sun.source.tree.LambdaExpressionTree;
import jpabook.jpashop.domain.item.Book;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateDto {
    private String name;
    private int price;
    private int stockQuantity;

}
