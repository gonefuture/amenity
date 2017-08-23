package cn.zhku.amenity.utils.proofUtils;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

	/*******************************************************************************
	 * Description: 图片水印工具类 
	 * @author 
	 * @version 1.0
	 */
	public class ImageRemarkUtil {

	    /**
	     * 
	     * @param alpha
	     *            水印透明度
	     * @param positionWidth
	     *            水印横向位置
	     * @param positionHeight
	     *            水印纵向位置
	     */


	    /**
	     * 给图片添加水印图片
	     * 
	     * @param iconPath
	     *            水印图片路径
	     * @param srcImgPath
	     *            源图片路径
	     * @param targerPath
	     *            目标图片路径
	     */
	  

	    /**
	     * 给图片添加水印图片、可设置水印图片旋转角度
	     * 
	     * @param iconPath
	     *            水印图片路径
	     * @param srcImgPath
	     *            源图片路径
	     * @param targerPath
	     *            目标图片路径
	     * @param degree
	     *            水印图片旋转角度
	     */
	    public static void markImageByIcon() {
	        OutputStream out= null;
	        String srcImgPath = "D:\\desktop\\byss.jpg";
	        String targerPath = "D:\\desktop\\byss_bak.jpg";
	        try {
	        	BufferedImage bi = ImageIO.read(new FileInputStream(srcImgPath));
	            // 1、得到画笔对象
	            Graphics2D g = bi.createGraphics();
	            // 4、水印图片的路径 水印图片一般为gif或者png的，这样可设置透明度
	            ImageIcon imgIcon = new ImageIcon(srcImgPath);
	            // 5、得到Image对象。
	            Image img = imgIcon.getImage();
	            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, 0.5f));//0.5为透明度
	            // 6、水印图片的位置
//	            g.drawImage(img, positionWidth, positionHeight, null);
	            g.drawImage(img, 20, 20, null);
	            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));
	            // 7、释放资源
	            g.dispose();
	            // 8、生成图片
	            out = new  FileOutputStream(targerPath);
	            ImageIO.write(bi, "JPG", out);
	            System.out.println("图片完成添加水印图片");
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (null != out)
	                	out.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    public static void main(String[] args) {
	    	ImageRemarkUtil.markImageByIcon();
		}

}
