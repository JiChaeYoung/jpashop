package jpabook.jpashop.domain.item;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jpabook.jpashop.controller.UpdateDto;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@DiscriminatorValue("B")
public class Book extends Item{

    private String author;
    private String isbn;

    public void changeItem(UpdateDto updateDto){
        super.changeItem(updateDto);
    }

}
