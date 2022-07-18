package net.minecraft.src;
/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import net.minecraft.client.Minecraft;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class YBR
extends Thread {
    private boolean field_2092bf_Dne = false;
    public File field_d102ba32_Dne;
    private Minecraft field_493682ed_Dne;

    public YBR(File file, Minecraft minecraft) {
        this.field_493682ed_Dne = minecraft;
        this.setName("Resource download thread");
        this.setDaemon(true);
        this.field_d102ba32_Dne = new File(file, "resources/");
        if (!this.field_d102ba32_Dne.exists() && !this.field_d102ba32_Dne.mkdirs()) {
            throw new RuntimeException("The working directory could not be created: " + this.field_d102ba32_Dne);
        }
    }

    @Override
    public void run() {
        try {
            URL uRL = new URL("http://s3.amazonaws.com/MinecraftResources/");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(uRL.openStream());
            NodeList nodeList = document.getElementsByTagName("Contents");
            for (int i = 0; i < 2; ++i) {
                for (int j = 0; j < nodeList.getLength(); ++j) {
                    Node node = nodeList.item(j);
                    if (node.getNodeType() != 1) continue;
                    Element element = (Element)node;
                    String string = element.getElementsByTagName("Key").item(0).getChildNodes().item(0).getNodeValue();
                    long l = Long.parseLong(element.getElementsByTagName("Size").item(0).getChildNodes().item(0).getNodeValue());
                    if (l <= 0L) continue;
                    this.method_75068222_Dne(uRL, string, l, i);
                    if (!this.field_2092bf_Dne) continue;
                    return;
                }
            }
        }
        catch (Exception exception) {
            this.method_2caa41b_Dne(this.field_d102ba32_Dne, "");
            exception.printStackTrace();
        }
    }

    public void method_7c6f6039_FWm() {
        this.field_2092bf_Dne = true;
    }

    private void method_5592a274_Dne(URL uRL, File file, long l) throws IOException {
        byte[] byArray = new byte[4096];
        DataInputStream dataInputStream = new DataInputStream(uRL.openStream());
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        boolean bl = false;
        do {
            int n;
            if ((n = dataInputStream.read(byArray)) < 0) {
                dataInputStream.close();
                dataOutputStream.close();
                return;
            }
            dataOutputStream.write(byArray, 0, n);
        } while (!this.field_2092bf_Dne);
    }

    private void method_2caa41b_Dne(File file, String string) {
        File[] fileArray = file.listFiles();
        for (int i = 0; i < fileArray.length; ++i) {
            if (fileArray[i].isDirectory()) {
                this.method_2caa41b_Dne(fileArray[i], string + fileArray[i].getName() + "/");
                continue;
            }
            try {
                this.field_493682ed_Dne.method_7ccd8a5b_Dne(string + fileArray[i].getName(), fileArray[i]);
                continue;
            }
            catch (Exception exception) {
                this.field_493682ed_Dne.method_230e0120_Dne().method_110c4dc3_FWm("Failed to add " + string + fileArray[i].getName() + " in resources");
            }
        }
    }

    private void method_75068222_Dne(URL uRL, String string, long l, int n) {
        try {
            int n2 = string.indexOf("/");
            String string2 = string.substring(0, n2);
            if (string2.equalsIgnoreCase("sound3") ? n != 0 : n != 1) {
                return;
            }
            File file = new File(this.field_d102ba32_Dne, string);
            if (!file.exists() || file.length() != l) {
                file.getParentFile().mkdirs();
                String string3 = string.replaceAll(" ", "%20");
                this.method_5592a274_Dne(new URL(uRL, string3), file, l);
                if (this.field_2092bf_Dne) {
                    return;
                }
            }
            this.field_493682ed_Dne.method_7ccd8a5b_Dne(string, file);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void method_7a46289a_Dne() {
        this.method_2caa41b_Dne(this.field_d102ba32_Dne, "");
    }
}

