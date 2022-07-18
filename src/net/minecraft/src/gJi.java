package net.minecraft.src;
import java.io.IOException;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.Reader;
import java.util.Arrays;

public final class gJi {
    private int method_9e652f55_Dne(bKn bKn2) throws IOException, pPp {
        char[] cArray = new char[4];
        int n = bKn2.method_174e295_Dne(cArray);
        if (n != 4) {
            throw new pPp("Expected a 4 digit hexidecimal number but got only [" + n + "], namely [" + String.valueOf(cArray, 0, n) + "].", bKn2);
        }
        try {
            int n2 = Integer.parseInt(String.valueOf(cArray), 16);
            return n2;
        }
        catch (NumberFormatException numberFormatException) {
            bKn2.method_174e2a2_Dne(cArray);
            throw new pPp("Unable to parse [" + String.valueOf(cArray) + "] as a hexidecimal number.", numberFormatException, bKn2);
        }
    }

    private void method_6399af29_FWm(bKn bKn2, Lkt lkt) throws pPp, IOException {
        char c = (char)this.method_77b8e316_FWm(bKn2);
        if (c != '{') {
            throw new pPp("Expected object to start with { but got [" + c + "].", bKn2);
        }
        lkt.method_a98a0660_aFZ();
        char c2 = (char)this.method_77b8e316_FWm(bKn2);
        bKn2.method_ce7f4723_Dne(c2);
        if (c2 != '}') {
            this.method_efc3c337_bzF(bKn2, lkt);
        }
        boolean bl = false;
        block4: while (!bl) {
            char c3 = (char)this.method_77b8e316_FWm(bKn2);
            switch (c3) {
                case ',': {
                    this.method_efc3c337_bzF(bKn2, lkt);
                    continue block4;
                }
                case '}': {
                    bl = true;
                    continue block4;
                }
            }
            throw new pPp("Expected either , or } but got [" + c3 + "].", bKn2);
        }
        lkt.method_d44b4592_zGp();
    }

    private char method_9059fe42_bzF(bKn bKn2) throws IOException, pPp {
        char c;
        char c2 = (char)bKn2.method_7a46288d_Dne();
        switch (c2) {
            case '\"': {
                c = '\"';
                break;
            }
            case '/': {
                c = '/';
                break;
            }
            case '\\': {
                c = '\\';
                break;
            }
            case 'b': {
                c = '\b';
                break;
            }
            case 'f': {
                c = '\f';
                break;
            }
            case 'n': {
                c = '\n';
                break;
            }
            case 'r': {
                c = '\r';
                break;
            }
            case 't': {
                c = '\t';
                break;
            }
            case 'u': {
                c = (char)this.method_9e652f55_Dne(bKn2);
                break;
            }
            default: {
                throw new pPp("Unrecognised escape character [" + c2 + "].", bKn2);
            }
        }
        return c;
    }

