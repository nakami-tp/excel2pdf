package com.github.caryyu.excel2pdf.uitil;

import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.BaseFont;
import org.apache.poi.hssf.usermodel.HSSFFont;

/**
 * @Author laixiaoxing
 * @Description 设置字体资源
 * @Date 下午11:52 2019/2/18
 */
public class Resource {
    /**
     * 中文字体支持
     */
   protected static BaseFont BASE_FONT_CHINESE;
    static {
        try {
            BASE_FONT_CHINESE = BaseFont.createFont("STSongStd-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            // 搜尋系統,載入系統內的字型(慢)
            FontFactory.registerDirectories();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 將 POI Font 轉換到 iText Font
     * @param font
     * @return
     */
    public static Font getFont(HSSFFont font) {
    	try {
//  	com.itextpdf.text.Font iTextFont =FontFactory.getFont(font.getFontName(), BaseFont.IDENTITY_H, BaseFont.EMBEDDED,font.getFontHeightInPoints());

//            BaseFont baseFont = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
//            Font iTextFont = new Font(baseFont);

            Font iTextFont =FontFactory.getFont("STSong-Light",  "UniGB-UCS2-H", BaseFont.EMBEDDED,font.getFontHeightInPoints());
    		return iTextFont;
        } catch (Exception e) {
            e.printStackTrace();
        }
    	return null;
    }
}