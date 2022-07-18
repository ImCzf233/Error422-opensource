package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ybG {
    private ByteArrayOutputStream field_6948b236_Dne;
    private DataOutputStream field_6605c63_Dne;

    public void method_8f501fe4_Dne(String string) throws IOException {
        this.field_6605c63_Dne.writeBytes(string);
        this.field_6605c63_Dne.write(0);
    }

    public ybG(int n) {
        this.field_6948b236_Dne = new ByteArrayOutputStream(n);
        this.field_6605c63_Dne = new DataOutputStream(this.field_6948b236_Dne);
    }

    public void method_7a46289a_Dne() {
        this.field_6948b236_Dne.reset();
    }

    public void method_ce7f8333_Dne(short s) throws IOException {
        this.field_6605c63_Dne.writeShort(Short.reverseBytes(s));
    }

    public byte[] method_ce7eeb83_Dne() {
        return this.field_6948b236_Dne.toByteArray();
    }

    public void method_174dee1_Dne(byte[] byArray) throws IOException {
        this.field_6605c63_Dne.write(byArray, 0, byArray.length);
    }

    public void method_ce7f5da9_Dne(int n) throws IOException {
        this.field_6605c63_Dne.write(n);
    }
}

