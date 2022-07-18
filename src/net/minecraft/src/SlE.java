package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class SlE
extends qVZ {
    private String field_d9a85c6_FWm = "";
    private URI field_3bdb13dd_Dne = null;
    protected mHN field_3787699_Dne;
    private int field_267cf5_Qnq = 0;
    private int field_2092ae_Dne = -1;
    private List field_6a0474ed_FWm = new ArrayList();
    private boolean field_267d06_Qnq = false;
    private String field_569fcf45_Dne = "";
    private boolean field_2e5f2c_bzF = false;

    public SlE(String string) {
        this.field_d9a85c6_FWm = string;
    }

    @Override
    public boolean method_7a46289e_Dne() {
        return false;
    }

    @Override
    public void method_ae128dc7_bzF() {
        this.field_3787699_Dne.method_7a46289a_Dne();
    }

    private void method_d4bbb77c_Dne(URI uRI) {
        try {
            Class<?> clazz = Class.forName("java.awt.Desktop");
            Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
            clazz.getMethod("browse", URI.class).invoke(object, uRI);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    protected void method_16a1040_Dne(char c, int n) {
        this.field_267d06_Qnq = false;
        if (n == 15) {
            this.method_590ca18_b_();
        } else {
            this.field_2e5f2c_bzF = false;
        }
        if (n == 1) {
            this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
        } else if (n == 28) {
            String string = this.field_3787699_Dne.method_eecad346_Dne().trim();
            if (string.length() > 0) {
                this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_110c4dc3_FWm(string);
                if (!this.field_493682ed_Dne.method_8f501fe8_Dne(string)) {
                    this.field_493682ed_Dne.field_369f6b6_Dne.method_110c4dc3_FWm(string);
                }
            }
            this.field_493682ed_Dne.method_b88fcbd2_Dne(null);
        } else if (n == 200) {
            this.method_ce7f5da9_Dne(-1);
        } else if (n == 208) {
            this.method_ce7f5da9_Dne(1);
        } else if (n == 201) {
            this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_117d19ea_FWm(this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_ae128dba_bzF() - 1);
        } else if (n == 209) {
            this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_117d19ea_FWm(-this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_ae128dba_bzF() + 1);
        } else {
            this.field_3787699_Dne.method_16a1044_Dne(c, n);
        }
    }

    private void method_abaa98ae_Dne(String string, String string2) {
        if (string.length() >= 1) {
            this.field_493682ed_Dne.field_369f6b6_Dne.field_37608e7_Dne.method_5536af4d_FWm(new efs(string));
            this.field_267d06_Qnq = true;
        }
    }

    @Override
    public void method_907a9d21_Qnq() {
        super.method_907a9d21_Qnq();
        int n = Mouse.getEventDWheel();
        if (n != 0) {
            if (n > 1) {
                n = 1;
            }
            if (n < -1) {
                n = -1;
            }
            if (!SlE.method_ae128dcb_bzF()) {
                n *= 7;
            }
            this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_117d19ea_FWm(n);
        }
    }

    @Override
    public void method_7c6f6039_FWm() {
        Keyboard.enableRepeatEvents(false);
        this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_ae128dc7_bzF();
    }

    public void method_590ca18_b_() {
        if (this.field_2e5f2c_bzF) {
            this.field_3787699_Dne.method_117d19ea_FWm(this.field_3787699_Dne.method_2c2d378d_Dne(-1, this.field_3787699_Dne.method_7c6f602c_FWm(), false) - this.field_3787699_Dne.method_7c6f602c_FWm());
            if (this.field_267cf5_Qnq >= this.field_6a0474ed_FWm.size()) {
                this.field_267cf5_Qnq = 0;
            }
        } else {
            int n = this.field_3787699_Dne.method_2c2d378d_Dne(-1, this.field_3787699_Dne.method_7c6f602c_FWm(), false);
            this.field_6a0474ed_FWm.clear();
            this.field_267cf5_Qnq = 0;
            String string = this.field_3787699_Dne.method_eecad346_Dne().substring(n).toLowerCase();
            String string2 = this.field_3787699_Dne.method_eecad346_Dne().substring(0, this.field_3787699_Dne.method_7c6f602c_FWm());
            this.method_abaa98ae_Dne(string2, string);
            if (this.field_6a0474ed_FWm.isEmpty()) {
                return;
            }
            this.field_2e5f2c_bzF = true;
            this.field_3787699_Dne.method_117d19ea_FWm(n - this.field_3787699_Dne.method_7c6f602c_FWm());
        }
        if (this.field_6a0474ed_FWm.size() > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Object obj : this.field_6a0474ed_FWm) {String string2 = (String) obj;
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(string2);
            }
            this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_5ab44f9f_Dne(stringBuilder.toString(), 1);
        }
        this.field_3787699_Dne.method_110c4dc3_FWm((String)this.field_6a0474ed_FWm.get(this.field_267cf5_Qnq++));
    }

    @Override
    protected void method_2c2cf7c9_Dne(int n, int n2, int n3) {
        URI uRI;
        Yuy yuy;
        if (n3 == 0 && this.field_493682ed_Dne.field_3758af7_Dne.field_2f0de9_div && (yuy = this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_904c4d8e_Dne(Mouse.getX(), Mouse.getY())) != null && (uRI = yuy.method_fc62405e_Dne()) != null) {
            if (this.field_493682ed_Dne.field_3758af7_Dne.field_22c613_IjH) {
                this.field_3bdb13dd_Dne = uRI;
                this.field_493682ed_Dne.method_b88fcbd2_Dne(new vBZ((qVZ)this, yuy.method_eecad346_Dne(), 0, false));
            } else {
                this.method_d4bbb77c_Dne(uRI);
            }
            return;
        }
        this.field_3787699_Dne.method_2c2cf7c9_Dne(n, n2, n3);
        super.method_2c2cf7c9_Dne(n, n2, n3);
    }

    @Override
    public void method_7a46289a_Dne() {
        Keyboard.enableRepeatEvents(true);
        this.field_2092ae_Dne = this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_adea226d_Dne().size();
        this.field_3787699_Dne = new mHN(this.field_3791671_Dne, 4, this.field_2e5f1b_bzF - 12, this.field_21260d_FWm - 4, 12);
        this.field_3787699_Dne.method_87b738a3_aFZ(100);
        this.field_3787699_Dne.method_ce7f9d7a_Dne(false);
        this.field_3787699_Dne.method_117d59bb_FWm(true);
        this.field_3787699_Dne.method_8f501fe4_Dne(this.field_d9a85c6_FWm);
        this.field_3787699_Dne.method_7ed9b9d3_Qnq(false);
    }

    @Override
    public void method_2c2cec86_Dne(int n, int n2, float f) {
        SlE.method_d4dc89e9_Dne(2, this.field_2e5f1b_bzF - 14, this.field_21260d_FWm - 2, this.field_2e5f1b_bzF - 2, Integer.MIN_VALUE);
        this.field_3787699_Dne.method_907a9d21_Qnq();
        super.method_2c2cec86_Dne(n, n2, f);
    }

    @Override
    public void method_17484c9_Dne(boolean bl, int n) {
        if (n == 0) {
            if (bl) {
                this.method_d4bbb77c_Dne(this.field_3bdb13dd_Dne);
            }
            this.field_3bdb13dd_Dne = null;
            this.field_493682ed_Dne.method_b88fcbd2_Dne(this);
        }
    }

    public void method_ce7f5da9_Dne(int n) {
        int n2 = this.field_2092ae_Dne + n;
        int n3 = this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_adea226d_Dne().size();
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 > n3) {
            n2 = n3;
        }
        if (n2 != this.field_2092ae_Dne) {
            if (n2 == n3) {
                this.field_2092ae_Dne = n3;
                this.field_3787699_Dne.method_8f501fe4_Dne(this.field_569fcf45_Dne);
            } else {
                if (this.field_2092ae_Dne == n3) {
                    this.field_569fcf45_Dne = this.field_3787699_Dne.method_eecad346_Dne();
                }
                this.field_3787699_Dne.method_8f501fe4_Dne((String)this.field_493682ed_Dne.field_3733694_Dne.method_2312ad69_Dne().method_adea226d_Dne().get(n2));
                this.field_2092ae_Dne = n2;
            }
        }
    }

    public SlE() {
    }

    public void method_dd431245_Dne(String[] stringArray) {
        if (this.field_267d06_Qnq) {
            this.field_6a0474ed_FWm.clear();
            String[] stringArray2 = stringArray;
            int n = stringArray.length;
            for (int i = 0; i < n; ++i) {
                String string = stringArray2[i];
                if (string.length() <= 0) continue;
                this.field_6a0474ed_FWm.add(string);
            }
            if (this.field_6a0474ed_FWm.size() > 0) {
                this.field_2e5f2c_bzF = true;
                this.method_590ca18_b_();
            }
        }
    }
}

