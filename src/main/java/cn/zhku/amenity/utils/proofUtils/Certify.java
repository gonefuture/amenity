package cn.zhku.amenity.utils.proofUtils;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Certify {
	private static BufferedImage bi=null;
	public static BufferedImage getTemplate(){///获取样板图片
		try {
			bi=ImageIO.read(new FileInputStream("D:\\desktop\\byss.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bi;
	}
	public static void Fill(){///进行内容填写
		bi=Certify.getTemplate();
		Graphics2D g2 = (Graphics2D)bi.getGraphics();
		g2.setFont(new Font("黑体", 1, 20)); 
		g2.setColor(new Color(255, 0,0));
		g2.drawString("张三 ", 210, 127); 
		g2.drawString("男 ",340, 127); 
		g2.drawString("计机154 ", 430, 127); 
		g2.drawString("201510224400 ", 590, 127); 
		g2.drawString("13533184779 ", 799, 127); 
		g2.drawString("变了吧哔哩哔哩哔哩哔哩", 250, 230); 
		g2.drawString("2017 年 7 月 24日", 644,444 ); 
		g2.drawString("2017 年 7 月 24日", 644, 610); 
		g2.drawString("2017 年 7 月 24日", 644, 728); 
		g2.drawString("2017 年 7 月 24日", 644, 880); 
		g2.drawString("2017 年 7 月 24日", 644, 1055); 
		
		
		
		   ImageIcon imgIcon = new ImageIcon("D:\\desktop\\logo.jpg");
           // 5、得到Image对象。
           Image img = imgIcon.getImage();
           g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, 0.7f));//0.5为透明度
           // 6、水印图片的位置
//         g.drawImage(img, positionWidth, positionHeight, null);
           g2.drawImage(img, 660, 500, null);
           g2.drawImage(img, 660, 635, null);
           g2.drawImage(img, 660, 770, null);
           g2.drawImage(img, 660, 950, null);
           g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));
           // 7、释放资源
           g2.dispose();
		
		
		
	}
	public static void output(){///完成填写之后将图片输出
		Certify.Fill();
		OutputStream out=null;
		try {
			out = new FileOutputStream("D:\\desktop\\byss_bak.jpg");
			try {
				ImageIO.write(bi, "JPG", out);
				System.out.println("图片完成添加水印图片");
				out.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Certify.output();
	}
}
