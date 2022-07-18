package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class qVZ
extends ocu {
    protected Minecraft field_493682ed_Dne;
    public int field_21260d_FWm;
    public boolean field_21261e_FWm = false;
    public int field_2e5f1b_bzF;
    protected List<pee_0> field_f27c122c_Dne = new ArrayList();
    public static final boolean field_2092bf_Dne = Minecraft.method_230980ad_Dne() == ZPT.field_5e596115_Qnq;
    private long field_2092af_Dne = 0L;
    private int field_267cf5_Qnq = 0;
    public lJS field_3780a57_Dne;
    protected msA field_3791671_Dne;
    private int field_2092ae_Dne = 0;
    private pee_0 field_36bb77c_Dne = null;

    public static boolean method_ae128dcb_bzF() {
        return Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54);
    }

    protected void method_81183ff7_Dne(pee_0 pee_02) {
    }

    public void method_7ad38803_DyG() {
        while (Mouse.next()) {
            this.method_907a9d21_Qnq();
        }
        while (Keyboard.next()) {
            this.method_b0a28144_div();
        }
    }

    public void method_ae128dc7_bzF() {
    }

    public void method_117d19ea_FWm(int n) {
        if (this.field_493682ed_Dne.field_36ebf36_Dne != null) {
            this.method_c6b5263a_Dne(0, 0, this.field_21260d_FWm, this.field_2e5f1b_bzF, -1072689136, -804253680);
        } else {
            this.method_143f9e1c_bzF(n);
        }
    }

    public static void method_47a073d1_bzF(String string) {
        try {
            StringSelection stringSelection = new StringSelection(string);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void method_a98a0660_aFZ() {
        this.method_117d19ea_FWm(0);
    }

    public boolean method_7a46289e_Dne() {
        return true;
    }

    public void method_2c2cec86_Dne(int n, int n2, float f) {
        for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
            pee_0 pee_02 = (pee_0)this.field_f27c122c_Dne.get(i);
            pee_02.method_f68b2f6c_Dne(this.field_493682ed_Dne, n, n2);
        }
    }

    public void method_f68b2f6c_Dne(Minecraft minecraft, int n, int n2) {
        this.field_3780a57_Dne = new lJS(minecraft);
        this.field_493682ed_Dne = minecraft;
        this.field_3791671_Dne = minecraft.field_3791671_Dne;
        this.field_21260d_FWm = n;
        this.field_2e5f1b_bzF = n2;
        this.field_f27c122c_Dne.clear();
        this.method_7a46289a_Dne();
    }

    public void method_7c6f6039_FWm() {
    }

    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        if (n3 == 0) {
            for (int i = 0; i < this.field_f27c122c_Dne.size(); ++i) {
                pee_0 pee_02 = (pee_0)this.field_f27c122c_Dne.get(i);
                if (!pee_02.method_f68b2f70_Dne(this.field_493682ed_Dne, n, n2)) continue;
                this.field_36bb77c_Dne = pee_02;
                this.field_493682ed_Dne.field_3788296_Dne.method_fbd4aee4_Dne("random.click", 1.0f, 1.0f);
                this.method_81183ff7_Dne(pee_02);
            }
        }
    }

    protected void method_16a1040_Dne(char c, int n) {
        if (n == 1) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
            this.field_493682ed_Dne.method_a98a0660_aFZ();
        }
    }

    public void method_17484c9_Dne(boolean bl, int n) {
    }

    protected void method_5972781b_Dne(int n, int n2, int n3, long l) {
    }

    public static String method_d1f1ed87_FWm() {
        try {
            Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return (String)transferable.getTransferData(DataFlavor.stringFlavor);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return "";
    }

    public static boolean method_7c6f603d_FWm() {
        boolean bl = Keyboard.isKeyDown(28) && Keyboard.getEventCharacter() == '\u0000';
        return Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157) || field_2092bf_Dne && (bl || Keyboard.isKeyDown(219) || Keyboard.isKeyDown(220));
    }

    public void method_907a9d21_Qnq() {
        int n = Mouse.getEventX() * this.field_21260d_FWm / this.field_493682ed_Dne.field_2092ae_Dne;
        int n2 = this.field_2e5f1b_bzF - Mouse.getEventY() * this.field_2e5f1b_bzF / this.field_493682ed_Dne.field_21260d_FWm - 1;
        if (Mouse.getEventButtonState()) {
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_1ed028_ATE && this.field_267cf5_Qnq++ > 0) {
                return;
            }
            this.field_2092ae_Dne = Mouse.getEventButton();
            this.field_2092af_Dne = Minecraft.method_7a46288e_Dne();
            this.method_2c2cf7c9_Dne(n, n2, this.field_2092ae_Dne);
        } else if (Mouse.getEventButton() != -1) {
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_1ed028_ATE && --this.field_267cf5_Qnq > 0) {
                return;
            }
            this.field_2092ae_Dne = -1;
            this.method_a6aca7ca_FWm(n, n2, Mouse.getEventButton());
        } else if (this.field_2092ae_Dne != -1 && this.field_2092af_Dne > 0L) {
            long l = Minecraft.method_7a46288e_Dne() - this.field_2092af_Dne;
            this.method_5972781b_Dne(n, n2, this.field_2092ae_Dne, l);
        }
    }

    public void method_b0a28144_div() {
        if (Keyboard.getEventKeyState()) {
            int n = Keyboard.getEventKey();
            char c = Keyboard.getEventCharacter();
            if (n == 87) {
                this.field_493682ed_Dne.method_b0a28144_div();
                return;
            }
            if (field_2092bf_Dne && n == 28 && c == '\u0000') {
                n = 29;
            }
            this.method_16a1040_Dne(c, n);
        }
    }

    public void method_7a46289a_Dne() {
    }

    protected void method_a6aca7ca_FWm(int n, int n2, int n3) {
        if (this.field_36bb77c_Dne != null && n3 == 0) {
            this.field_36bb77c_Dne.method_16cca7a_Dne(n, n2);
            this.field_36bb77c_Dne = null;
        }
    }

    public void method_143f9e1c_bzF(int n) {
        GL11.glDisable(2896);
        GL11.glDisable(2912);
        WAR wAR = WAR.field_36e5ca4_Dne;
        this.field_493682ed_Dne.field_36d36bf_Dne.method_8f501fe4_Dne("/rock.png");
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        float f = 32.0f;
        wAR.method_7a46289a_Dne();
        wAR.method_143f9e1c_bzF(0x404040);
        wAR.method_c38c5864_Dne(0.0, this.field_2e5f1b_bzF, 0.0, 0.0, (float)this.field_2e5f1b_bzF / f + (float)n);
        wAR.method_c38c5864_Dne(this.field_21260d_FWm, this.field_2e5f1b_bzF, 0.0, (float)this.field_21260d_FWm / f, (float)this.field_2e5f1b_bzF / f + (float)n);
        wAR.method_c38c5864_Dne(this.field_21260d_FWm, 0.0, 0.0, (float)this.field_21260d_FWm / f, n);
        wAR.method_c38c5864_Dne(0.0, 0.0, 0.0, 0.0, n);
        wAR.method_7a46288d_Dne();
    }
}

