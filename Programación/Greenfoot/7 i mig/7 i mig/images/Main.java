package main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String palos[]={"oros", "copas", "espadas", "bastos"};
		File input=new File("/Users/alvarobanofos/Documents/DAM/Programacion/7imig/images/naipes.png");
		BufferedImage img=ImageIO.read(input);
		for(int x=0; x<=11*80; x+=80) {
			for(int y=0; y<=3*123; y+=123) {
				BufferedImage subImg=img.getSubimage(x, y, 80, 123);
				File outputfile = new File("/Users/alvarobanofos/Documents/DAM/Programacion/7imig/images/"+palos[y/123]+"-"+((x/80)+1)+".png");
				ImageIO.write(subImg, "png", outputfile);
			}
		}
	}

}
