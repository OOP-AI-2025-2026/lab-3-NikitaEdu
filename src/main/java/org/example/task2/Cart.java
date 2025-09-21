package org.example.task2;

import java.util.Arrays;

public class Cart {

    private   Item[] contents;
    private int index;

    public Cart(Item[] contents) {
        this.contents = contents;
        this.index = 0;
    }

    public int getIndex() {
        return this.index;
    }

    public Item[] getContents(){
        return contents;
    }

    public Item getItem(int itemIndex) {
        if (itemIndex >= 0 && itemIndex < this.index) {
            return this.contents[itemIndex];
        }
        return null;
    }

    public void removeById(int itemIndex) {
        if (this.index == 0 || itemIndex < 0 || itemIndex >= this.index) {
            return;
        }

        int foundItemIndex = findItemInArray(this.contents[itemIndex]);

        if (foundItemIndex == -1) {
            return;
        }

        shiftArray(foundItemIndex);
    }

    private void shiftArray(int itemIndex) {
        for (int i = itemIndex; i < this.index - 1; i++) {
            this.contents[i] = this.contents[i + 1];
        }
        this.contents[this.index - 1] = null;
        this.index--;
    }

    private int findItemInArray(Item item) {
        for (int i = 0; i < this.index; i++) {
            if (this.contents[i].getId() == item.getId()) {
                return i;
            }
        }
        return -1;
    }

    public void add(Item item) {
        if (isCartFull()) {
            return;
        }
        this.contents[this.index] = item;
        this.index++;
    }

    public boolean isCartFull() {
        return this.index == this.contents.length;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(contents) +
                '}' + "\n";
    }
}