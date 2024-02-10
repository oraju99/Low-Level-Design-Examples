package com.example.VendingMachine;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inventory {
    ItemShelf[] inventory = null;

    Inventory(int itemCount) {
        inventory = new ItemShelf[itemCount];
        initialEmptyInventory();
    }

    void initialEmptyInventory() {
        int currentCode = 101;
        for(int i=0;i<inventory.length;i++) {
            ItemShelf newItemShelf = new ItemShelf();
            newItemShelf.setItemCode(currentCode++);
            newItemShelf.setSoldOut(true);
            inventory[i] = newItemShelf;
        }
    }

    void addItem(Item item, int codeNumber) throws Exception {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getItemCode() == codeNumber) {
                if (itemShelf.isSoldOut()) {
                    itemShelf.setItem(item);
                    itemShelf.setSoldOut(false);
                } else {
                    throw new Exception("Item already present can't add new item");
                }
            }
        }
    }

    Item getItem(int codeNumber) throws Exception {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.getItemCode() == codeNumber) {
                if (!itemShelf.isSoldOut()) {
                    return itemShelf.item;
                } else {
                    throw new Exception("Item already sold out");
                }
            }
        }
        throw new Exception("Invalid product code");
    }

    public void updateSoldOutItem(int codeNumber){
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.itemCode == codeNumber) {
                itemShelf.setSoldOut(true);
            }
        }
    }
}