    private String method_e8d53027_DyG(bKn bKn2) throws IOException, pPp {
        StringBuilder stringBuilder = new StringBuilder();
        char c = (char)bKn2.method_7a46288d_Dne();
        if ('\"' != c) {
            throw new pPp("Expected [\"] but got [" + c + "].", bKn2);
        }
        boolean bl = false;
        block4: while (!bl) {
            char c2 = (char)bKn2.method_7a46288d_Dne();
            switch (c2) {
                case '\"': {
                    bl = true;
                    continue block4;
                }
                case '\\': {
                    char c3 = this.method_9059fe42_bzF(bKn2);
                    stringBuilder.append(c3);
                    continue block4;
                }
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    private String method_cee5c876_zGp(bKn bKn2) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        char c = (char)bKn2.method_7a46288d_Dne();
        if (c != '+' && c != '-') {
            bKn2.method_ce7f4723_Dne(c);
        } else {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    private char method_77b8e310_FWm(bKn bKn2) throws IOException, pPp {
        char c = (char)bKn2.method_7a46288d_Dne();
        switch (c) {
            case '0': 
            case '1': 
            case '2': 
            case '3': 
            case '4': 
            case '5': 
            case '6': 
            case '7': 
            case '8': 
            case '9': {
                return c;
            }
        }
        throw new pPp("Expected a digit 1 - 9 but got [" + c + "].", bKn2);
    }

    public void method_53462c02_Dne(Reader reader, Lkt lkt) throws IOException, pPp {
        bKn bKn2 = new bKn(reader);
        char c = (char)bKn2.method_7a46288d_Dne();
        switch (c) {
            case '[': {
                bKn2.method_ce7f4723_Dne(c);
                lkt.method_7a46289a_Dne();
                this.method_a43e324a_Dne(bKn2, lkt);
                break;
            }
            case '{': {
                bKn2.method_ce7f4723_Dne(c);
                lkt.method_7a46289a_Dne();
                this.method_6399af29_FWm(bKn2, lkt);
                break;
            }
            default: {
                throw new pPp("Expected either [ or { but got [" + c + "].", bKn2);
            }
        }
        int n = this.method_77b8e316_FWm(bKn2);
        if (n != -1) {
            throw new pPp("Got unexpected trailing character [" + (char)n + "].", bKn2);
        }
        lkt.method_7c6f6039_FWm();
    }

    private char method_9e652f4f_Dne(bKn bKn2) throws IOException, pPp {
        char c = (char)bKn2.method_7a46288d_Dne();
        switch (c) {
            case '1': 
            case '2': 
            case '3': 
            case '4': 
            case '5': 
            case '6': 
            case '7': 
            case '8': 
            case '9': {
                return c;
            }
        }
        throw new pPp("Expected a digit 1 - 9 but got [" + c + "].", bKn2);
    }

    private int method_77b8e316_FWm(bKn bKn2) throws IOException {
        int n;
        boolean bl = false;
        do {
            n = bKn2.method_7a46288d_Dne();
            switch (n) {
                case 9: 
                case 10: 
                case 13: 
                case 32: {
                    break;
                }
                default: {
                    bl = true;
                }
            }
        } while (!bl);
        return n;
    }

    private void method_af0bea11_Qnq(bKn bKn2, Lkt lkt) throws IOException, pPp {
        char c = (char)this.method_77b8e316_FWm(bKn2);
        switch (c) {
            case '\"': {
                bKn2.method_ce7f4723_Dne(c);
                lkt.method_47a073d1_bzF(this.method_e8d53027_DyG(bKn2));
                break;
            }
            case '-': 
            case '0': 
            case '1': 
            case '2': 
            case '3': 
            case '4': 
            case '5': 
            case '6': 
            case '7': 
            case '8': 
            case '9': {
                bKn2.method_ce7f4723_Dne(c);
                lkt.method_110c4dc3_FWm(this.method_a9d1357e_Dne(bKn2));
                break;
            }
            case '[': {
                bKn2.method_ce7f4723_Dne(c);
                this.method_a43e324a_Dne(bKn2, lkt);
                break;
            }
            case 'f': {
                char[] cArray = new char[4];
                int n = bKn2.method_174e295_Dne(cArray);
                if (n != 4 || cArray[0] != 'a' || cArray[1] != 'l' || cArray[2] != 's' || cArray[3] != 'e') {
                    bKn2.method_174e2a2_Dne(cArray);
                    throw new pPp("Expected 'f' to be followed by [[a, l, s, e]], but got [" + Arrays.toString(cArray) + "].", bKn2);
                }
                lkt.method_8288d6ee_IjH();
                break;
            }
            case 'n': {
                char[] cArray = new char[3];
                int n = bKn2.method_174e295_Dne(cArray);
                if (n != 3 || cArray[0] != 'u' || cArray[1] != 'l' || cArray[2] != 'l') {
                    bKn2.method_174e2a2_Dne(cArray);
                    throw new pPp("Expected 'n' to be followed by [[u, l, l]], but got [" + Arrays.toString(cArray) + "].", bKn2);
                }
                lkt.method_c073daf8_mrb();
                break;
            }
            case 't': {
                char[] cArray = new char[3];
                int n = bKn2.method_174e295_Dne(cArray);
                if (n != 3 || cArray[0] != 'r' || cArray[1] != 'u' || cArray[2] != 'e') {
                    bKn2.method_174e2a2_Dne(cArray);
                    throw new pPp("Expected 't' to be followed by [[r, u, e]], but got [" + Arrays.toString(cArray) + "].", bKn2);
                }
                lkt.method_b0a28144_div();
                break;
            }
            case '{': {
                bKn2.method_ce7f4723_Dne(c);
                this.method_6399af29_FWm(bKn2, lkt);
                break;
            }
            default: {
                throw new pPp("Invalid character at start of value [" + c + "].", bKn2);
            }
        }
    }

    private String method_fa9e7ac5_Qnq(bKn bKn2) throws IOException, pPp {
        StringBuilder stringBuilder = new StringBuilder();
        char c = (char)bKn2.method_7a46288d_Dne();
        if (c == '.') {
            stringBuilder.append('.');
            stringBuilder.append(this.method_77b8e310_FWm(bKn2));
            stringBuilder.append(this.method_58cbcaeb_bzF(bKn2));
        } else {
            bKn2.method_ce7f4723_Dne(c);
        }
        return stringBuilder.toString();
    }

    private String method_73f55bdd_FWm(bKn bKn2) throws IOException, pPp {
        StringBuilder stringBuilder = new StringBuilder();
        char c = (char)bKn2.method_7a46288d_Dne();
        if ('0' == c) {
            stringBuilder.append('0');
            stringBuilder.append(this.method_fa9e7ac5_Qnq(bKn2));
            stringBuilder.append(this.method_e87ddac4_aFZ(bKn2));
        } else {
            bKn2.method_ce7f4723_Dne(c);
            stringBuilder.append(this.method_9e652f4f_Dne(bKn2));
            stringBuilder.append(this.method_58cbcaeb_bzF(bKn2));
            stringBuilder.append(this.method_fa9e7ac5_Qnq(bKn2));
            stringBuilder.append(this.method_e87ddac4_aFZ(bKn2));
        }
        return stringBuilder.toString();
    }

    private String method_a9d1357e_Dne(bKn bKn2) throws IOException, pPp {
        StringBuilder stringBuilder = new StringBuilder();
        char c = (char)bKn2.method_7a46288d_Dne();
        if ('-' == c) {
            stringBuilder.append('-');
        } else {
            bKn2.method_ce7f4723_Dne(c);
        }
        stringBuilder.append(this.method_73f55bdd_FWm(bKn2));
        return stringBuilder.toString();
    }

    private String method_e87ddac4_aFZ(bKn bKn2) throws IOException, pPp {
        StringBuilder stringBuilder = new StringBuilder();
        char c = (char)bKn2.method_7a46288d_Dne();
        if (c != '.' && c != 'E') {
            bKn2.method_ce7f4723_Dne(c);
        } else {
            stringBuilder.append('E');
            stringBuilder.append(this.method_cee5c876_zGp(bKn2));
            stringBuilder.append(this.method_77b8e310_FWm(bKn2));
            stringBuilder.append(this.method_58cbcaeb_bzF(bKn2));
        }
        return stringBuilder.toString();
    }

    private void method_a43e324a_Dne(bKn bKn2, Lkt lkt) throws IOException, pPp {
        char c = (char)this.method_77b8e316_FWm(bKn2);
        if (c != '[') {
            throw new pPp("Expected object to start with [ but got [" + c + "].", bKn2);
        }
        lkt.method_ae128dc7_bzF();
        char c2 = (char)this.method_77b8e316_FWm(bKn2);
        bKn2.method_ce7f4723_Dne(c2);
        if (c2 != ']') {
            this.method_af0bea11_Qnq(bKn2, lkt);
        }
        boolean bl = false;
        block4: while (!bl) {
            char c3 = (char)this.method_77b8e316_FWm(bKn2);
            switch (c3) {
                case ',': {
                    this.method_af0bea11_Qnq(bKn2, lkt);
                    continue block4;
                }
                case ']': {
                    bl = true;
                    continue block4;
                }
            }
            throw new pPp("Expected either , or ] but got [" + c3 + "].", bKn2);
        }
        lkt.method_907a9d21_Qnq();
    }

    private void method_efc3c337_bzF(bKn bKn2, Lkt lkt) throws IOException, pPp {
        char c = (char)this.method_77b8e316_FWm(bKn2);
        if ('\"' != c) {
            throw new pPp("Expected object identifier to begin with [\"] but got [" + c + "].", bKn2);
        }
        bKn2.method_ce7f4723_Dne(c);
        lkt.method_8f501fe4_Dne(this.method_e8d53027_DyG(bKn2));
        char c2 = (char)this.method_77b8e316_FWm(bKn2);
        if (c2 != ':') {
            throw new pPp("Expected object identifier to be followed by : but got [" + c2 + "].", bKn2);
        }
        this.method_af0bea11_Qnq(bKn2, lkt);
        lkt.method_7ad38803_DyG();
    }

    private String method_58cbcaeb_bzF(bKn bKn2) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = false;
        block3: while (!bl) {
            char c = (char)bKn2.method_7a46288d_Dne();
            switch (c) {
                case '0': 
                case '1': 
                case '2': 
                case '3': 
                case '4': 
                case '5': 
                case '6': 
                case '7': 
                case '8': 
                case '9': {
                    stringBuilder.append(c);
                    continue block3;
                }
            }
            bl = true;
            bKn2.method_ce7f4723_Dne(c);
        }
        return stringBuilder.toString();
    }
}

