package com.cwp.jpy.utils;

import com.cwp.jpy.beans.AppConfigs;
import com.cwp.jpy.sers.UtilServices;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

@Component
public class ExportUtil {

    @Resource
    private AppConfigs appConfigs;
    @Resource
    private UtilServices utilServices;

    public String getHSSFWorkbook(String[] title, String [] keys,
                                        String sheetname, HSSFWorkbook hssfWorkbook, List<Map<String,Object>> list,
                                  Map<String,Object> code){
        String filename = "";
        if(null == hssfWorkbook){
            hssfWorkbook = new HSSFWorkbook();
        }
        HSSFSheet hssfSheet = hssfWorkbook.createSheet(sheetname);
        HSSFRow hssfRow = hssfSheet.createRow(0);
        HSSFCellStyle hssfCellStyle = hssfWorkbook.createCellStyle();
        hssfCellStyle.setAlignment(HorizontalAlignment.CENTER);
        HSSFCell hssfCell = null;
        for (int i=0;i<title.length;i++){
            hssfCell = hssfRow.createCell(i);
            hssfCell.setCellValue(title[i]);
            hssfCell.setCellStyle(hssfCellStyle);
        }
        filename = utilServices.getSerialno()+".xls";
        for(int i=0;i<list.size();i++){
            HSSFRow hssfRow1 = hssfSheet.createRow(i+1);
            Map<String,Object> item = list.get(i);
            for (int j=0;j<keys.length;j++){
                HSSFCell hssfCell1 = hssfRow1.createCell(j);
                hssfCell1.setCellStyle(hssfCellStyle);
                String itemkey = keys[j];
                String itemvalue = StringUtilEx.convertToString(item.get(itemkey));
                Map<String,Object> itemcode = (Map<String, Object>) code.get(itemkey);
                if(null!=itemcode && !itemcode.isEmpty()){
                    itemvalue = (String) itemcode.get(itemvalue);
                }
                hssfCell1.setCellValue(itemvalue);
            }
        }
        File f = new File(appConfigs.getTmpfiledir() +"/"+ filename);
        try {
            FileOutputStream outputStream = new FileOutputStream(f);
            hssfWorkbook.write(outputStream);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return filename;
    }



}
