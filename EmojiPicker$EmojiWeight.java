package com.whatsapp;

import X.2Eb;
import java.io.Serializable;
import java.util.Arrays;

public class EmojiPicker$EmojiWeight implements 2Eb, Serializable {
    public static final long serialVersionUID = 1;
    public int code;
    public int[] emoji;
    public int modifier;
    public float weight;

    public EmojiPicker$EmojiWeight(int[] iArr, float f) {
        this.emoji = iArr;
        this.weight = f;
    }

    public boolean A6V(Object obj) {
        return Arrays.equals(this.emoji, (int[]) obj);
    }

    public Object AAe() {
        return this.emoji;
    }

    public float AEG() {
        return this.weight;
    }

    public void AUp(float f) {
        this.weight = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EmojiPicker$EmojiWeight.class != obj.getClass()) {
            return false;
        }
        EmojiPicker$EmojiWeight emojiPicker$EmojiWeight = (EmojiPicker$EmojiWeight) obj;
        return Float.compare(emojiPicker$EmojiWeight.weight, this.weight) == 0 && Arrays.equals(this.emoji, emojiPicker$EmojiWeight.emoji);
    }

    public int hashCode() {
        return (Float.valueOf(this.weight).hashCode() * 31 * 31) + Arrays.hashCode(this.emoji);
    }
}
