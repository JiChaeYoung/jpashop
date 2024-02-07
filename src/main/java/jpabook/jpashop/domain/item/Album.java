package jpabook.jpashop.domain.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jpabook.jpashop.controller.UpdateDto;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@DiscriminatorValue("A")
public class Album extends Item{
    private String artist;
    private String etc;

    public void changeItem(UpdateDto updateDto){
        super.changeItem(updateDto);
    }
}
