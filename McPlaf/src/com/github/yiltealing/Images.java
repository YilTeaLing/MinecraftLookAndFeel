package com.github.yiltealing;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import javax.imageio.ImageIO;

public class Images {
    public static BufferedImage load(String imageName) {
        try {
            BufferedImage image = ImageIO.read(new File(imageName));
            BufferedImage img = new BufferedImage(image.getWidth(), image.getHeight(), 2);
            Graphics g = img.getGraphics();
            g.drawImage(image, 0, 0, null);
            g.dispose();
            return img;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static BufferedImage[][] cut(String imageName, int sliceWidth, int sliceHeight) {
        try {
            BufferedImage sheet = ImageIO.read(new File(imageName));
            int xSlices = sheet.getWidth() / sliceWidth;
            int ySlices = sheet.getHeight() / sliceHeight;
            BufferedImage[][] images = (BufferedImage[][]) Array.newInstance(BufferedImage.class, new int[]{xSlices, ySlices});
            for (int x = 0; x < xSlices; x++) {
                for (int y = 0; y < ySlices; y++) {
                    BufferedImage img = new BufferedImage(sliceWidth, sliceHeight, 2);
                    Graphics g = img.getGraphics();
                    g.drawImage(sheet, (-x) * sliceWidth, (-y) * sliceHeight, null);
                    g.dispose();
                    images[x][y] = img;
                }
            }
            return images;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}