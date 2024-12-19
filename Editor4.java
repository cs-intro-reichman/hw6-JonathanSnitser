import java.awt.Color;

public class Editor4 {
    
    public static void main (String[] args) {
        String source = args[0];
        int n = Integer.parseInt(args[1]);
        Color[][] sourceImage = Runigram.read(source);
		Color[][] greyImage = Runigram.grayScaled(sourceImage);
        Color[][] colorImage = Runigram.read(source);
        Runigram.setCanvas(sourceImage);
		Runigram.morph(colorImage, greyImage, n);
    }
}