package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import org.lwjgl.input.Mouse;

public class Jvu {
    public int field_21260d_FWm;
    public int field_2092ae_Dne;
    private final fZI field_3758af7_Dne;
    private final Component field_ab47ffeb_Dne;

    public Jvu(Component component, fZI fZI2) {
        this.field_ab47ffeb_Dne = component;
        this.field_3758af7_Dne = fZI2;
    }

    public void method_ae128dc7_bzF() {
        this.field_2092ae_Dne = Mouse.getDX();
        this.field_21260d_FWm = Mouse.getDY();
    }

    public void method_7a46289a_Dne() {
        Mouse.setGrabbed(true);
        this.field_2092ae_Dne = 0;
        this.field_21260d_FWm = 0;
    }

    public void method_7c6f6039_FWm() {
        int n = this.field_ab47ffeb_Dne.getWidth();
        int n2 = this.field_ab47ffeb_Dne.getHeight();
        if (this.field_ab47ffeb_Dne.getParent() != null) {
            n = this.field_ab47ffeb_Dne.getParent().getWidth();
            n2 = this.field_ab47ffeb_Dne.getParent().getHeight();
        }
        Mouse.setCursorPosition(n / 2, n2 / 2);
        Mouse.setGrabbed(false);
    }
}

