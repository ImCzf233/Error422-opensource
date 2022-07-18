package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class qQe {
    private static final DateFormat field_364c53d0_Dne = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
    private static int[] field_3f1c589_Dne;
    private static IntBuffer field_76f31d43_Dne;

    public static String method_12c8d845_Dne(File file, String string, int n, int n2) {
        try {
            File file2 = new File(file, "screenshots");
            file2.mkdir();
            int n3 = n * n2;
            if (field_76f31d43_Dne == null || field_76f31d43_Dne.capacity() < n3) {
                field_76f31d43_Dne = BufferUtils.createIntBuffer(n3);
                field_3f1c589_Dne = new int[n3];
            }
            GL11.glPixelStorei(3333, 1);
            GL11.glPixelStorei(3317, 1);
            field_76f31d43_Dne.clear();
            GL11.glReadPixels(0, 0, n, n2, 32993, 33639, field_76f31d43_Dne);
            field_76f31d43_Dne.get(field_3f1c589_Dne);
            qQe.method_7829af88_Dne(field_3f1c589_Dne, n, n2);
            BufferedImage bufferedImage = new BufferedImage(n, n2, 1);
            bufferedImage.setRGB(0, 0, n, n2, field_3f1c589_Dne, 0, n);
            File file3 = string == null ? qQe.method_1c1d5c1c_Dne(file2) : new File(file2, string);
            ImageIO.write((RenderedImage)bufferedImage, "png", file3);
            return "Saved screenshot as " + file3.getName();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "Failed to save: " + exception;
        }
    }

    public static String method_9316300f_Dne(File file, int n, int n2) {
        return qQe.method_12c8d845_Dne(file, null, n, n2);
    }

    private static void method_7829af88_Dne(int[] nArray, int n, int n2) {
        int[] nArray2 = new int[n];
        int n3 = n2 / 2;
        for (int i = 0; i < n3; ++i) {
            System.arraycopy(nArray, i * n, nArray2, 0, n);
            System.arraycopy(nArray, (n2 - 1 - i) * n, nArray, i * n, n);
            System.arraycopy(nArray2, 0, nArray, (n2 - 1 - i) * n, n);
        }
    }

    private static File method_1c1d5c1c_Dne(File file) {
        String string = field_364c53d0_Dne.format(new Date()).toString();
        int n = 1;
        File file2;
        while ((file2 = new File(file, string + (n == 1 ? "" : "_" + n) + ".png")).exists()) {
            ++n;
        }
        return file2;
    }
}

